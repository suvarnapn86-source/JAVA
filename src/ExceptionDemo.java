class ExceptionDemo {
    public static void main(String[] args) {
        int a = 10, ans = 0;
        try {
            ans = a / 0;
        } catch (ArithmeticException e) {
            System.out.println("demonstration not be zero");
        } finally {
            System.out.println("I am from finally block");
        }
    }
}
