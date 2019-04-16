package homework.num5OOP.GPS;

import java.util.Arrays;

public class Coordinates {
    private int[] coordinate;

    public Coordinates(int[] coordinate) {
        this.coordinate = coordinate;
    }
    public Coordinates() {
        this.coordinate = new int[]{0,0};
    }

    public int[] getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(int[] coordinate) {
        this.coordinate = coordinate;
    }

    public double getX1(){
        return coordinate[0];
    }

    public double getY1(){
        return coordinate[1];
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "coordinate=" + Arrays.toString(coordinate) +
                '}';
    }
}
