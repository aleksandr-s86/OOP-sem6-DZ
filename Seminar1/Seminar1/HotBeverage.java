package Seminar1;

import java.util.Calendar;

public class HotBeverage extends Beverage { //Принцип открытости закрытости, принцип единственной ответственности

  private Integer temperature;

  public HotBeverage(String name, int price, int quantity, Calendar bestBefore, double volume, Integer temperature) { //принцип единственной ответственности
    super(name, price, quantity, bestBefore, volume);
    this.temperature = temperature;
  }

  public Integer getTemperature() { //принцип единственной ответственности
    return temperature;
  }

  public void setTemperature(Integer temperature) { //принцип единственной ответственности
    this.temperature = temperature;
  }

  @Override
  public String toString() { //Принцип открытости закрытости,
    return super.toString() + ", temp=" + temperature;

  }

}