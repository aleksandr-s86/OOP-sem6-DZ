package Seminar1;

import java.util.Calendar;

public class HotBeverage extends Beverage {

  Integer temperature;

  public HotBeverage(String name, int price, int quantity, Calendar bestBefore, double volume, Integer temperature) {
    super(name, price, quantity, bestBefore, volume);
    this.temperature = temperature;
  }

  public Integer getTemp() {
    return temperature;
  }

  @Override
  public String toString() {
    return super.toString() + ", temp=" + temperature;

  }

}