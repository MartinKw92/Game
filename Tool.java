public class Tool {

    protected int hp;
    protected int dp;
    protected int ap;

    public Tool(int apx, int dpx, int hpx) {
        ap = apx;
        dp = dpx;
        hp = hpx;

    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDp() {
        return dp;
    }

    public void setDp(int dp) {
        this.dp = dp;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "hp=" + hp +
                ", dp=" + dp +
                ", ap=" + ap +
                '}';
    }

}
