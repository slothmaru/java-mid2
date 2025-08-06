package collection.array;

import java.util.Arrays;

// 제네릭 E : Element(요소)의 약자
public class MyArrayListV4<E> {

  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayListV4() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayListV4(int initialCapacity) {
    this.elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
  }

  //코드 추가
  public void add(int idx, E e) {
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
    elementData = Arrays.copyOf(elementData, newCapacity);
  }

  // 경고를 무시하겠다는 의미
  @SuppressWarnings("unchecked")
  public E get(int idx) {
    return (E) elementData[idx];
  }

  public E set(int idx, E e) {
    E oldValue = get(idx);
    elementData[idx] = e;
    return oldValue;
  }

  //코드 추가
  public E remove(int idx) {
    E oldValue = get(idx);
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

  public int indexOf(E e) {
    for (int i = 0; i < size; i++) {
      if (e.equals(elementData[i])) {
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
