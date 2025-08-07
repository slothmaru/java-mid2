package collection.set;

import java.util.*;

public class HashStart5 {

  static final int CAPACITY = 10;

  public static void main(String[] args) {
    //{1, 2, 5,8, 14, 99, 9}
    // LinkedList를 만든 것이 아니라 LinkedList를 담을 배열을 만든 것
    // LinkedList를 사용한 이유는 충돌확률이 낮기 때문
    LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];
    System.out.println("buckets = " + Arrays.toString(buckets));
    for (int i = 0; i < CAPACITY; i++) {
      // 여기서 LinkedList를 생성함
      buckets[i] = new LinkedList<>();
    }
    System.out.println("buckets = " + Arrays.toString(buckets));
    add(buckets, 1);
    add(buckets, 2);
    add(buckets, 5);
    add(buckets, 8);
    add(buckets, 14);
    add(buckets, 99);
    add(buckets, 9); //중복
    System.out.println("buckets = " + Arrays.toString(buckets));

    //검색
    int searchValue = 9;
    boolean contains = contains(buckets, searchValue);
    System.out.println("buckets.contains(" + searchValue + ") = " + contains);
  }

  private static void add(LinkedList<Integer>[] buckets, int value) {
    int hashIndex = hashIndex(value);
    LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
    if (!bucket.contains(value)) { // O(n)이지만 대부분 중복이 발생안하는데 그럴때는 O(1)
      bucket.add(value);
    }
  }

  private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
    int hashIndex = hashIndex(searchValue);
    LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
    return bucket.contains(searchValue); // O(n)
  }

  static int hashIndex(int value) {
    return value % CAPACITY;
  }
}
