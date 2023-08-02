package Seminar1;

import java.util.Calendar;

public class Food extends Product {

  double weight;

  public Food(String name, int price, int quantity, Calendar bestBefore, double weight) {
    super(name, price, quantity, bestBefore);
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  @Override
  public String toString() {
    return super.toString() + ", weight=" + weight;

  }

}