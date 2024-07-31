public class Daughter extends Mother{
    private String favoriteHobby;

    public Daughter(String name, int age, String favoriteHobby){
        super(name, age);
        this.favoriteHobby = favoriteHobby;
    }

    public void study(){
        System.out.println(getName() + "는 공부를 엄마에게 배운다.");
    }

    public void favoriteHobby(){
        System.out.println(getName() + "의 취미는 "+favoriteHobby+"이다");
    }

    public String getFavoriteHobby(){
        return favoriteHobby;
    }

    public void setFavoriteHobby(){
        this.favoriteHobby = favoriteHobby;
    }
}