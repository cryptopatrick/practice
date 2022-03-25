import java.util.Arrays;

class AverageOfSubarrayOfSizeK {
    // The size of the window is represented by K.
    // arr is the array that we are given.
    public static double[] findAverages(int K, int[] arr) {
        // We should check that the length of the array is 
        // at least as large as K, and exit if it's not.
        if (arr.length < K) {
            System.err.println("Error: length of array argument smaller than window size.");
            System.exit(0); // Terminates JVM
        }
        // We will store the averages of the window
        // in an array of double (64-bit float).
        // The size of the array is given by how many times
        // we can fit the window in the array.
        // A window of size 5 can fit three times inside
        // an array of size 7.
        double[] result = new double[arr.length - K+1];

        for (int i = 0; i <=arr.length - K; i++) {
            // Find the sum of the next K elements.
            double sum = 0;
            // Iterate and sum all the values inside the window.
            for (int j = i; j < i+K; j++){
                sum += arr[j];
            }

            result[i] = sum / K;
        }

        return result;
    }

    // Testing out the function.
    public static void main(String[] args) {
        double[] result = AverageOfSubarrayOfSizeK.findAverages(5, new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2});
        System.out.println("Average: " + Arrays.toString(result));
    }
}