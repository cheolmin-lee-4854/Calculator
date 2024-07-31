public class Box<T>{
    private T value;

    public Box(T value){
        this.value = value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public static <U> void printBoxValue(Box<U> box){
        System.out.println("Box value: "+ box.getValue());
    }
}