package Seminar1;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Product beverageProduct1 = new HotBeverage("Espresso", 100, 12, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
        80);
    Product beverageProduct2 = new HotBeverage("Latte", 200, 10, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8, 60);
    Beverage beverageProduct3 = new HotBeverage("Cappuccino", 150, 5, new GregorianCalendar(2023, 7, 20, 0, 0), 0.5,
        80);
    HotBeverage beverageProduct4 = new HotBeverage("Glasse", 210, 18, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8,
        50);
    HotBeverage beverageProduct5 = new HotBeverage("Americano", 100, 13, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
        80);

    List<Product> myList = new ArrayList<>();
    myList.add(beverageProduct1);
    myList.add(beverageProduct2);
    myList.add(beverageProduct3);
    myList.add(beverageProduct4);
    myList.add(beverageProduct5);
    Automat hbAutomat = new HotBeverageAutomat();
    hbAutomat.initProduct(myList);

    String name = "Cappuccino";
    Double volume = 0.5;
    Integer temperature = 80;

    System.out.println(((HotBeverageAutomat) hbAutomat).getProduct(name, volume, temperature).toString());

  }
}