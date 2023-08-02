package Seminar2;

public abstract class Actor implements ActorBehavior {

  private String name;
  protected boolean makeOrder;
  protected boolean takeOrder;

  public Actor(String name, boolean makeOrder, boolean takeOrder) {
    this.name = name;
    this.makeOrder = makeOrder;
    this.takeOrder = takeOrder;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Actor: name=" + name + ", makeOrder=" + makeOrder + ", takeOrder=" + takeOrder;
  }

}