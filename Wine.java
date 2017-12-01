public class Wine extends Tool {

    public Wine(int hp){
        super(0, 0, hp);
    }

    @Override
    public String toString() {
        return "Wine{" +
                "hp=" + hp +
                ", dp=" + dp +
                ", ap=" + ap +
                '}';
    }
}
