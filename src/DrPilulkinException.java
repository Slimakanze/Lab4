/**
 * Created by Глеб on 16.12.2017.
 */
public class DrPilulkinException extends RuntimeException {
    public DrPilulkinException(Neznayka neznayka){
        System.out.println("Доктор Пилюлькин ошибся с диагнозом: "+neznayka.getName()+neznayka.getHealthStatus().getFeels());
    }
}
