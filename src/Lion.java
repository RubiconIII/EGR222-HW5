import java.awt.*;

/**
 * Created by curti_000 on 10/25/2016.
 */
public class Lion extends Critter {

        // private variables to measure the count of the instances and the previous color of the lion
        private int count;
        private Color givenCol;

        // constructor
        public Lion() {
            this.count = 0;
        }
        // returns Lion color
        public Color getColor() {
            this.count = this.count + 1;
            if ((this.count - 1) % 3 == 0) {
                Color randomColor = getRandomColor();
                this.givenCol = randomColor;
                return randomColor;
            } else {
                return this.givenCol;
            }
        }

        // returns Lion String
        public String toString() {
            return "L";
        }

        // returns the move to be made by the lion
        public Action getMove(CritterInfo info) {
            if (info.getFront() == Neighbor.OTHER) {
                return Action.INFECT;
            } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
                return Action.LEFT;
            } else if (info.getFront() == Neighbor.SAME) {
                return Action.RIGHT;
            } else {
                return Action.HOP;
            }
        }

        // returns a random color (either red, blue or green)
        private Color getRandomColor() {
            double rand = Math.random();
            if (rand < (1.0 / 3)) {
                return Color.RED;
            } else if (rand > (2.0 / 3)) {
                return Color.GREEN;
            } else {
                return Color.BLUE;
            }
        }
    }

