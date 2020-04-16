import java.util.HashMap;
class Solution {
    public int numJewelsInStones(String J, String S) {
        
        HashMap<Character,Integer> map=new HashMap<>();
        char stone='a';
        int v=0;
        for(int i=0;i<S.length();i++)
        {
            stone=S.charAt(i);
            if(map.containsKey(stone))
            {
               v=map.get(stone);
               v++;
               map.put(stone,v);
            }
            else
            {
                map.put(stone,1);
            }
            
        }
        int count=0;
        for(int i=0;i<J.length();i++)
        {   
            if(map.containsKey(J.charAt(i)))
            {
                 v= map.get(J.charAt(i));
                count+=v;
            }
        } 
        return count;
    }
}
