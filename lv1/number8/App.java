import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Double> que = new LinkedList<>();
        Queue<Double> calsave = new LinkedList<>();

        int dex = 3;
        double[] array = new double[dex];
        int count = 0;
        float result = 0;
        
        while (true){
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String selectMove = sc.next();

            if (selectMove.equals("exit")){
                break;
            }
            else if (count > 1 && selectMove.equals("remove")){
                que.poll();      
            }
            else if (count > 1 && selectMove.equals("inquiry")){
                System.out.println(que);
            }

            System.out.print("+, -, *, / 기호를 입력하세요(exit 종료) : ");
            String sign = sc.next();

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            switch (sign) {
                case "+":
                    result = num1 + num2;    
                    break;
    
                case "-":
                    result = num1 - num2;     
                    break;
    
                case "*":
                    result = num1 * num2;       
                    break;
    
                case "/":
                    if (num2 != 0) {
                        result = (float) num1 / num2;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                    break;
    
                default:
                    System.out.println("기호를 똑바로 쓰셔야합니다.");
                    que.poll();
                    break;
                
            } 
    
                System.out.print("저장된 값 : ");
                que.add((double)result);
        }
    }
}
