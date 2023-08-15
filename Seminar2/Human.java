package Seminar2;
/*Необходимо реализовать:
1. Интерфейс ActorBehavoir, который будет содержать описание возможных действий актора в очереди/магазине
2. Абстрактный класс Actor, который хранит в себе параметры актора, включая состояние готовности сделать
заказ и факт получения заказа. Дополнение: для большего понимания, можно сделать методы-геттеры для имени и прочих
“персональных данных” abstract
3. Класс Human, который должен наследоваться от Actor и реализовывать ActorBehavoir*/
/* ДЗ:  Реализовать метод оформления заказ createOrder(...):
нужно пройти по продуктам, проверить наличие (>0), "запомнить цену"
Создать объек Order с полями List<Product>, который содержит только продукты из наличия, и поле стоимость - сумма цен продуктов, входящих в заказ.
Вернуть объект Order. В классе Order переопределить метод toString() - показывать состав заказа, заказчика и общую стоимость продуктов.

(**) При заказе от человека учитывать желаемый объем или вес и, для напитков температуру, продуктов.
+ любые доработки по желанию - добавить комментарии к коду

Формат сдачи: ссылка на гитхаб проект*/

import java.util.ArrayList;
import java.util.List;

import Seminar1.Automat;
import Seminar1.Product;

public class Human extends Actor { //Принцип открытости закрытости, принцип единственной ответственности

  private double money;
  private Automat automat;

  public Human(String name, boolean makeOrder, boolean takeOrder, double money) {
    super(name, makeOrder, takeOrder);
    this.money = money;
  }

  public double getMoney() {
    return money;
  }

  public void setMoney(double money) {
    this.money = money;
  }

  @Override
  public void setMakeOrder(boolean b) {
    makeOrder = b;

  }

  @Override
  public void setTakeOrder(boolean b) {
    takeOrder = b;

  }

  @Override
  public boolean isMakeOrder(boolean isMake) {
    return true;

  }

  @Override
  public boolean isTakeOrder(boolean b) {
    return true;

  }

  public void setAutomat(Automat automat) {
    this.automat = automat;
  }

  public Automat getAutomat() {
    return automat;
  }

  @Override
  public Order makeOrder(List<String> listHuman, Automat automat, Human human) {
    ArrayList<Product> shoppingList = new ArrayList<>();
    Product shoppingProduct;
    for (String product : listHuman) {
      shoppingProduct = automat.getProduct(product);
      if (shoppingList != null) {
        shoppingList.add(shoppingProduct);
      }
    }
    human.setMakeOrder(true);
    return automat.createOrder(shoppingList, automat, human);
  }

  @Override
  public String toString() {
    return super.toString() + " money=" + money;
  }

}