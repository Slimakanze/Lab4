/**
 * Created by Глеб on 16.12.2017.
 */
public class Moon extends SpaceObjects implements ObjectSolarSystem{
    Moon(){
        super("Луна");
        this.timeNow=Math.random()*24;
    }
    enum Cases{
        именительный("Луна"),
        родительный("Луну"),
        дательный("Луны"),
        винительный("Луну"),
        творительный("Луной"),
        предложный("Луне");
        private String name;

        public String getName() {
            return name;
        }
        Cases(String name){
            this.name=name;
        }
    }
    public Time timeMoon(){
        if (this.timeNow<= Time.night.getTimeLong()){
            return Time.night;
        }
        else return Time.day;
    }
    private double timeNow;
    static double radiusMoon=1737.1;

    public class LightMoon{
        public void lightMoon(){
            if (Moon.this.timeMoon()==Time.day){
                System.out.print(Moon.this.getName()+" освещается Солнцем.");
            }
            else {
                System.out.print(Moon.this.getName()+" освещается Землёй.");
            }
        }
        public boolean lighting(){
            int random = (int)(Math.round(Math.random()));
            if (Moon.this.timeMoon()==Time.day){
                switch (random){
                    case 0:
                        System.out.print(" когда на Луне "+Moon.this.timeMoon().getTime()+", там очень светло и всё видно.");
                        return true;
                    case 1:
                        System.out.print(" когда на Луне "+Moon.this.timeMoon().getTime()+", там темно и ничего не видно.");
                        return false;
                    default:
                        return false;
                }
            }
            else{
                switch (random){
                    case 0:
                        System.out.print(" когда на Луне "+Moon.this.timeMoon().getTime()+", там очень светло и всё видно.");
                        return false;
                    case 1:
                        System.out.print(" когда на Луне "+Moon.this.timeMoon().getTime()+", там очень темно и ничего не видно.");
                        return true;
                    default:
                        return false;
                }
            }
        }
    }
    public void imagineEarth(Earth earth){
        if (Earth.radiusEarth>Moon.radiusMoon){
            System.out.print(" "+earth.getName()+" с Луны выглядит, как большой круглый поднос. ");
        }
        else System.out.println("Да вы издеваетесь. Ещё скажите, что Земля плоская");
    }
    @Override
    public String toString(){
        return "Класс: "+this.getClass()+" Имя: "+this.getName()+" Радиус: "+this.radiusMoon+"км"+" Время: "+this.timeMoon().getTime();
    }
}
