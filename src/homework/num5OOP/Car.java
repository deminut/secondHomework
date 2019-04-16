package homework.num5OOP;

import java.util.Arrays;

public class Car {

    private String nameCar;
    private int[] coordinate=new int[2];
    private double distance;

    Car() {  //новая акционная машина из салона
        nameCar="Ваз";
        distance=0;
    }

    Car(String nameCar) {  //новая машина (не акционная) из салона
        this.nameCar=nameCar;
        distance=0;
    }

    Car(String nameCar, float distance) {    //старая машина из салона
        this.nameCar = nameCar;
        this.distance = distance;

    }

    Car(String nameCar, int[] coordinate) {  //новая машина не из салона
        this.nameCar = nameCar;
        this.coordinate = coordinate;
    }

    Car(String nameCar, int[] coordinate, float distance) {  //старая машина не из салона
        this.nameCar = nameCar;
        this.coordinate = coordinate;
        this.distance = distance;
    }

    private void traveled(int x, int y){    //изменение дистанции при вводе новых координат
        double x1=coordinate[0];
        double y1=coordinate[1];
        distance=distance+Math.sqrt((Math.pow((x-x1),2)+Math.pow((y-y1),2)));
    }

    public String getNameCar() {
        return nameCar;
    }

    public int[] getCoordinate() {
        return coordinate;
    }

    void setCoordinate(int[] coordinate) {
        traveled(coordinate[0],coordinate[1]);
        this.coordinate = coordinate;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(short i, float distance) {  //добавить или скрутить пробег напрямую. i>=0 - добавить, i<0 - скрутить
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameCar='" + nameCar + '\'' +
                ", coordinate=" + Arrays.toString(coordinate) +
                ", distance=" + distance +
                '}';
    }
}
