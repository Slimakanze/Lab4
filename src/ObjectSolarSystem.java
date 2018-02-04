/**
 * Created by Глеб on 16.12.2017.
 */
public interface ObjectSolarSystem {
    enum Time{
        day(10, "день"),
        night(14, "ночь");
        private double timeLong;
        private String time;
        Time(double timeLong, String time){
            this.timeLong=timeLong;
            this.time=time;
        }

        public double getTimeLong() {
            return timeLong;
        }

        public String getTime() {
            return time;
        }
    }
}
