class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }
        
        // Create a boolean array "isPrime[0..n]" 
        boolean[] isPrime = new boolean[n];
        // Initialize all entries as true
        Arrays.fill(isPrime, true);
        
        // Mark 0 and 1 as non-prime
        isPrime[0] = isPrime[1] = false;
        
        // Use Sieve of Eratosthenes to mark non-primes
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        // Count the number of prime numbers
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        
        return count;
    }
}