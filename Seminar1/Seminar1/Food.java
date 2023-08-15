package Seminar1;

import java.util.Calendar;

public class Food extends Product { //Принцип открытости закрытости, принцип единственной ответственности

  private double weight;

  public Food(String name, int price, int quantity, Calendar bestBefore, double weight) { //принцип единственной ответственности
    super(name, price, quantity, bestBefore);
    this.weight = weight;
  }

  public double getWeight() {  //принцип единственной ответственности
    return weight;
  }

  public void setWeight(double weight) {  //принцип единственной ответственности
    this.weight = weight;
  }

  @Override
  public String toString() {   //Принцип открытости закрытости
    return super.toString() + ", weight=" + weight;

  }

  @Override
  public int compareTo(Product o) {  //Принцип открытости закрытости
    return (int) (this.getWeight() - ((Food) o).getWeight());
  }

}