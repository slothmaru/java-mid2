package collection.deque;

import java.util.Stack;

public class StackMain {

  public static void main(String[] args) {
    /**
     * Stack 클래스는 내부에서 Vector라는 자료 구조를 사용하는데
     * 이 자료 구조는 자바 1.0에 개발되었고 지금은 하위 호환을 위해 존재
     * 따라서 Vector를 사용하는 Stack도 사용하지 않는 것을 권장
     * Stack대신 Deque를 사용하자
     */

    Stack<Integer> stack = new Stack<>();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    // [1, 2, 3]
    System.out.println(stack);

    // 다음 꺼낼 요소 확인(꺼내지 않고 단순 조회만)
    System.out.println("stack.peek() = " + stack.peek());

    // 스택 요소 뽑기
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack.pop() = " + stack.pop());
    // []
    System.out.println(stack);
  }
}
