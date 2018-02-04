import static java.lang.System.out;

/**
 * Created by Глеб on 14.12.2017.
 */
public class Neznayka extends Person {
    enum HealthStatus{
        больной(" чувствует себя очень плохо "),
        здоровый(" чувствует себя очень хорошо."),
        хворает(" чувствет, что приболел.");
        private String feels;

        public String getFeels() {
            return feels;
        }

        HealthStatus(String feels){this.feels=feels;}
        }
    private boolean checkHelmet=false;
    private boolean checkCostume=false;
    private HealthStatus healthStatus;
    Neznayka(){super("Незнайка");
        this.healthStatus=HealthStatus.values()[(int)(Math.random()*HealthStatus.values().length)];
    }
    public void spaceSuitReady() throws InterruptedException {
        boolean[] checkHelmet = new boolean[1];
        boolean[] checkCostume = new boolean[1];
        class SpaceSuit{
            private int status;
            private boolean statusHelmet;
            private boolean statusCostume;

            public String checkHelmet() throws InterruptedException {
                this.status=(int)(Math.random()*100);
                if(this.status>=70){
                    this.statusHelmet=true;
                }
                else this.statusHelmet=false;
                Thread.sleep(1000);
                out.println("Система начала проверку работоспособности шлема: ");
                Thread.sleep(1000);
                out.print("Loading");
                for (int i=0;i<3;i++){
                    Thread.sleep(2000);
                    out.print(".");
                }
                out.println();
                checkHelmet[0] =true;
                if(this.statusHelmet){
                    return "Шлем в полном порядке";
                }
                else if (this.status<25) return "В шлеме пробоина. Больше не пригоден.";
                else if (this.status<50) return "Следует отдать шлем мастеру на проверку.";
                else return "Следует прочистить антену.";
            }
            public String checkCostume() throws InterruptedException{
                this.status=(int)(Math.random()*100);
                if(this.status>=50){
                    this.statusCostume=true;
                }
                else this.statusCostume=false;
                Thread.sleep(1000);
                out.println("Система начала проверку работоспособности костюма: ");
                Thread.sleep(1000);
                out.print("Loading");
                for (int i=0;i<3;i++){
                    Thread.sleep(2000);
                    out.print(".");
                }
                out.println();
                checkCostume[0] =true;
                if(this.statusCostume){
                    return "Костюм в полном порядке";
                }
                else if (this.status<15) return "Следует провести капитальный ремонт костюма";
                else if (this.status<35) return "Следует сдать костюм мастеру на проверку";
                else return "Следует прочистить костюм. Возможно засорение микросхем";
            }
        }
        SpaceSuit spaceSuit = new SpaceSuit();
        System.out.println(spaceSuit.checkHelmet());
        Thread.sleep(1000);
        System.out.println(spaceSuit.checkCostume());
        this.checkHelmet=checkHelmet[0];
        this.checkCostume=checkCostume[0];
    }
    public void takeOffSuit() throws InterruptedException {
        if (this.checkCostume&&this.checkHelmet){
            String conclusion;
            Thread.sleep(1000);
            System.out.println(this.getName()+" снимает скафандр.");
            for (int i=0; i<(int)(Math.random()*10); i++){
                Thread.sleep(800);
                System.out.println(i+1);
            }
            System.out.println(this.getName()+" снял скафандр.");
        }
        else if (this.checkHelmet){
            Thread.sleep(800);
            System.out.println("Необходимо проверить костюм");
        }
        else if (!this.checkHelmet&&!this.checkCostume){
            Thread.sleep(800);
            System.out.println("Необходимо проверить весь скафандр");
        }
        else {
            Thread.sleep(800);
            System.out.println("Необходимо проверить шлем");
        }
    }

    public boolean isCheckHelmet() {
        return checkHelmet;
    }

    public boolean isCheckCostume() {
        return checkCostume;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }
    @Override
    public String toString(){
        return "Имя: "+this.getName()+" Количество жизней: "+this.getHealth()+" Класс: "+this.getClass();
    }
}
