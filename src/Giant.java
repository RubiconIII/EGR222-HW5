import java.awt.*;

/**
 * Created by curti_000 on 10/25/2016.
 */
public class Giant extends Critter {

    private int count;
    private String altName;
    private final String[] titles = {"fee", "fie", "foe", "fum"};
    private int index;

    // constructor
    public Giant() {
        this.count = 0;
        this.index = 0;
    }

    // returns Giant color
    public Color getColor() {
        return Color.GRAY;
    }

    // returns Giant string
    public String toString() {
        this.count = this.count + 1;
        if ((this.count - 1) % 6 == 0) {
            if (this.index == 4) {
                this.index = 0;
            }
            this.index = this.index + 1;
            return titles[index - 1].toString();
        } else {
            this.altName = titles[index - 1];
        }
        return this.altName;
    }

    // returns Giant move instructions
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() != Neighbor.EMPTY) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}