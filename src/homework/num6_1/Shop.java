package homework.num6_1;


import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    private Goods goods;
    private ArrayList<String> choose = new ArrayList<>();
    private ArrayList<Integer> choose1 = new ArrayList<>();

    public Shop(Goods goods) {
        this.goods = goods;
    }

    private String getItem(String title, int x){
        return goods.getFullItem(title,x);
    }

    public void setNewItem(String title, double price, int number){
        goods.addMore(title, price, number);
    }

    public void getShop(){
        goods.getFullShop();
    }

    public void basket(){
        while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введиде название товара");

            String k = in.nextLine();
            if (k.equals("quit"))break;
            choose.add(k);
            System.out.println("Введиде количество товара");
            if (!in.hasNextInt()){
                int x=0;
                System.out.println("Это не число! Установлено в 0");
                choose1.add(x);
            } else {
                int x = in.nextInt();
                if (x>=0) {
                    choose1.add(x);
                    System.out.println("Заказан товар " + k + " в количестве: " + x);
                }
                else {x=0;
                    System.out.println("Это отрицательное число! Установлено в 0");
                    choose1.add(x);
                }
            }
            System.out.println("Для выхода введите 'quit'");
        }
    }

    public void check(){
        System.out.println();
        System.out.println();
        System.out.println("Ваш чек:");
        for(int i=0;i<choose.size();i++){
            System.out.println(getItem(choose.get(i),choose1.get(i)));
        }
        System.out.println("Удачных покупок!");
    }
}
