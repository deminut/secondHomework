package homework.num6_1;

import java.util.ArrayList;

public abstract class Goods {
    private ArrayList<String> title;
    private ArrayList<Double> price;
    private ArrayList<Integer> count;

    Goods(ArrayList<String> title, ArrayList<Double> price, ArrayList<Integer> count) {
        this.title = title;
        this.price = price;
        this.count = count;
    }

    void addMore(String title, double price, int count){
        this.title.add(title);
        this.price.add(price);
        this.count.add(count);
    }

    int getIndexItem(String title){
        return this.title.indexOf(title);
    }

    public String getFullItem(String title,int x){
        int i = getIndexItem(title);
        if (i>=0&&i<this.title.size())
            if (x > this.count.get(i)) {
                String s = this.title.get(i) + " - " + this.price.get(i) + " x " + this.count.get(i) + "=" + this.price.get(i)*this.count.get(i);
                this.count.set(i,0);
                return s;
            } else {
                String s = this.title.get(i) + " - " + this.price.get(i) + " x " + x + "=" + this.price.get(i) * x;
                this.count.set(i, this.count.get(i) - x);
                return s;
            }
        else
            return title + "- товар не найден";
    }

    void getFullShop(){
        for(int i = 0;i<title.size();i++){
            System.out.println(this.title.get(i) + " - " + this.price.get(i) + " x " + this.count.get(i) + "=" + this.price.get(i)*this.count.get(i));
        }
    }


    @Override
    public String toString() {
        return "Goods{" +
                "title=" + title +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
