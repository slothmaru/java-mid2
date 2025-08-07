package collection.list.test.ex1;

import java.util.*;

public class ListEx3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    System.out.println("n개의 정수를 입력하세요 (종료 0)");

    while (true) {
      int input = sc.nextInt();
      sc.nextLine();
      if (input == 0) {
        break;
      }
      numbers.add(input);
    }
    int sum = 0;
    double avg = 0;
    for (Integer number : numbers) {
      sum += number;
    }
    avg = (double) sum / numbers.size();

    System.out.println("입력한 정수의 합계: " + sum);
    System.out.println("입력한 정수의 평균: " + avg);
  }
}
