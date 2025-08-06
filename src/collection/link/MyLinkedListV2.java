package collection.link;

public class MyLinkedListV2 {

  private Node first;
  private int size = 0;

  public void add(Object e) {
    Node nowNode = new Node(e);
    if (first == null) {
      first = nowNode;
    } else {
      Node lastNode = getLastNode();
      lastNode.next = nowNode;
    }
    size++;
  }

  //추가 코드
  public void add(int idx, Object e) {
    Node newNode = new Node(e);
    if (idx == 0) {
      newNode.next = first;
      first = newNode;
    } else {
      Node prev = getNode(idx - 1);
      newNode.next = prev.next;
      prev.next = newNode;
    }
    size++;
  }

  private Node getLastNode() {
    Node x = first;
    while (x.next != null) {
      x = x.next;
    }
    return x;
  }

  public Object set(int index, Object element) {
    Node x = getNode(index);
    Object oldValue = x.item;
    x.item = element;
    return oldValue;
  }

  //추가 코드
  public Object remove(int idx) {
    Node removeNode = getNode(idx);
    Object removedItem = removeNode.item;
    if (idx == 0) {
      first = removeNode.next;
    } else {
      Node prev = getNode(idx - 1);
      prev.next = removeNode.next;
    }
    removeNode.item = null;
    removeNode.next = null;
    size--;
    return removedItem;
  }

  public Object get(int index) {
    Node node = getNode(index);
    return node.item;
  }

  private Node getNode(int index) {
    Node x = first;
    for (int i = 0; i < index; i++) {
      x = x.next;
    }
    return x;
  }

  public int indexOf(Object o) {
    int index = 0;
    for (Node x = first; x != null; x = x.next) {
      if (o.equals(x.item)) {
        return index;
      }
      index++;
    }
    return -1;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return "MyLinkedListV1{" +
        "first=" + first +
        ", size=" + size +
        '}';
  }
}
