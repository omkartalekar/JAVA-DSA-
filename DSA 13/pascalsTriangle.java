import java.util.*;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
    List<List<Integer>> triangle = new ArrayList<List<Integer>>();
   
        List<Integer> prev=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            
             List<Integer> Al=new ArrayList<>();
            
            for(int j=0;j<=i;j++){
                
                if(j==0 || j==i){
                    
                    Al.add(1);
                    
                }
                else{
                    
                    Al.add(prev.get(j-1)+prev.get(j));
                    
                }
            }
            triangle.add(Al);
            prev=Al;
        }
        
        return triangle;
    }
}

// public static void printPascal(int n)
// {
//     for(int line = 1; line <= n; line++)
//     {
          
//     int C=1;// used to represent C(line, i)
//     for(int i = 1; i <= line; i++)
//     { 
//         // The first value in a line is always 1
//         System.out.print(C+" ");
//         C = C * (line - i) / i; 
//     }
//     System.out.println();
//     }
// }