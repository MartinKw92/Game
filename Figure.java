
import java.util.Arrays;

public class Figure {

    protected  Tool [] toolTab;
    protected boolean alive;
    protected int b_attack;
    protected int b_defense;
    protected int b_health;
    protected String name;

    public Figure (String xname, int ap, int hp, int dp){
            alive = true;
            toolTab = new Tool[3];
            b_attack = ap;
            b_defense = dp;
            b_health = hp;
            name = xname;
    }

    public Tool[] getToolTab() {
        return toolTab;
    }

    public void setToolTab(Tool[] toolTab) {
        this.toolTab = toolTab;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getAP() {
        return b_attack;
    }

    public void setAP(int b_attack) {
        this.b_attack = b_attack;
    }

    public int getDP() {
        return b_defense;
    }

    public void setDP(int b_defense) {
        this.b_defense = b_defense;
    }

    public int getHP() {
        return b_health;
    }

    public void setHP(int b_health) {
        this.b_health = b_health;
        if (this.b_health <= 0) {
            alive = false;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public int getFinalAP(){
        int x = 0;
        for (Tool t: toolTab){
            if(t != null)
                x += t.getAp();

        }
        return b_attack+x;

     }
    public int getFinalDP() {
        int x = 0;
        for (Tool t : toolTab) {
            if(t != null)
                x += t.getDp();

        }
        return b_defense + x;
    }


    @Override
    public String toString() {
        return "Figure{" +
                "toolTab=" + Arrays.toString(toolTab) +
                ", alive=" + alive +
                ", b_attack=" + b_attack +
                ", b_defense=" + b_defense +
                ", b_health=" + b_health +
                ", name='" + name + '\'' +
                '}';
    }

    public void addTool (Tool t, int idX){
        toolTab[idX]=t;
        b_health += t.getHp();


    }

    public int getToolSize(){
        int c = 0;
        for(int i=0; i<toolTab.length; i++){
            if (toolTab[i] !=null){
                c++;
            }
        }
        return c;

    }
    public static void fight(Figure a, Figure b ){
        int r = (int)(Math.random()*2);
        if(r > 1){
            Figure c=a;
            a=b;
            b=c;
        }
        int k=0;
        while( a.isAlive() && b.isAlive()){
            //System.out.println("fight");
            if(k%2 == 1){
                int x = a.getHP();
                x+=a.getFinalDP();
                x-=b.getFinalAP();
                a.setHP(x);




            }
            else{
                int x = b.getHP();
                x += a.getFinalAP();
                x -= b.getFinalDP();
                b.setHP(x);

            }
            k++;
        }

    }
}
