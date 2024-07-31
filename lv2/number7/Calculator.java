import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    Queue<Double> que = new LinkedList<>();
    private double result;
    private double num1;
    private double num2;
    private String sign;
    private double radius;

    public Calculator(){
        que = new LinkedList<>();
    }

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
        que.offer(result);
        return result;
    }

    public double calculateCircleArea(double radius){
        this.radius = radius;
        if (radius > 0){
            result = (radius * radius) * 3.141592;
        }
        else if (radius == 0){
            System.out.println("반지름이 0이면 뭐겠습니까? 점 아니겠습니까 점?");
        }
        else{
            System.out.println("반지름에 음수는 웬말입니까?");
        }
        que.offer(result);
        return result;
    }

    public void printResult(){
        System.out.println(que);
    }

    public void removeResult(){
        que.poll();
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

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
