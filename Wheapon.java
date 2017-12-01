public class Wheapon extends Tool {

    public Wheapon(int ap){
        super(ap, 0, 0);
    }

    @Override
    public String toString() {
        return "Wheapon{" +
                "hp=" + hp +
                ", dp=" + dp +
                ", ap=" + ap +
                '}';
    }
}
