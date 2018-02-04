/**
 * Created by Глеб on 16.12.2017.
 */
public class Fucsya extends Person implements Characters{
    Fucsya(String cases){
        super("Фуксия");
        this.cases=cases;
    }
    private String cases;
    private GoBack goBack = GoBack.values()[(int)(Math.random()*GoBack.values().length)];
    @Override
    public void xRay(){
        int damage=(int)(Math.random()*120);
        this.setHealth(this.getHealth()-damage);
        System.out.println(this.getName()+" подверглась космическим лучам.");
        if (this.getHealth()<=0){
            System.out.println(this.getName()+" умерла от космических лучей.");
        }
        else{
            System.out.println(this.getName()+" выжила.");
        }
    }
    @Override
    public void goOutCave(){
        int chance=(int)(Math.round(Math.random()));
        switch (chance){
            case 0:
                System.out.println(this.getName()+" послушалась распоряжения. ");
                break;
            case 1:
                System.out.println(this.getName()+" ослушалась распоряжения. ");
                this.xRay();
                break;
        }
    }
    @Override
    public void goBack(){
        if ((goBack==GoBack.YES)&&(this.getHealth()>=0)){
            System.out.print(this.cases+", ");
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
