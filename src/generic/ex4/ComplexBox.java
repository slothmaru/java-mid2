package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {

  private T animal;

  public void set(T animal) {
    this.animal = animal;
  }

  // 제네릭 타입을 클래스에 사용한 T와 똑같이 바꿔도
  // 메서드에서 가까운 매개변수를 참조하기 때문에
  // z.getClass를 찍어보면 인수로 전달받은 객체가 출력됨
  public <Z> Z printAndReturn(Z z) {
    System.out.println("animal.className: " + animal.getClass().getName());
    System.out.println("t.className: " + z.getClass().getName());
    return z;
  }
}
