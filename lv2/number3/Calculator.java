public class Calculator {
    private double result;
    private double num1;
    private double num2;
    private String sign;

    public double Calculate(double num1, double num2, String sign){
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
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
        return result;
    }
    public double getNum1(){
        return num1;
    }
    public void setNum1(double num1){
        this.num1 = num1;
    }

    public double getNum2(){
        return num2;
    }
    public void setNum2(double num2){
        this.num2 = num2;
    }

    public String getSign(){
        return sign;
    }
    public void setSign(String sign){
        this.sign = sign;
    }
}
