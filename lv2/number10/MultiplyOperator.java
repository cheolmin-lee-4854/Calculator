public class MultiplyOperator {
    private double num1;
    private double num2;

    public MultiplyOperator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double operate() {
        double result = num1 * num2;
        System.out.println(result);
        return result;
    }
}
