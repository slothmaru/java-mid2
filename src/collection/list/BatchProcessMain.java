package collection.list;

public class BatchProcessMain {

  public static void main(String[] args) {
    //MyArrayList<Integer> list = new MyArrayList<>();
    MyLinkedList<Integer> list = new MyLinkedList<>();

    BatchProcess process = new BatchProcess(list);
    process.logic(50_000);
  }
}
