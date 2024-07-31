public class ArithmeticCalculator<T extends Number> extends Calculator<T> {
    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;
    private ModOperator modOperator;
    private OperatorType operatorType;

    public ArithmeticCalculator(double num1, double num2, String sign) {
        super(num1, num2, sign, 0);
    }

    public T calculate(double num1, double num2, String sign) {
        this.addOperator = new AddOperator(num1, num2);
        this.subtractOperator = new SubtractOperator(num1, num2);
        this.multiplyOperator = new MultiplyOperator(num1, num2);
        this.divideOperator = new DivideOperator(num1, num2);
        this.modOperator = new ModOperator(num1, num2);
        this.operatorType = OperatorType.fromString(sign);

        switch (operatorType) {
            case ADD:
                result = addOperator.operate();
                break;
            case SUBTRACT:
                result = subtractOperator.operate();
                break;
            case MULTIPLY:
                result = multiplyOperator.operate();
                break;
            case DIVIDE:
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                } else {
                    result = divideOperator.operate();
                }
                break;
            case MOD:
                if (num2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                } else {
                    result = modOperator.operate();
                }
                break;
            default:
                System.out.println("(warning) Please enter a valid operator.");
        }

        que.offer((T) Double.valueOf(result));  // Assuming T is Double for simplicity
        return (T) Double.valueOf(result);
    }
}
