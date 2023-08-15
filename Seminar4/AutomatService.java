
/*1. Создать сервис добавления продуктов в Автомат (интерфейс). Сервис должен содержать метод, принимающий на вход автомат и продукт, 
добавляющий продукт в автомат. С помощью обобщения добейтесь того, чтобы в обычный автомат можно было добавлять еду или напитки, 
а в автомат с горячими напитками - горячие напитки
2. Класс Ордер сделайте типизированным, добавьте возможность создавать заказ с продуктами: 
2.1 однотипными 
2.2(*) разного типа Внесите соответственно изменения в остальной код, где используются объекты заказа*/

/* Семинар 6. Взять реализованный код про приложение с Автоматом еды и напитков, и продемонстрировать применение принципов SOLID.
То есть в коде прописать в комментариях, какой принцип выполняется. Если видите нарушение принципа, нужно прокомментировать участки кода, 
которые рефакторите, указать какой принцип применяется и почему.*/

package Seminar4;

import java.util.List;

import Seminar1.Automat;
import Seminar1.Product;

public class AutomatService implements Service<Automat, Product> {// принцип единственной ответственнности

  @Override
  public Automat restock(Automat automat, Product product) {
    Product addProduct = automat.getProduct(product.getName());
    List<Product> listProducts = automat.getListProduct();
    if (addProduct != null) {
      addProduct.setQuantity(addProduct.getQuantity() + product.getQuantity());
    } else {
      listProducts.add(product);
    }
    automat.initProduct(listProducts);
    return automat;

  }

}