// 연산을 나타내는 enum
public enum Operation {
    ADD("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            if (y == 0) throw new ArithmeticException("Cannot divide by zero");
            return x / y;
        }
    };

    // 연산 기호
    private final String symbol;

    // 생성자
    Operation(String symbol) {
        this.symbol = symbol;
    }

    // 연산 기호 반환 메서드
    public String getSymbol() {
        return symbol;
    }

    // 추상 메서드
    public abstract double apply(double x, double y);
}
