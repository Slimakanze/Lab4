/**
 * Created by Глеб on 14.12.2017.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException, AmountLightException {
        DrPilulkin drPilulkin = new DrPilulkin();
        Znayka znayka = new Znayka();
        People people = new People();
        Science science = new Science();
        drPilulkin.feels();
        znayka.say();
        znayka.giveOrder();
        znayka.goBack();
        people.imagine();
        people.statment();
        try{
            people.amountLight();
        }
        catch (AmountLightException ex){
            ex.getDecision();
        }
        science.setScience();
    }
}
