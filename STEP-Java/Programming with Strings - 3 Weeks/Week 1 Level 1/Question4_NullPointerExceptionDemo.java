public class Question4_NullPointerExceptionDemo {

    public static void generateNullPointerException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    public static void handleNullPointerException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate exception (will cause program to stop if uncommented)
        // generateNullPointerException();

        // Call method to handle exception
        handleNullPointerException();
    }
}
