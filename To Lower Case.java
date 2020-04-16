class Solution {
    public String toLowerCase(String str) {
        
       int l=0;  
       int n=str.length();
		char[] arr=new char[n];
		for(int i=0;i<n;i++)
		{
			l=str.charAt(i);
			if(l>=65 && l<=90)
			{
				l=l+32;
				arr[i]=(char)l;
			}
			else
			{
				arr[i]=(char)l;
			}
		}
		
		
		
        return String.valueOf(arr);
        
    }
}
