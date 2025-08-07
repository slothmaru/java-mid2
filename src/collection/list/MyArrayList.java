package collection.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayList() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayList(int initialCapacity) {
    this.elementData = new Object[initialCapacity];
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public void add(E e) {
    if (size == elementData.length) {
      grow();
    }
    elementData[size++] = e;
  }

  @Override
  public void add(int idx, E e) {
    if (size == elementData.length) {
      grow();
    }
    shiftRightFrom(idx);
    elementData[idx] = e;
    size++;
  }

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

  @Override
  @SuppressWarnings("unchecked")
  public E get(int idx) {
    return (E) elementData[idx];
  }

  @Override
  public E set(int idx, E e) {
    E oldValue = get(idx);
    elementData[idx] = e;
    return oldValue;
  }

  @Override
  public E remove(int idx) {
    E oldValue = get(idx);
    shiftLeftFrom(idx);
    size--;
    elementData[size] = null;
    return oldValue;
  }

  private void shiftLeftFrom(int idx) {
    for (int i = idx; i < size - 1; i++) {
      elementData[i] = elementData[i + 1];
    }
  }

  @Override
  public int indexOf(E e) {
    for (int i = 0; i < size; i++) {
      if (e.equals(elementData[i])) {
        return i;
      }
    }
    return -1;
  }

  @Override
  public String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size))
        + " size=" + size + ", capacity=" + elementData.length;
  }
}
