package twoDArray;

import java.util.Scanner;

public class kadanesApproach {

        public static int maxSubarraySum(int[] b) {
            int n = b.length - 1; // Adjust for 1-based indexing
            if (n == 0) return 0;

            int T = 0; // Initialize T to 0, which will store the maximum sum subarray
            int prv = 0; // Initialize prv to 0, which will store the current maximum sum subarray ending at b[i]

            for (int i = 1; i <= n; ++i) {
                int current = Math.max(prv + b[i], b[i]);
                current = Math.max(current, 0);
                prv = current;
                T = Math.max(T, current);
            }

            return T;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();
            int[] b = new int[n + 1]; // Adjust for 1-based indexing
            for (int i = 1; i <= n; ++i) {
                b[i] = scanner.nextInt();
            }

            int result = maxSubarraySum(b);
            System.out.println("Maximum subarray sum is " + result);
        }
    }

}
