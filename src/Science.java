/**
 * Created by Глеб on 17.12.2017.
 */
public class Science {
    private String name;
    Science(){
        this.name = "Наука";
    }
    Sun sun = new Sun();
    public void setScience(){
        System.out.print(" "+this.name+" установила, что ");
        sun.lightSun();
        sun.whatItMeans();
    }
    @Override
    public String toString(){
        this.setScience();
        return "Имя класса: "+this.getClass()+" Имя: "+this.name;
    }
}
