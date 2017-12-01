public class Armor extends Tool {

    public Armor(int dp){
        super(0, dp, 0);
    }

    @Override
    public String toString() {
        return "Armor{" +
                "hp=" + hp +
                ", dp=" + dp +
                ", ap=" + ap +
                '}';
    }
}
