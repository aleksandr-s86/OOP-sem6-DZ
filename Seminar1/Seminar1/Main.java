package Seminar1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.List;

import Seminar2.Human;
import Seminar3.ProductTemperatureComparator;
import Seminar3.ProductVolumeComparator;

public class Main {

  public static void main(String[] args) {

    Product beverageProduct1 = new HotBeverage("Espresso", 100, 12, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2, 80);
    Product beverageProduct2 = new HotBeverage("Latte", 200, 10, new GregorianCalendar(2023, 7, 20, 0, 0), 0.5, 60);
    Product beverageProduct3 = new HotBeverage("Cappuccino", 150, 5, new GregorianCalendar(2023, 7, 20, 0, 0), 0.5, 80);
    HotBeverage beverageProduct4 = new HotBeverage("Glasse", 210, 0, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8,
        50);
    HotBeverage beverageProduct5 = new HotBeverage("Americano", 100, 13, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
        70);
    Product product1 = new Food("Twix", 80, 10, new GregorianCalendar(2023, 10, 10, 0, 0), 25);
    Product product2 = new Food("Mars", 90, 50, new GregorianCalendar(2023, 10, 10, 0, 0), 20);
    Product product3 = new Food("Snicers", 60, 15, new GregorianCalendar(2023, 10, 0, 0, 0), 18);

    List<Product> myList = new ArrayList<>();
    myList.add(beverageProduct1);
    myList.add(beverageProduct2);
    myList.add(beverageProduct3);
    myList.add(beverageProduct4);
    myList.add(beverageProduct5);

    List<Product> myList2 = new ArrayList<>();
    myList2.add(product1);
    myList2.add(product2);
    myList2.add(product3);

    Automat hbAutomat = new HotBeverageAutomat();
    hbAutomat.initProduct(myList);

    Human human = new Human("Alex", false, false, 500);
    human.setAutomat(hbAutomat);
    System.out.println("Покупатель сделал заказ -> " + human.toString());
    System.out.println("----------");

    System.out.println("Наличие в автомате до реализации заказа -> " + hbAutomat.toString());
    System.out.println("----------");

    List<String> listHuman = new ArrayList<>();
    listHuman.add("Espresso");
    listHuman.add("Glasse");
    System.out.println(human.makeOrder(listHuman, hbAutomat, human));

    System.out.println("----------");
    System.out.println("Покупатель получил заказ -> " + human.toString());

    System.out.println("----------");
    System.out.println("Наличие в автомате после выдачи заказа -> " + hbAutomat.toString());

    System.out.println("----------");
    System.out.println("----------");

    System.out.println(myList.toString());
    System.out.println("----------");

    myList.sort(new ProductTemperatureComparator());
    System.out.println("Сортировка по температуре -> " + myList.toString());
    System.out.println("----------");

    myList.sort(new ProductVolumeComparator());
    System.out.println("Сортировка по объему -> " + myList.toString());
    System.out.println("----------");

    Collections.sort(myList);
    System.out.println("Сортировка по имени -> " + myList.toString());
    System.out.println("----------");

    System.out.println(myList2.toString());
    System.out.println("----------");

    Collections.sort(myList2);
    System.out.println("Сортировка по весу -> " + myList2.toString());
    System.out.println("----------");

  }
}