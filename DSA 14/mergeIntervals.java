import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> answer = new ArrayList<>();
        
        if(intervals.length != 0 || intervals != null){
            Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
            
            int start = intervals[0][0];
            int end = intervals[0][1];
            
            for(int[] i: intervals){
                if(i[0] <= end){
                    end = Math.max(end, i[1]);
                } else {
                    answer.add(new int[]{start,end});
                    start = i[0];
                    end = i[1];
                }
            }
            answer.add(new int[]{start,end}); 
            
        }
        
        return answer.toArray(new int[0][]); 
    }
}









// class Solution {
//     public int[][] merge(int[][] intervals) {
//         if (intervals.length <= 1) {
// 			return intervals;
//         }
        
//         Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));
        
//         List<int[]> result = new ArrayList<>();
// 		for (int[] interval : intervals) {
//             // if list is empty or does not overlap with the previous, just append

//             if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
//                 result.add(interval);
//             } else {
//                 // if overlap, merge the current and previous intervals

//                 result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
//             }
// 		}

// 		return result.toArray(new int[result.size()][]);
//     }
// }








// import java.util.*;

// public class TUF {
//     static ArrayList < List < Integer >> merge(ArrayList < List < Integer >> intervals) {

//         Collections.sort(intervals, (a,b)->a.get(0)-b.get(0));
//         ArrayList < List < Integer >> merged = new ArrayList < > ();

//         for (int i = 0; i < intervals.size(); i++) {
//             if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < intervals.get(i).get(0)) {
//                 ArrayList < Integer > v = new ArrayList < > ();
//                 v.add(intervals.get(i).get(0));
//                 v.add(intervals.get(i).get(1));

//                 merged.add(v);
//             } else {
                
//                 merged.get(merged.size() - 1).set(1, Math.max(merged.get(merged.size() - 1).get(1), intervals.get(i).get(1)));
//             }
//         }

//         return merged;
//     }
// }










class Interval
{
    int start,end;
      
    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}

// public class MergeOverlappingIntervals {
      
    // Function that takes a set of intervals, merges 
    // overlapping intervals and prints the result 
    public static void mergeIntervals(Interval arr[]) 
    { 
        // Sort Intervals in increasing order of 
        // start time 
        Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start - i2.start;
            }
        });
    
        int index = 0; // Stores index of last element 
        // in output array (modified arr[]) 
    
        // Traverse all input Intervals 
        for (int i=1; i<arr.length; i++) 
        { 
            // If this is not first Interval and overlaps 
            // with the previous one 
            if (arr[index].end >=  arr[i].start) 
            { 
                   // Merge previous and current Intervals 
                arr[index].end = Math.max(arr[index].end, arr[i].end); 
            } 
            else {
                index++;
                arr[index] = arr[i]; 
            }    
        }