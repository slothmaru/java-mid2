package collection.link;

public class Node {

  Object item;
  Node next;

  public Node(Object item) {
    this.item = item;
  }

  /*@Override
  public String toString() {
    return "Node{" +
        "item=" + item +
        ", next=" + next +
        '}';
  }*/

  //[A->B->C]
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    Node x = this;
    sb.append("[");
    while (x != null) {
      sb.append(x.item);
      if (x.next != null) {
        sb.append("->");
      }
      x = x.next;
    }
    sb.append("]");
    return sb.toString();
  }

  public static Node getLastNode(Node node) {
    Node x = node;
    while (x.next != null) {
      x = x.next;
    }
    return x; // x.next == null이라는 의미, 즉 마지막이다.
  }
}
