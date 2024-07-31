public enum OperatorType {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    MOD("%");

    private final String sign;

    private OperatorType(String sign) {
        this.sign = sign;
    }

    public String getSign(){
        return sign;
    }
    
    public static OperatorType fromString(String sign) {
        switch (sign) {
            case "+":
                return ADD;
            case "-":
                return SUBTRACT;
            case "*":
                return MULTIPLY;
            case "/":
                return DIVIDE;
            case "%":
                return MOD;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + sign);
        }
    }
}
