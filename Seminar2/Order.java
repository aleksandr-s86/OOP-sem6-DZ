package Seminar2;

import java.util.List;

import Seminar1.Automat;
import Seminar1.Product;

public class Order {

  private List<Product> productList;
  private Human human;
  private Automat automat;
  private double price;

  public Order(List<Product> productList, Human human, Automat automat, double price) {
    this.productList = productList;
    this.human = human;
    this.automat = automat;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }

  public Human getHuman() {
    return human;
  }

  public void setHuman(Human human) {
    this.human = human;
  }

  public Automat getAutomat() {
    return automat;
  }

  public void setAutomat(Automat automat) {
    this.automat = automat;
  }

  @Override
  public String toString() {
    String result = "Order [";
    for (int index = 0; index < productList.size(); index++) {
      result += "Product" + (index + 1) + "=" + productList.get(index).getName() + ", ";
    }
    return result + "name=" + human.getName() + ", totalPrice=" + price + "]";

  }

}