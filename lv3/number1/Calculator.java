import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    protected Queue<Double> que;
    protected double result;
    private double num1;
    private double num2;
    private String sign;
    private double radius;

    public Calculator(){
        que = new LinkedList<>();
    }

    public Calculator(double num1, double num2, String sign, double radius){
        this.num1 = num1;
        this.num2 = num2;
        this.sign = sign;
        this.radius = radius;
        que = new LinkedList<>();
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

    public double getResult(){
        return result;
    }
    public void setResult(double result){
        this.result = result;
    }
}
