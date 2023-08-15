package Seminar4;

import java.util.List;

import Seminar1.HotBeverage;
import Seminar1.HotBeverageAutomat;
import Seminar1.Product;

public class HotAutomatService implements Service<HotBeverageAutomat, HotBeverage> { // принцип единственной ответственности

  @Override
  public HotBeverageAutomat restock(HotBeverageAutomat automat, HotBeverage product) {
    Product addProduct = automat.getProductOnName(product.getName());
    List<Product> listProducts = automat.getListProduct();
    if (addProduct != null) {
      addProduct.setQuantity(addProduct.getQuantity() + product.getQuantity());
    } else {
      listProducts.add(product);
    }
    automat.initProduct(listProducts);
    return automat;

  }

}