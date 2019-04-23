package homework.num6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> title = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        int n = 0;
        while(n<10){
            title.add("name"+n);
            price.add(100.0+n);
            count.add(5+n%4);
            n++;
        }

        Goods good1 = new FoodGoods(title,price,count);

        Shop shop1 = new Shop(good1);

        shop1.setNewItem("ololo",322.0,12);
        shop1.getShop();

        shop1.basket();
        shop1.check();

    }
}
