// class Solution {
//     public int numPairsDivisibleBy60(int[] time) {
//         int n=time.length;
//         int count=0;
        
//         for(int i=0;i<n-1;i++){
//  for(int j=i+1;j<n;j++){
//                 int sum=time[i]+time[j];
            
//             if(sum % 60==0){
//                 count++;
//             }
//     }
            
// }
        
//         return count;
//     }
// }


// Similar approach to Two Sum problem

// First we have to check wether the reminder is 0 or not or we can say that we are checking if the number is already divisible by 60 or not.
// after that we are finding the target element. Eg: if n = 140 then remider = 140%60 = 20 it means we have 20 unit extra or we can say we need 40(60-20) more units to get perfectly divisible by 60.
// So we find the target element in map and adds up in answer, if target element not found we store the current element(N%60) so that it can be used as target for others.
// But if remider is 0 we have to store that number only because it represents that the number is divisible by 60 and it needs the number that are already divisible by 60.
// Here is the Java code for the above approach

// class Solution {
//     public int numPairsDivisibleBy60(int[] time) {
//         int n=time.length;
//         int count=0;
//         HashMap<Integer,Integer> map=new HashMap<>();
        
//         for(int i=0;i<n;i++){
//             int rem=time[i]%60;
            
//             int find=60-rem;
            
//             if(map.containsKey(find)){
//                 count+=map.get(find);
//             }
//             if(rem!=0){
//                 map.put(rem,map.getOrDefault(rem,0)+1);
//             }
//             else{
//                 map.put(60,map.getOrDefault(60,0)+1);
//             }
            
//         }
//         return count;
//     }
// }


class Solution 
{
    public int numPairsDivisibleBy60(int[] time) 
    {
        //we know that remainders will lie between 0 to 59
        int[] remainders = new int[60];
        
        int count = 0;
        for (int i = 0; i < time.length; i++) 
        {
            //current remainder
            int curr = time[i] % 60;
            
            //if current remainder is zero, it means, the complement for this time would be a time having remainder zero 
            // for other than zero, complement remainder would be 60 - r; 
            if (curr == 0)
                count += remainders[0];
            else
                count += remainders[60 - curr];
            
            remainders[curr]++;
        }
        return count;
    }
}