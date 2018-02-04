/**
 * Created by Глеб on 16.12.2017.
 */
public class ProfessorZvezdochkin extends Person implements Characters {
    ProfessorZvezdochkin(String cases){
        super("Профессор Звёздочкин");
        this.cases=cases;
    }
    private String cases;
    private GoBack goBack = GoBack.values()[(int)(Math.random()*GoBack.values().length)];
    @Override
    public void xRay(){
        int damage=(int)(Math.random()*130);
        this.setHealth(this.getHealth()-damage);
        System.out.println(this.getName()+" подвергся космическим лучам.");
        if (this.getHealth()<=0){
            System.out.println(this.getName()+" умер от космических лучей.");
        }
        else{
            System.out.println(this.getName()+" выжил.");
        }
    }
    @Override
    public void goOutCave(){
        int chance=(int)(Math.round(Math.random()));
        switch (chance){
            case 0:
                System.out.println(this.getName()+" послушал распоряжения. ");
                break;
            case 1:
                System.out.println(this.getName()+" ослушал распоряжение. ");
                this.xRay();
                break;
        }
    }
    @Override
    public void goBack(){
        if ((goBack==GoBack.YES)&&(this.getHealth()>=0)){
            System.out.print(this.cases+".");
        }
    }

    public GoBack getGoBack() {
        return goBack;
    }
    @Override
    public String toString(){
        return "Имя: "+this.getName()+" Количество жизней: "+this.getHealth()+" Класс: "+this.getClass();
    }
}
