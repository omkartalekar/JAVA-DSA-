class BuySell01 {
    public static int maxProfit(int[] prices) {

        // Approach 1 O(n^2)

        // if(prices.length<=1){
        // return 0;
        // }

        // int n=prices.length;
        // int maxProfit=Integer.MIN_VALUE;

        // for(int i=0;i<n;i++){
        // for(int j=i+1;j<n;j++){
        // maxProfit=Math.max(maxProfit,prices[j]-prices[i]);
        // }
        // }

        // if(maxProfit<0){
        // return 0;
        // }

        // return maxProfit;

        // Approach 2 O(n)

        // if(prices.length<=1){
        // return 0;
        // }

        // int n=prices.length;
        // int maxProfit=Integer.MIN_VALUE;
        // int min=prices[0];

        // for(int i=1;i<n;i++){
        // maxProfit=Math.max(maxProfit,prices[i]-min);
        // min=Math.min(prices[i],min);
        // }

        // if(maxProfit<0){
        // return 0;
        // }

        // return maxProfit;



        
        // Approach same as 2

        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {

            if (min < prices[i])
                max = Math.max(prices[i] - min, max);
            else
                min = prices[i];
        }
        return max;

    }

    public static void main(String args[]) {
        int arr[] = new int[] { 1, 2, 3, 4, 5 };
        int ans = maxProfit(arr);
        System.out.println(ans);
    }
}