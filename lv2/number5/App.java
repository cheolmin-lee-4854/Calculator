import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator();
        double result = 0.0;
        double num1 = 0.0;
        double num2 = 0.0;

        while (true){
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            System.out.println("저장된 연산내용을 삭제하시겠습니까? (remove 입력 시 조회)");
            System.out.println("exit 입력시 계산 중지");
            System.out.println("사칙연산 기호를 입력하세요: ");
            String sign = sc.next();
            if (sign.equals("exit")){
                System.out.print("계산중지");
                break;
            }
            else if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")){
                System.out.print("첫 번째 숫자를 입력하세요: ");
                num1 = sc.nextInt();
                cal.setNum1(num1);

                System.out.print("두 번째 숫자를 입력하세요: ");
                num2 = sc.nextInt(); 
                cal.setNum2(num2);
                
                cal.setSign(sign);
                result = cal.Calculate(cal.getNum1(), cal.getNum1(), cal.getSign());
            }
            else if (sign.equals("inquiry")){
                cal.printResult();
            }
            else if (sign.equals("remove")){
                cal.removeResult();
                System.out.println(cal.que);
            }
            else{
                System.out.println("warning!!");
            }

        }
    }
}