import java.util.*;

// we basically have to find the maximum distance between two consecutive vertical cuts and hhorizontal cuts
class Solution {
    
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        //sort both the arrays
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        //find max diff between two consecutive horizontal cuts
        int maxh = horizontalCuts[0];
        for(int i=1;i<horizontalCuts.length;i++){
            maxh = Math.max(horizontalCuts[i]-horizontalCuts[i-1],maxh);
    }
        maxh = Math.max(h-horizontalCuts[horizontalCuts.length-1],maxh);
        
        //find max diff between two consecutive vertical cuts
        int maxw = verticalCuts[0];
        for(int i=1;i<verticalCuts.length;i++){
            maxw = Math.max(verticalCuts[i]-verticalCuts[i-1],maxw);
            }
        maxw = Math.max(w-verticalCuts[verticalCuts.length-1],maxw);
        
        long ans = 1l*maxh*maxw;
        return (int)(ans%1000000007);
    }
}
