/**
 * Created by Глеб on 14.12.2017.
 */
public abstract class Person {
    private String name;
    private int health=100;
    Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
