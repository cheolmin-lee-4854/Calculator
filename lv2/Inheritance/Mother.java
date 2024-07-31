public class Mother {
    private String name;
    private int age;
  

    public Mother(String name, int age){
        this.name = name;
        this.age = age;
    }

    
    public void introduce(){
        System.out.println("안녕, 나의 이름은 " + name + " 이다. 그리고 나이는 " + age + " 살이야.");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}