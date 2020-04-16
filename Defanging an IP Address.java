class Solution {
    public int Number_of_dots(char[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]=='.')
                count++;
        return count;
    }
    public String defangIPaddr(String address) {
        int n= address.length();
        char[] arr= new char[n];
        for(int i=0;i< address.length();i++)
        {
            arr[i]= address.charAt(i);
        }
        
        //Count Number of dots
        int dots=Number_of_dots(arr);
        //Creating defang array
        
        char[] new_arr=new char[n+(dots*2)];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {   
            if(arr[i]=='.')
            {
                new_arr[j++]='[';
                new_arr[j++]='.';
                new_arr[j++]=']';
            }
            else
            {
                new_arr[j++]=arr[i];
            }
        }
        return String.valueOf(new_arr);
        
    }
}
