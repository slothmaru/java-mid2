package collection.set.test;

import java.util.*;

public class UniqueNamesTest2 {

  public static void main(String[] args) {
    Integer[] inputArr = {30, 20, 20, 10, 10};
    // () 매개변수 넣는 곳에 커서 위치하고 ctrl + p 단축키 사용하면
    // 인수로 뭘 던질 수 있는지 확인 가능함, 이런식으로 한 줄 코딩이 가능해짐
    Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

    // Array -> List 만드는 두 가지 방법
    List<Integer> list1 = Arrays.asList(1, 2, 3); // 자바1, 2부터 존재
    List<Integer> list2 = List.of(1, 2, 3); // 자바9 이상이면 권장

    for (Integer s : set) {
      System.out.println(s);
    }
  }
}
