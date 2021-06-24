package marsRover;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    private Vector vector;
    private MarsRover marsRover;

    @Test
    public void rovesOnTerrainBasedOnCommands() {

        givenRoverAt(3, 1, "N");

        for (char command : "MMRMMRMRRM".toCharArray()) {
            vector = marsRover.rove(command);
        }

        roverWillBeAt( 5, 3, "N");
    }

    @Test
    public void movesNorthward() {
        givenRoverAt(5,3, "N");

        vector = marsRover.rove('M');

        roverWillBeAt( 5, 4, "N");
    }

    @Test
    public void turnsLeftFromNorth() {
        givenRoverAt(5,5 , "N");
        vector = marsRover.rove('L');
        roverWillBeAt( 5, 5, "W");
    }

    @Test
    public void turnsRightFromNorth() {
        givenRoverAt(5,5 , "N");
        vector = marsRover.rove('R');
        roverWillBeAt( 5, 5, "E");
    }

    @Test
    public void movesEastward() {
        givenRoverAt(5,3, "E");
        vector = marsRover.rove('M');
        roverWillBeAt( 6, 3, "E");
    }

    @Test
    public void turnsLeftFromEast() {
        givenRoverAt(5,5 , "E");
        vector = marsRover.rove('L');
        roverWillBeAt(5, 5, "N");
    }

    @Test
    public void turnsRightFromEast() {
        givenRoverAt(5,5 , "E");
        vector = marsRover.rove('R');
        roverWillBeAt( 5, 5, "S");
    }

    @Test
    public void movesSouthWard() {
        givenRoverAt(5,3, "S");

        vector = marsRover.rove('M');

        roverWillBeAt( 5, 2, "S");
    }

    @Test
    public void turnsLeftFromSouth() {
        givenRoverAt(5,5 , "S");
        vector = marsRover.rove('L');
        roverWillBeAt(5, 5, "E");
    }

    @Test
    public void turnsRightFromSouth() {
        givenRoverAt(5,5 , "S");
        vector = marsRover.rove('R');
        roverWillBeAt(5, 5, "W");
    }

    @Test
    public void movesWestWard() {
        givenRoverAt(5,3, "W");

        vector = marsRover.rove('M');

        roverWillBeAt(4, 3, "W");
    }

    @Test
    public void turnsLeftFromWest() {
        givenRoverAt(5,5 , "W");
        vector = marsRover.rove('L');
        roverWillBeAt( 5, 5, "S");
    }

    @Test
    public void turnsRightFromWest() {
        givenRoverAt(5,5 , "W");
        vector = marsRover.rove('R');
        roverWillBeAt( 5, 5, "N");
    }

    private void roverWillBeAt(int x, int y, String direction) {
        Assert.assertEquals(new Vector(new Point(x,y), direction), vector);
    }

    private void givenRoverAt(int x, int y, String direction) {
        vector = new Vector(new Point(x,y), direction);
        MarsRover marsRover = new MarsRover(vector);
    }
}