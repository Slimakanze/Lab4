/**
 * Created by Глеб on 16.12.2017.
 */
public class People {
    Moon moon = new Moon();
    Moon.LightMoon lightMoon= moon.new LightMoon();
    Earth earth = new Earth();
    Earth.LightEarth lightEarth = earth.new LightEarth();
    public void imagine(){
        System.out.print("Некоторые вооброжают, что ");
        this.doesItTrue();
    }
    public void doesItTrue(){
        if (lightMoon.lighting()){
            System.out.print(" И это правда. ");
        }
        else {
            System.out.print(" Но это не правда. ");
        }
    }
    public void statment(){
        System.out.print("Точно также, как ");
        lightEarth.lightEarth();
        System.out.print(", ");
        lightMoon.lightMoon();
    }
    public void amountLight() throws AmountLightException {
        if (Moon.radiusMoon>=Earth.radiusEarth){
            throw new AmountLightException();
        }
        else{
            System.out.print(" Но поскольку земной шар значительно больше лунного, то и света получается больше.");
            earth.imagineMoon(moon);
            moon.imagineEarth(earth);
        }

    }

}
