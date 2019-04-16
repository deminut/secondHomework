package homework.num5OOP;

import homework.num5OOP.GPS.Coordinates;

public class Car {  //класс машины

    private String nameCar;
    private Coordinates coordinate;
    private double distance;

    Car() {  //новая акционная машина из салона
        nameCar="Ваз";
        distance=0;
        this.coordinate= new Coordinates();
    }

    public Car(String nameCar) {  //новая машина (не акционная) из салона
        this.nameCar=nameCar;
        distance=0;
        this.coordinate= new Coordinates();
    }

    Car(String nameCar, float distance) {    //старая машина из салона
        this.nameCar = nameCar;
        this.distance = distance;
        this.coordinate= new Coordinates();

    }

    Car(String nameCar, homework.num5OOP.GPS.Coordinates coordinate) {  //новая машина не из салона
        this.nameCar = nameCar;
        this.coordinate = coordinate;
    }

    Car(String nameCar, homework.num5OOP.GPS.Coordinates coordinate, float distance) {  //старая машина не из салона
        this.nameCar = nameCar;
        this.coordinate = coordinate;
        this.distance = distance;
    }

   private void traveled(int x, int y){    //изменение дистанции при вводе новых координат
        double x1 = coordinate.getX1();
        double y1 = coordinate.getY1();
        distance=distance+Math.sqrt((Math.pow((x-x1),2)+Math.pow((y-y1),2)));
    }

    public String getNameCar() {
        return nameCar;
    }

    Coordinates getCoordinate() {
        coordinate.getCoordinate();
        return coordinate;
    }

    void setCoordinate(int x, int y) {
        traveled(x,y);
        coordinate.setCoordinate(new int[]{x,y});
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
                ", coordinate=" + coordinate +
                ", distance=" + distance +
                '}';
    }
}
