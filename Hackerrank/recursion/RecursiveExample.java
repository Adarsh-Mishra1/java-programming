package recursion;

public class RecursiveExample {

    static void recursiveFunction(int n) {
        if (n <= 0) {
            return; // Base case to terminate recursion
        }

        System.out.println("Entering recursiveFunction with n = " + n);

        // First recursive call
        recursiveFunction(n - 1);

        System.out.println("Exiting first recursiveFunction with n = " + n);

        // Second recursive call
        recursiveFunction(n - 2);

        System.out.println("Exiting second recursiveFunction with n = " + n);
    }

    public static void main(String[] args) {
        int startingValue = 2;
        recursiveFunction(startingValue);
    }
}
