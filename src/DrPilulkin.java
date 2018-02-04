import com.sun.org.apache.xml.internal.dtm.ref.DTMDocumentImpl;

/**
 * Created by Глеб on 14.12.2017.
 */
public class DrPilulkin extends Person {
    DrPilulkin(){
        super("Доктор Пилюлькин");
    }
    private String conclusion="";
    Neznayka neznayka = new Neznayka();
    private Weight weight=Weight.values()[(int)(Math.random()*Weight.values().length)];
    public void feels() throws InterruptedException {
        Thread.sleep(1000);
        System.out.print(this.getName()+" сказал, что "+neznayka.getName()+" чувствует себя очень плохо,");
        System.out.println(" поэтому его нужно немедля отправить в ракету, где он может освободится от"+weight.getCases()+"скафандра");
        if (neznayka.getHealthStatus()!= Neznayka.HealthStatus.больной) throw new  DrPilulkinException(neznayka);
        else {
            System.out.print(neznayka.getName()+neznayka.getHealthStatus().getFeels());
            this.send();
        }
    }
    public void send() throws InterruptedException {
        System.out.println(neznayka.getName()+" отправился в ракету.");
        neznayka.takeOffSuit();
        neznayka.spaceSuitReady();
        neznayka.takeOffSuit();
    }
    @Override
    public String toString(){
        return "Имя: "+this.getName()+" Количество жизней: "+this.getHealth()+" Класс: "+this.getClass();
    }

}
