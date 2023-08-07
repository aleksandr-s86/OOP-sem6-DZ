package Seminar1;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import Seminar2.Human;
import Seminar4.AutomatService;
import Seminar4.HotAutomatService;

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

    HotBeverageAutomat hbAutomat = new HotBeverageAutomat();
    hbAutomat.initProduct(myList);

    System.out.println("Наличие в  HotBeverageAutomat до пополнения " + hbAutomat.toString());
    System.out.println("----------");

    HotBeverage beverageProduct6 = new HotBeverage("Glasse", 210, 12, new GregorianCalendar(2023, 7, 20, 0, 0), 0.8,
        50);
    HotBeverage beverageProduct7 = new HotBeverage("IceCoffe", 100, 7, new GregorianCalendar(2023, 7, 20, 0, 0), 0.2,
        30);

    HotAutomatService HotAutomatService = new HotAutomatService();
    HotAutomatService.restock(hbAutomat, beverageProduct6);

    System.out
        .println("Наличие в HotBeverageAutomat после пополнения " + beverageProduct6.getName() + " на "
            + beverageProduct6.getQuantity() + ": "
            + hbAutomat.toString());
    System.out.println("----------");
    HotAutomatService.restock(hbAutomat, beverageProduct7);
    System.out
        .println("Наличие в HotBeverageAutomat после пополнения " + beverageProduct7.getName() + " на "
            + beverageProduct7.getQuantity() + ": "
            + hbAutomat.toString());
    System.out.println("----------");
    System.out.println("----------");

    Automat automat = new Automat();
    automat.initProduct(myList2);
    System.out.println("Наличие в  Automat до пополнения " + automat.toString());
    System.out.println("----------");

    Food product4 = new Food("Twix", 80, 21, new GregorianCalendar(2023, 10, 10, 0, 0), 25);
    Food product5 = new Food("Bounty", 90, 18, new GregorianCalendar(2023, 10, 10, 0, 0), 20);

    AutomatService automatService = new AutomatService();
    automatService.restock(automat, product4);

    System.out.println(
        "Наличие в Automat после пополнения " + product4.getName() + " на " + product4.getQuantity() + ": "
            + automat.toString());
    System.out.println("----------");

    automatService.restock(automat, product5);
    System.out.println(
        "Наличие в Automat после пополнения " + product5.getName() + " на " + product5.getQuantity() + ": "
            + automat.toString());
    System.out.println("----------");
    System.out.println("----------");

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

  }
}