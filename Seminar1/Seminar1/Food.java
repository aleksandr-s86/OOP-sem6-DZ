package Seminar1;

import java.util.Calendar;

public class Food extends Product {

  private double weight;

  public Food(String name, int price, int quantity, Calendar bestBefore, double weight) {
    super(name, price, quantity, bestBefore);
    this.weight = weight;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return super.toString() + ", weight=" + weight;

  }

  @Override
  public int compareTo(Product o) {
    return (int) (this.getWeight() - ((Food) o).getWeight());
  }

}