/**
 * Created by Глеб on 16.12.2017.
 */
public class Znayka extends Person implements Characters{
    Znayka(){
        super("Знайка");
    }
    Fucsya fucsya = new Fucsya("Фуксии");
    Seledochka seledochka = new Seledochka("Селёдочки");
    ProfessorZvezdochkin professorZvezdochkin = new ProfessorZvezdochkin("профессора Звёздочкина");
    public void say(){
        System.out.print(this.getName()+" сказал: ");
    }
    public void giveOrder(){
        System.out.println(this.getName()+" отдал распоряжение никому не выходить.");
        fucsya.goOutCave();
        seledochka.goOutCave();
        professorZvezdochkin.goOutCave();
    }
    @Override
    public void goBack(){
        System.out.print(this.getName()+" отправился в обратный путь");
        if (((fucsya.getGoBack()==GoBack.NO)||(fucsya.getHealth()<=0))&&((seledochka.getGoBack()==GoBack.NO)||(seledochka.getHealth()<=0))&&((professorZvezdochkin.getGoBack()==GoBack.NO)||(professorZvezdochkin.getHealth()<=0))){
            System.out.print(" ни с кем.");
        }
        else{
            System.out.print(" в сопровождении ");
            fucsya.goBack();
            seledochka.goBack();
            professorZvezdochkin.goBack();
        }
    }
    @Override
    public void xRay(){
        int damage=(int)(Math.random()*100);
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
                System.out.print(this.getName()+" послушал распоряжения. ");
                break;
            case 1:
                System.out.print(this.getName()+" ослушал распоряжение. ");
                this.xRay();
                break;
        }
    }
    @Override
    public String toString(){
        return "Имя: "+this.getName()+" Количество жизней: "+this.getHealth()+" Класс: "+this.getClass();
    }
}
