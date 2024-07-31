class Calculator {
    public double calculate(double num1, double num2, String sign) {
        double result = 0;

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
                    result = num1 / num2;
                } else {
                    System.out.println("Error: 0으로 나눌 수 없습니다.");
                }
                break;

            default:
                System.out.println("기호를 올바르게 입력하세요.");
                break;
        }

        return result;
    }
}