package Seminar1;

import java.util.Calendar;

public class Beverage extends Product { //Принцип открытости закрытости, принцип единственной ответственности 

  private Double volume;

  public Beverage(String name, int price, int quantity, Calendar bestBefore, Double volume) {  //принцип единственной ответственности
    super(name, price, quantity, bestBefore);
    this.volume = volume;   
  }

  public Double getVolume() {   //принцип единственной ответственности
    return volume;
  }

  public void setVolume(Double volume) {  //принцип единственной ответственности
    this.volume = volume;
  }

  @Override
  public String toString() {    //Принцип открытости закрытости
    return super.toString() + ", volume=" + volume;

  }

}