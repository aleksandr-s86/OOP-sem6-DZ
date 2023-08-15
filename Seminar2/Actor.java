package Seminar2;

public abstract class Actor implements ActorBehavior { //Принцип открытости закрытости, принцип единственной ответственности

  private String name;
  protected boolean makeOrder;
  protected boolean takeOrder;

  public Actor(String name, boolean makeOrder, boolean takeOrder) {
    this.name = name;
    this.makeOrder = makeOrder;
    this.takeOrder = takeOrder;

  }

  public String getName() { //принцип единственной ответственности

    return name;
  }

  public void setName(String name) {  //принцип единственной ответственности
    this.name = name;
  }

  @Override
  public String toString() { //Принцип открытости закрытости
    return "Actor: name=" + name + ", makeOrder=" + makeOrder + ", takeOrder=" + takeOrder;
  }

}