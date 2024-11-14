public class Lab82 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[6] = 10; // This line will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always executes.");
        }
    }
}
