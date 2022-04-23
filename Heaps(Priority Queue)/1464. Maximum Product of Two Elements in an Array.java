class Solution {
    public int maxProduct(int[] nums) {
        int k=2;
        int ans=1;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
            if(pq.size()>k)
            {
                pq.poll();    
            }
            
        }
        
        while(pq.size()!=0)
        {
            ans=ans*(pq.poll()-1);
        }
        
        return ans;
        
    }
}
