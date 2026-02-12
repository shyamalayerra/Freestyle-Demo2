public class TestHello {
    public static void main(String[] args) {
        String expected = "Hello World";
        String actual = "Hello World";

        if (expected.equals(actual)) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
            System.exit(1);
        }
    }
}
