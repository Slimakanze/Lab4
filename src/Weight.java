/**
 * Created by Глеб on 17.12.2017.
 */
public enum Weight {
    тяжёлый(" тяжёлого "),
    лёгкий(" лёгкого "),
    тяжёленький(" среднего по тяжести ");
    private String cases;
    Weight(String cases){
        this.cases=cases;
    }

    public String getCases() {
        return cases;
    }
}
