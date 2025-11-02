import java.util.*;

class Solution {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            int n = num;

            // Extract all factors of 2
            while (n % 2 == 0) {
                set.add(2);
                n /= 2;
            }

            // Extract all odd prime factors
            for (int i = 3; i * i <= n; i += 2) {
                while (n % i == 0) {
                    set.add(i);
                    n /= i;
                }
            }

            // If n is still > 2, it's a prime
            if (n > 2) {
                set.add(n);
            }
        }

        return set.size();
    }
}
