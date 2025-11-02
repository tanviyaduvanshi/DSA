class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            int n=num;
        
        while(n % 2 == 0) {
            set.add(2);
             n /= 2;
        }

        // Check for odd numbers
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }

        // If n > 2, it’s a prime
        if (n > 2) set.add(n);
        }
        return set.size();
    }
}