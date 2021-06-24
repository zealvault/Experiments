package marsRover;

import java.util.Objects;

public class Vector {

    final Point point;
    final String direction;

    public Vector(Point point, String direction) {

        this.point = point;
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector vector = (Vector) o;
        return Objects.equals(point, vector.point) &&
                Objects.equals(direction, vector.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(point, direction);
    }

    public Vector translate(int dx, int dy) {
        Point point = this.point.translate(dx, dy);
        return new Vector(point, direction);
    }

    @Override
    public String toString() {
        return String.format("%d %d", point.x, point.y, direction);
    }
}
