package Seminar1;
//Реализуйте класс товар,содержащий в себе данные о товаре и торговый автомат,\
//содержащий в сеье методы initProducts(List<Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)



/*В класс Beverage добавить поле объем (double volume), а в класс Food - масса (double weight), добавить заполнение в конструктор,
добавтиь их в вывод toString()
Создать наследника класса Beverage ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат наследник от класса ТорговыйАвтомат и реализовать перегруженный метод 
getProduct(String name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре*/


import java.util.ArrayList;
import java.util.List;
import Seminar2.Human;
import Seminar2.Order;

public class Automat {

  protected List<Product> listProduct = new ArrayList<>();

  public void initProduct(List<Product> myList) {
    listProduct = myList;
  }

  public List<Product> getListProduct() {
    return listProduct;
  }

  public void setListProduct(List<Product> listProduct) {
    this.listProduct = listProduct;
  }

  public Product getProduct(String name) {
    for (Product el : listProduct) {
      if (el.getName().equals(name)) {
        return el;
      }
    }
    return null;

  }

  public Order createOrder(List<Product> listHuman, Automat automat, Human human) {
    ArrayList<Product> shoppingList = new ArrayList<>();
    Product shoppingProduct;
    double totalPrice = 0;
    for (Product product : listHuman) {
      shoppingProduct = automat.getProduct(product.getName());
      if (product.equals(shoppingProduct) && automat.getProduct(product.getName()).getQuantity() > 0) {
        shoppingList.add(shoppingProduct);
        totalPrice += automat.getProduct(product.getName()).getPrice();
        (automat.getProduct(product.getName())).setQuantity((automat.getProduct(product.getName())).getQuantity() - 1);
      } else if (product.equals(shoppingProduct) && automat.getProduct(product.getName()).getQuantity() == 0) {
        System.out.println(product.getName() + " нет в наличии");
      }
    }
    human.setTakeOrder(true);
    Order order = new Order(shoppingList, human, automat, totalPrice);
    human.setMoney(human.getMoney() - totalPrice);
    return order;
  }

  @Override
  public String toString() {
    String result = "Automat [\n";
    for (int i = 0; i < listProduct.size(); i++) {
      result += listProduct.get(i) + "\n";

    }
    return result + "]";
  }

}