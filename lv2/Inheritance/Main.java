public class Main{
    public static void main(String[] args) {
        Mother mother = new Mother("육민지", 33);
        Daughter daughter = new Daughter("이민정", 15, "복싱");

        mother.introduce();

		daughter.introduce();
        daughter.study();
        daughter.favoriteHobby();
    }
}