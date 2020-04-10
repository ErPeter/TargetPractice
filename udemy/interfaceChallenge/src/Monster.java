import java.util.ArrayList;
import java.util.List;

public class Monster implements ISavable{
    private String name;
    private String type;
    private int health;
    private int strength;


    public Monster(String name, int health, int strength) {
        this.name = name;
        this.type = "arial";
        this.health = health;
        this.strength = strength;
    }

    @Override
    public List<String> write() {

        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, this.type);
        values.add(2, String.valueOf(this.health));
        values.add(3, String.valueOf(this.strength));

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.type = savedValues.get(1);
            this.health = Integer.parseInt(savedValues.get(2));
            this.strength = Integer.parseInt(savedValues.get(3));
        }else {
            System.out.println("There is not any saved values");
        }
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", health=" + health +
                ", strength=" + strength +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
