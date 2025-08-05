package generic.ex1;

//<>(다이아몬드)를 사용한 클래스를 제니릭 클래스라 함
//클래스명 오른쪽에 <T>와 같이 선언하면 제네릭 클래스가 됨
//여기서 T를 타입 매개변수라 함
public class GenericBox<T> {

  private T value;

  public void set(T value) {
    this.value = value;
  }

  public T get() {
    return value;
  }
}
