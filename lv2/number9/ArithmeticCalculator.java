
public class ArithmeticCalculator extends Calculator{
    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;

    public ArithmeticCalculator (double num1, double num2, String sign){
        super(num1, num2, sign, 0);
    }

    public double calculate(double num1, double num2, String sign){
        this.addOperator = new AddOperator(num1, num2);
        this.subtractOperator = new SubtractOperator(num1, num2);
        this.multiplyOperator = new MultiplyOperator(num1, num2);
        this.divideOperator = new DivideOperator(num1, num2);
        switch (sign) {
            case "+":
                result = addOperator.operate();
                break;
            
            case "-":
                result = subtractOperator.operate();
                break;

            case "*":
                result = multiplyOperator.operate();
                break;

            case "/":
                if (num2 == 0){
                    throw new ArithmeticException("0으로 나눌 수 없습니다.");
                }
                else{
                    result = divideOperator.operate();
                    break;
                }
            default:
                System.out.println("(warning)연산 기호를 다시 입력하세요.(warning)");

        }
        que.offer(result);
        return result;
    }
}
