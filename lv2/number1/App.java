import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Double> que = new LinkedList<>();
        int count = 0;

        while (true) {
            System.out.println("계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String selectMove = sc.next();

            if (selectMove.equals("exit")) {
                break;
            } else if (count > 0 && selectMove.equals("remove")) {
                que.poll();
                count--;
                continue;
            } else if (count > 0 && selectMove.equals("inquiry")) {
                System.out.println("저장된 값: " + que);
                continue;
            }

            System.out.print("+, -, *, / 기호를 입력하세요(exit 종료) : ");
            String sign = sc.next();

            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();

            Calculator calc = new Calculator();
            double result = calc.calculate(num1, num2, sign);
            que.add(result);
            count++;
        }
    }
}