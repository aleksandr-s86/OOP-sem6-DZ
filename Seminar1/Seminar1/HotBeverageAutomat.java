package Seminar1;

import java.util.List;

public class HotBeverageAutomat extends Automat {

  public HotBeverageAutomat() {
    super();
  }

  @Override
  public void initProduct(List<Product> myList) {
    super.initProduct(myList);
  }

  public HotBeverage getProduct(String name, Double volume, Integer temperature) {
    for (Product el : listProduct) {
      if (el instanceof Product & el.getName().equals(name) & ((HotBeverage) el).getTemperature().equals(temperature)
          & ((HotBeverage) el).getVolume().equals(volume)) {
        return (HotBeverage) el;
      }
    }
    return null;

  }

  public HotBeverage getProductOnName(String name) {
    for (Product el : listProduct) {
      if (el instanceof Product & el.getName().equals(name)) {
        return (HotBeverage) el;
      }
    }
    return null;

  }

}




