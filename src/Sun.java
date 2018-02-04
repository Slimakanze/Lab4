/**
 * Created by Глеб on 16.12.2017.
 */
public class Sun extends SpaceObjects {
    Sun(){
        super("Солнце");
    }
    private int factor=(int)(Math.random()*100+40);
    enum Cases{
        именительный("Солнце"),
        родительный("Солнца"),
        дательный("Солнцу"),
        винительный("Солнце"),
        творительный("Солнцем"),
        предложный("Солнце");
        private String name;

        public String getName() {
            return name;
        }
        Cases(String name){
            this.name=name;
        }
    }
    static double radiusSun=695514;
    public void lightSun(){
        System.out.print("свет "+Cases.родительный.getName()+", отражаемый "+ Earth.Cases.творительный.getName()+", освещает раз в "+this.factor+" сильней, чем тот свет, которым "+Moon.Cases.именительный.getName()+" освещает "+Earth.Cases.винительный.getName());
    }
    public void whatItMeans(){
        System.out.print(" Это значит, что в той части "+Moon.Cases.дательный.getName()+" с которой видна "+Earth.Cases.именительный.getName()+", ночью");
        if (this.factor<=90){
            System.out.print(" на "+Moon.Cases.предложный.getName()+" слишком темно. Нелзя: ");
            for(int i=0; i<ActionsOnMoon.values().length; i++){
                System.out.print(ActionsOnMoon.values()[i].getName());
            }
        }
        else{
            System.out.print(" можно спокойно ");
            for(int i=0; i<ActionsOnMoon.values().length; i++){
                System.out.print(ActionsOnMoon.values()[i].getName());
            }
        }
    }
    @Override
    public String toString(){
        return "Класс: "+this.getClass()+" Имя: "+this.getName()+" Радиус: "+this.radiusSun+"км"+" Коэффициент освещения: "+this.factor;
    }
}
