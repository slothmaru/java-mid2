package collection.array;

import java.util.Arrays;

public class MyArrayListV3 {

  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayListV3() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayListV3(int initialCapacity) {
    this.elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(Object e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
  }

  //코드 추가
  public void add(int idx, Object e) {
    if (size == elementData.length) {
      grow();
    }
    //데이터 이동
    shiftRightFrom(idx);
    elementData[idx] = e;
    size++;
  }

  //코드 추가, 요소의 마지막부터 idx까지 오른쪽으로 밀기
  private void shiftRightFrom(int idx) {
    for (int i = size; i > idx; i--) {
      elementData[i] = elementData[i - 1];
    }
  }

  private void grow() {
    int oldCapacity = elementData.length;
    int newCapacity = oldCapacity * 2;
    //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
    /*Object[] newArr = new Object[newCapacity];
    for (int i = 0; i < elementData.length; i++) {
      newArr[i] = elementData[i];
    }
    Object[] objects = Arrays.copyOf(elementData, newCapacity);*/
    elementData = Arrays.copyOf(elementData, newCapacity);
  }

  public Object get(int idx) {
    return elementData[idx];
  }

  public Object set(int idx, Object element) {
    Object oldValue = get(idx);
    elementData[idx] = element;
    return oldValue;
  }

  //코드 추가
  public Object remove(int idx) {
    Object oldValue = get(idx);
    //데이터 이동
    shiftLeftFrom(idx);
    size--;
    elementData[size] = null;
    return oldValue;
  }

  //코드 추가 요소의 idx부터 마지막까지 왼쪽으로 밀기
  private void shiftLeftFrom(int idx) {
    for (int i = idx; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
  }

  public int indexOf(Object o) {
    for (int i = 0; i < size; i++) {
      if (o.equals(elementData[i])) {
        return i;
      }
    }
    return -1;
  }

  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size))
        + " size=" + size + ", capacity=" + elementData.length;
  }
}
