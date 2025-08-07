package collection.list.test.ex2;

public class ShoppingCartMain {

  public static void main(String[] args) {
    //단축키 W: ctrl + e, M: cmd + e (열었던 창 목록을 띄워서 바로 열게 할 수 있음)
    ShoppingCart cart = new ShoppingCart();

    Item item1 = new Item("마늘", 2000, 2);
    Item item2 = new Item("상추", 3000, 4);

    cart.addItem(item1);
    cart.addItem(item2);

    cart.displayItems();
  }
}
