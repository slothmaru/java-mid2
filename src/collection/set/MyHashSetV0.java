package collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

  private int[] elementData = new int[10];
  private int size = 0;

  //O(n) : contains가 O(n)이므로
  public boolean add(int value) {
    if (contains(value)) {
      return false;
    }
    elementData[size] = value;
    size++;
    return true;
  }

  //O(n) : 전체 데이터에서 같은 값이 있는지 확인하므로
  public boolean contains(int value) {
    for (int data : elementData) {
      if (data == value) {
        return true;
      }
    }
    return false;
  }

  // Arrays.toString()안 내용을 입력한 값까지 출력하기 위해 변경
  // elementData -> Arrays.copyOf(elementData, size)
  @Override
  public String toString() {
    return "MyHashSetV0{" +
        "elementData=" + Arrays.toString(Arrays.copyOf(elementData, size)) +
        ", size=" + size +
        '}';
  }
}
