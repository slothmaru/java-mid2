package generic.ex4;

import generic.animal.*;

public class MethodMain3 {

  public static void main(String[] args) {
    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("야옹이", 50);

    ComplexBox<Dog> hospital = new ComplexBox<>();
    hospital.set(dog);

    Cat returnCat = hospital.<Cat>printAndReturn(cat);
    System.out.println("returnCat = " + returnCat);
  }
}
