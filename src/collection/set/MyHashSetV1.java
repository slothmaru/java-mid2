package collection.set;

import java.util.*;
import javax.xml.transform.Result;

public class MyHashSetV1 {

  static final int DEFAULT_INITIAL_CAPACITY = 16;

  private LinkedList<Integer>[] buckets;

  private int size = 0;

  private int capacity = DEFAULT_INITIAL_CAPACITY;

  public MyHashSetV1() {
    initBuckets();
  }

  public MyHashSetV1(int capacity) {
    this.capacity = capacity;
    initBuckets();
  }

  private void initBuckets() {
    buckets = new LinkedList[capacity];
    for (int i = 0; i < capacity; i++) {
      buckets[i] = new LinkedList<>();
    }
  }

  public boolean add(int value) {
    int hashIndex = hashIndex(value);
    LinkedList<Integer> bucket = buckets[hashIndex];
    if (bucket.contains((value))) {
      return false;
    }

    bucket.add(value);
    size++;
    return true;
  }

  public boolean contains(int searchValue) {
    int hashIndex = hashIndex(searchValue);
    LinkedList<Integer> bucket = buckets[hashIndex];
    return bucket.contains(searchValue);
  }

  public boolean remove(int value) {
    int hashIndex = hashIndex(value);
    LinkedList<Integer> bucket = buckets[hashIndex];
    // LinkedList에는 삭제가 2개 있는데 인덱스로 지우냐, 값으로 지우냐
    // 여기서는 값으로 지워야하기 때문에 Integer.valueOf(value)로 넘겨줘야함
    boolean result = bucket.remove(Integer.valueOf(value));
    if (result) {
      size--;
      return true;
    } else {
      return false;
    }
  }

  private int hashIndex(int value) {
    return value % capacity;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return "MyHashSetV1{" +
        "buckets=" + Arrays.toString(buckets) +
        ", size=" + size +
        ", capacity=" + capacity +
        '}';
  }
}
