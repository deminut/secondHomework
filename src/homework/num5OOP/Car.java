package homework.num5OOP;

import java.util.Arrays;

public class Car {  //класс машины

    private String nameCar;
    private int[] coordinate=new int[2];
    private double distance;

    Car() {  //новая акционная машина из салона
        nameCar="Ваз";
        distance=0;
    }

    public Car(String nameCar) {  //новая машина (не акционная) из салона
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

    double getDistance() {
        return distance;
    }

    void setDistance(int i, double distance) {  //добавить или скрутить пробег напрямую. i>=0 - добавить, i<0 - скрутить
        if (i>=0)
            this.distance=this.distance+distance;
        if (i<0)
            this.distance=this.distance-distance;
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
