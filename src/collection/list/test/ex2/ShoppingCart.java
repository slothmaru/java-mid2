package collection.list.test.ex2;

import java.util.*;

public class ShoppingCart {

  List<Item> items = new ArrayList<>();

  public void addItem(Item item) {
    items.add(item);
  }

  public void displayItems() {
    System.out.println("장바구니 상품 출력");
    for (Item item : items) {
      System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice());
    }

    //메서드로 뽑으려면 범위 선택 후
    // W: ctrl + alt + m / M: opt + cmd + m
    // 요즘은 컴퓨터가 좋아서 기능을 하나에 두는것보다
    // for문을 몇번 더 돌리는게 유지보수면에서 더 이득
    System.out.println("전체 가격 합: " + getTotalPrice());
  }

  private int getTotalPrice() {
    int totalPrice = 0;
    for (Item item : items) {
      totalPrice += item.getTotalPrice();
    }
    return totalPrice;
  }
}
