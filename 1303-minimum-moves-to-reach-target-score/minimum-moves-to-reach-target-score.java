class Solution {
    public int minMoves(int target, int maxDoubles) {
         int ans = 0;
        while (target/2 >= 1 && maxDoubles>0){
            
                maxDoubles-= 1;
                if(target%2!=0){
                    ans += 1;
                }
                ans += 1;
                target = target/2;
            
        }
        if (target == 1) return ans;
        return ans+target-1;
    }
}