package collection.deque;

import java.util.*;

public class QueueMain {

  public static void main(String[] args) {
    // Queue는 인터페이스므로 구현체를 고를 수 있는데
    // LinkedList보다 ArrayDeque가 더 빠름으로 권장
    //Queue<Integer> queue = new LinkedList<>();
    Queue<Integer> queue = new ArrayDeque<>();

    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    // [1, 2, 3]
    System.out.println(queue);

    //다음 꺼낼 데이터 확인(꺼내지 않도 단순 조회만)
    System.out.println("queue.peek() = " + queue.peek());

    //데이터 꺼내기
    System.out.println("queue.poll() = " + queue.poll());
    System.out.println("queue.poll() = " + queue.poll());
    System.out.println("queue.poll() = " + queue.poll());
    // []
    System.out.println(queue);
  }
}
