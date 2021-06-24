package marsRover;

/**
 * This program implements a mission critical application that God alone know its real intent.
 * It feeds me, a sole reason for me to stick to this project. Long live such guess-good-for-what-projects.
 *
 * @author Chitti Bush
 * @version 1.0
 * @since 2000-03-31
 */

public class MarsRover {

    private final String NORTH = "N";
    private final String EAST = "E";
    private final String WEST = "W";
    private final String SOUTH = "S";
    private static final char LEFT = 'L';
    private static final char RIGHT = 'R';
    private static final char MOVE = 'M';
    private static String direction = "";

    Vector vector;

    public MarsRover(Vector vector) {
        this.vector = vector;
    }

    Vector rove(char command) {

        if (direction.equalsIgnoreCase(NORTH)) {
            switch (command) {
                case LEFT:
                    direction = WEST;
                    break;
                case RIGHT:
                    direction = EAST;
                    break;
                case MOVE:
                    vector = vector.translate(0, 1);
                    break;
            }
        } else if (direction.equalsIgnoreCase(EAST)) {
            switch (command) {
                case LEFT:
                    direction = NORTH;
                    break;
                case RIGHT:
                    direction = SOUTH;
                    break;
                case MOVE:
                    vector = vector.translate(1, 0);
                    break;
            }
        } else if (direction.equalsIgnoreCase(SOUTH)) {
            switch (command) {
                case LEFT:
                    direction = EAST;
                    break;
                case RIGHT:
                    direction = WEST;
                    break;
                case MOVE:
                    vector = vector.translate(0, -1);
                    break;
            }
        } else if (direction.equalsIgnoreCase(WEST)) {
            switch (command) {
                case LEFT:
                    direction = SOUTH;
                    break;
                case RIGHT:
                    direction = NORTH;
                    break;
                case MOVE:
                    vector = vector.translate(-1, 0);
                    break;
            }
        }
        return vector;
    }

}