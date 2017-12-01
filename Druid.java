import java.util.Arrays;

public class Druid extends Figure{

    public Druid (String nameX){
        super(nameX, 70, 100, 60);
    }

    @Override
    public String toString() {
        return "Druid{" +
                "toolTab=" + Arrays.toString(toolTab) +
                ", alive=" + alive +
                ", b_attack=" + b_attack +
                ", b_defense=" + b_defense +
                ", b_health=" + b_health +
                ", name='" + name + '\'' +
                '}';
    }
}
