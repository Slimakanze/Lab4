/**
 * Created by Глеб on 16.12.2017.
 */
public class Earth extends SpaceObjects implements ObjectSolarSystem{
    Earth(){
        super("Земля");
        this.timeNow=Math.random()*24;
    }
    enum Cases{
        именительный("Земля"),
        родительный("Землю"),
        дательный("Земле"),
        винительный("Землю"),
        творительный("Землей"),
        предложный("Земле");
        private String name;

        public String getName() {
            return name;
        }
        Cases(String name){
            this.name=name;
        }
    }
    public Time timeEarth(){
        if (Earth.this.timeNow<= Time.day.getTimeLong()){
            return Time.day;
        }
        else return Time.night;
    }
    private double timeNow;
    static double radiusEarth=6371.0;

    public class LightEarth{
        public void lightEarth(){
            if (Earth.this.timeEarth()==Time.day){
                System.out.print(Earth.this.getName()+" освещается Солнцем");
            }
            else {
                System.out.print(Earth.this.getName()+" освещается Луной");
            }
        }
    }
    public void imagineMoon(Moon moon){
        if (Moon.radiusMoon<Earth.radiusEarth) {
            System.out.print("Если Луна с Земли кажется нам размером с небольшую тарелку.");
        }
        else System.out.println("Повторяюсь, ну не может быть луна меншьше Земли");
    }
    @Override
    public String toString(){
        return "Класс: "+this.getClass()+" Имя: "+this.getName()+" Радиус: "+this.radiusEarth+"км"+" Время: "+this.timeEarth().getTime();
    }
}