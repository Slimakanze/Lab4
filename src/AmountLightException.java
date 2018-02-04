/**
 * Created by Глеб on 16.12.2017.
 */
public class AmountLightException extends Exception {
    AmountLightException(){
        System.out.println();
        System.out.println("Как так полуичлось, что Луна больше земли?");
    }

    public void getDecision(){
        System.out.println("Не должно быть так! Исправьте");
    }
}
