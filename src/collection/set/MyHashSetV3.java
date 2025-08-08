package collection.set;

import java.util.*;

public class MyHashSetV3<E> implements MySet<E> {

  static final int DEFAULT_INITIAL_CAPACITY = 16;

  private LinkedList<E>[] buckets;

  private int size = 0;

  private int capacity = DEFAULT_INITIAL_CAPACITY;

  public MyHashSetV3() {
    initBuckets();
  }

  public MyHashSetV3(int capacity) {
    this.capacity = capacity;
    initBuckets();
  }

  private void initBuckets() {
    buckets = new LinkedList[capacity];
    for (int i = 0; i < capacity; i++) {
      buckets[i] = new LinkedList<>();
    }
  }

  public boolean add(E value) {
    int hashIndex = hashIndex(value);
    LinkedList<E> bucket = buckets[hashIndex];
    if (bucket.contains((value))) {
      return false;
    }

    bucket.add(value);
    size++;
    return true;
  }

  public boolean contains(E searchValue) {
    int hashIndex = hashIndex(searchValue); // O(1)
    LinkedList<E> bucket = buckets[hashIndex]; // O(1)
    return bucket.contains(searchValue); // O(n) -> O(1)
  }

  public boolean remove(E value) {
    int hashIndex = hashIndex(value);
    LinkedList<E> bucket = buckets[hashIndex];
    // LinkedList에는 삭제가 2개 있는데 인덱스로 지우냐, 값으로 지우냐
    // 여기서는 값으로 지워야하기 때문에 Integer.valueOf(value)로 넘겨줘야함
    boolean result = bucket.remove(value);
    if (result) {
      size--;
      return true;
    } else {
      return false;
    }
  }

  private int hashIndex(Object value) {
    return Math.abs(value.hashCode()) % capacity;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return "MyHashSetV3{" +
        "buckets=" + Arrays.toString(buckets) +
        ", size=" + size +
        ", capacity=" + capacity +
        '}';
  }
}
