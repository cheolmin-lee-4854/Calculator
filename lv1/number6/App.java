import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dex = 10;
        double[] array = new double[dex];
        int count = 0;
        
        while (true){
            System.out.print("+, -, *, / 기호를 입력하세요(exit 종료) : ");
            String sign = sc.next();

            if (sign.equals("exit")){
                break;
            }

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            float result = 0;

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
                
            } 

                if (count < dex) {
                    array[count] = result;
                    count++;
                } else {
                    for (int i = 0; i < dex - 1; i++) {
                        array[i] = array[i + 1];
                    }
                    array[dex - 1] = result;
                }

                System.out.print("저장된 값 : ");
                for (int i=0; i<array.length; i++){
                    System.out.print(array[i]+", ");
                }
                System.out.println("");
        }
    }
}
