public class CopyArray {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40, 50};

        // Create a new array of the same size
        int[] copy = new int[original.length];

        // Copy each element one by one using a loop
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Print both arrays to verify
        System.out.println("Original array:");
        for (int num : original) {
            System.out.print(num + " ");
        }

        System.out.println("\nCopied array:");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}