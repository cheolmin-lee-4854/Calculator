import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("+, -, *, / 기호를 입력하세요 : ");
            String sign = sc.next();

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            switch (sign){
                case "+":
                    int sum = num1 + num2;
                    break;

                case "-":
                    int sub = num1 - num2;
                    break;

                case "*":
                    int mul = num1 * num2;
                    break;

                case "/":
                    double div;

                    div = (float)num1 / (float)num2;
                    break;

                default:
                    System.out.print("기호를 똑바로 쓰셔야합니다.");
                    break;
                }
                System.out.print("더 계산하십니까?");
                String yesOrno = sc.next();

                if (yesOrno.equals("exit")){
                    break;
            }
        }
    }
}
