package collection.deque;

import java.util.*;

public class DequeMain {

  public static void main(String[] args) {
    // Deque는 인터페이스므로 구현체를 고를 수 있는데
    // LinkedList보다 ArrayDeque가 더 빠름으로 권장
    //Deque<Integer> deque = new LinkedList<>();
    Deque<Integer> deque = new ArrayDeque<>();

    //데이터 추가 (앞쪽)
    deque.offerFirst(1);
    System.out.println(deque);
    deque.offerFirst(2);
    System.out.println(deque);
    deque.offerFirst(3);
    System.out.println(deque);
    //데이터 추가 (뒤쪽)
    deque.offerLast(4);
    System.out.println(deque);
    deque.offerLast(5);
    System.out.println(deque);

    //다음 꺼낼 데이터 확인(꺼내지 않고 단순 조회만)
    System.out.println("deque.peekFirst() = " + deque.peekFirst());
    System.out.println("deque.peekLast() = " + deque.peekLast());

    //데이터 꺼내기
    System.out.println("deque.pollFirst() = " + deque.pollFirst());
    System.out.println("deque.pollLast() = " + deque.pollLast());
    System.out.println(deque);
  }
}
