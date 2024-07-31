public enum Day {
    SUNDAY("Sunday"),
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday");

    private String displayName;

    // 생성자
    private Day(String displayName) {
        this.displayName = displayName;
    }

    // 메서드
    public String getDisplayName() {
        return displayName;
    }
}

public class EnumExample1 {
    public static void main(String[] args) {
        for (Day day : Day.values()) {
            System.out.println(day.getDisplayName());
        }
    }
}