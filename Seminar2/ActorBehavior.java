package Seminar2;

import java.util.List;

import Seminar1.Automat;

public interface ActorBehavior {

  void setMakeOrder(boolean setTade);

  void setTakeOrder(boolean setMake);

  boolean isMakeOrder(boolean isMake);

  boolean isTakeOrder(boolean isTake);

  Order makeOrder(List<String> listHuman, Automat automat, Human human);

}

