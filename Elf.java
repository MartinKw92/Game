import java.util.Arrays;

public class Elf extends Figure{

    public Elf (String nameY){
        super(nameY, 120, 100, 20);
    }

    @Override
    public String toString() {
        return "Elf{" +
                "toolTab=" + Arrays.toString(toolTab) +
                ", alive=" + alive +
                ", b_attack=" + b_attack +
                ", b_defense=" + b_defense +
                ", b_health=" + b_health +
                ", name='" + name + '\'' +
                '}';
    }
}
