public class Main{
    public static void main(String[] args){
        Box<Integer> integerBox = new Box<>(10);

        Box<String> stringBox = new Box<>("Hello, Generics!");

        int intValue = integerBox.getValue();
        String stringValue = stringBox.getValue();

        System.out.println("integer value : "+intValue);
        System.out.println("String value : "+stringValue);

        Box.printBoxValue(integerBox);
        Box.printBoxValue(stringBox);
    }
}