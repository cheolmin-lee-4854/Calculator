public enum Operation {
    ADD {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    MULTIPLY {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public double apply(double x, double y) {
            if (y == 0) throw new ArithmeticException("Cannot divide by zero");
            return x / y;
        }
    };

    public abstract double apply(double x, double y);
}

public class Main {
    public static void main(String[] args) {
        double x = 6;
        double y = 3;
        String to  = "+";

        // Iterate over all values of Operation enum
        for (Operation op : Operation.values()) {
            System.out.printf("%.2f %s %.2f = %.2f%n", x, op, y, op.apply(x, y));
        }

        if (to == "+"){
            Operation.ADD(x, y);
        }
    }
}