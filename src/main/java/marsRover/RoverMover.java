package marsRover;

public class RoverMover {

    public void run(){
        MarsRover marsRover = new MarsRover( new Vector(new Point(3,3),"E"));
        Vector vector = null;

        String commands = "MMRMMRMRRM";

        for (char command : commands.toCharArray()) {
            vector = marsRover.rove(command);
        }

    }
}
