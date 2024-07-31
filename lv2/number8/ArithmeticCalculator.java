
public class ArithmeticCalculator extends Calculator{
    public ArithmeticCalculator (double num1, double num2, String sign){
        super(num1, num2, sign, 0);
    }

    public double calculate(double num1, double num2, String sign){
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
                if (num2 == 0){
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                else{
                    result = num1 / num2;
                    break;
                }
            default:
                System.out.println("(warning)연산 기호를 다시 입력하세요.(warning)");

        }
        System.out.println(result);
        que.offer(result);
        return result;
    }
}
