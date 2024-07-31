public class CircleCalculator extends Calculator{
    Calculator cal = new Calculator();
    
    public CircleCalculator(double radius){
        super(0, 0, "", radius);
    }

    public double calculate(double radius){
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
}
