package homework.num5OOP;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car("Жигуль", 267);
        Car car3=new Car("Опель", new int[]{1,4});
        Car car4=new Car("Бмв",new int[]{20,12},500);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);

        car1.setCoordinate(new int[]{5,0});
        System.out.println(car1);

        car4.setCoordinate(new int[]{0,0});
        System.out.println(car4);

        System.out.println();
        System.out.println(car4.getDistance());
        car4.setDistance(1,200);
        System.out.println(car4.getDistance());
        car4.setDistance(-1,300);
        System.out.println(car4.getDistance());
    }
}
