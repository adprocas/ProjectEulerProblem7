package projecteulerproblem7;

/**
 * @author Adam Leathorn
 */
public class ProjectEulerProblem7 {

    public static void main(String[] args) {
        long nthPrime = findNthPrimeNumber(10001);
        
        System.out.println(nthPrime);
    }

    public static long findNthPrimeNumber(long n) {
        int foundPrimes = 0;
        long foundPrime = 0L;
        long x = 0L;
        
        while(foundPrimes <= n) {
            ++x;
            
            if(isPrime(x)) {
                ++foundPrimes;
                foundPrime = x;
            }
        }
        
        return foundPrime;
    }
    
    /**
     * @param number
     * @return long
     */
    public static long getFactorUpperLimit(long number) {
        long limit = (long) Math.sqrt(number);

        if (limit % 2L == 0L) {
            --limit;
        }

        return limit;
    }

    /**
     * @param number
     * @return boolean
     */
    public static boolean isPrime(long number) {
        if (number == 1L || number == 2L || number == 3L) {
            return true;
        } else if (number % 2 == 0L || number % 3 == 0L) {
            return false;
        }

        long initialCounter = getFactorUpperLimit(number);

        for (long x = 5L; x <= initialCounter; x += 2) {
            if (number % x == 0L) {
                return false;
            }
        }

        return true;
    }
}
