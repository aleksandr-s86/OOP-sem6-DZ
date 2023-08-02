package Seminar3;
/*
— Добавить в классы продуктов и напитков возможность сравнивать их по некоторым критериям 
(можно сделать пользовательский интерфейс и спрашивать у пользователя по чему отсортировать (по весу, объему, температуре))
— Добавить проверку в Order (validateOrder()) до оформления заказа: если заказано некоторого товара больше, 
чем есть в автомате, удалить этот товар из заказа (желательно в одну проходку).
 */

import java.util.Comparator;

import Seminar1.HotBeverage;
import Seminar1.Product;

public class ProductTemperatureComparator implements Comparator<Product> {

  @Override
  public int compare(Product o1, Product o2) {
    if (((HotBeverage) o1).getTemperature() > ((HotBeverage) o2).getTemperature()) {
      return 1;
    } else if (((HotBeverage) o1).getTemperature() < ((HotBeverage) o2).getTemperature()) {
      return -1;
    } else
      return 0;
  }
   
}
