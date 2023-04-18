public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
}

public class StringOperations {
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    public String toUpperCase(String s) {
        return s.toUpperCase();
    }
}
