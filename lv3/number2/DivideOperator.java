public class DivideOperator {
    private double num1;
    private double num2;

    public DivideOperator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double operate() {
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println(result);
            return result;
        } else {
            System.out.println("Error: 0으로 나눌 수 없습니다.");
            return Double.NaN;
        }
    }
}
