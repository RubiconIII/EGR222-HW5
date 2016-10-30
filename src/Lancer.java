import java.awt.*;

/**
 * Created by curti_000 on 10/27/2016.
 */
public class Lancer extends Critter {

    private int count;
    private String altName;
    private final String[] titles = {"Lancer", "Nation",};
    private int index;

    // lancer constructor
    public Lancer() {
        this.count = 0;
        this.index = 0;
    }

    // returns the string value of the Lancer
    public String toString(){
            this.count = this.count + 1;
            if ((this.count - 1) % 10 == 0) {
                if (this.index == 2) {
                    this.index = 0;
                }
                this.index = this.index + 1;
                return titles[index - 1].toString();
            } else {
                this.altName = titles[index - 1];
            }
            return this.altName;
        }


    // Color of lancer changes from blue to yellow according to school colors
    public Color getColor() {
        this.count = this.count + 1;
        if ((this.count - 1) % 10 == 0) {
            if (this.index == 2) {
                this.index = 0;
            }
            this.index = this.index + 1;
            return Color.BLUE;
        } else {
            this.altName = titles[index - 1];
        }
        return Color.YELLOW;
    }


    // returns the move to be made by the Lancer
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}


