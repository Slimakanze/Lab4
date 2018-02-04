/**
 * Created by Глеб on 17.12.2017.
 */
public enum ActionsOnMoon {
    read(" читать,"),
    write(" писать,"),
    draw(" рисовать,"),
    any(" заниматься другими делами.");
    private String name;

    public String getName() {
        return name;
    }
    ActionsOnMoon(String name){
        this.name = name;
    }
}
