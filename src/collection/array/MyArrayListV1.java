package collection.array;

import java.util.Arrays;
import java.util.zip.ZipEntry;

public class MyArrayListV1 {

  private static final int DEFAULT_CAPACITY = 5;

  private Object[] elementData;
  private int size = 0;

  public MyArrayListV1() {
    this.elementData = new Object[DEFAULT_CAPACITY];
  }

  public MyArrayListV1(int initialCapacity) {
    this.elementData = new Object[initialCapacity];
  }

  public int size() {
    return size;
  }

  public void add(Object e) {
    elementData[size++] = e;
  }

  public Object get(int idx) {
    return elementData[idx];
  }

  public Object set(int idx, Object element) {
    Object oldValue = get(idx);
    elementData[idx] = element;
    return oldValue;
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
