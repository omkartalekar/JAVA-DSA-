class FibonacciProblem {
    public static int fib(int n) {

        // Approach 1 best approach
        
        // We can optimize the space used in method 2 by storing the previous two
        // numbers only because that is all we need to get the next Fibonacci number in
        // series.

        // int a = 0, b = 1;
        // int count = 0;

        // for (int i = 0; i < n; i++) {
        // int c = a + b;
        // a = b;
        // b = c;

        // }

        // return a;

        // }






        // Approach

        // A simple method that is a direct recursive implementation mathematical
        // recurrence relation is given above.

        // if(n==0 || n==1){
        // return n;
        // }

        // int ans = fib(n-1) + fib(n-2);

        // return ans;






        // Method 2 (Use Dynamic Programming)

        // We can avoid the repeated work done in method 1 by storing the Fibonacci
        // numbers calculated so far.

        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 2]; // 1 extra to handle case, n = 0
        int i;

        /* 0th and 1st number of the series are 0 and 1 */
        f[0] = 0;
        f[1] = 1;

        for (i = 2; i <= n; i++) {
            /*
             * Add the previous 2 numbers in the series
             * and store it
             */
            f[i] = f[i - 1] + f[i - 2];
        }

        return f[n];

    }

}
