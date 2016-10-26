import java.awt.*;

/**
 * Created by curti_000 on 10/25/2016.
 */
public class Bear extends Critter {

    private boolean boolBear;
    private int count;

    // constructor
    public Bear(boolean bearClaw) {
        this.count = 0;
        this.boolBear = bearClaw;
    }
    // returns color given boolBear
    public Color getColor() {
        if (this.boolBear) {
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }
    // returns string value for bear
    public String toString() {
        this.count = this.count + 1;
        if (count % 2 == 1) {
            return "/";
        } else {
            return "\\";
        }
    }
    // returns the move to be made by the bear
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}