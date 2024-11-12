class Solution
{
    public int findLucky(int[] arr)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            int elm=arr[i];
            if(hm.containsKey(arr[i]))
            {
                hm.put(elm,hm.get(elm)+1);
            }
            else
            {
                hm.put(elm,1);
            }
        }
        int ans=-1;
        for(int key:hm.keySet())
        {
            if(hm.get(key)==key)
            {
                ans=Math.max(ans,key);
            }
            
        }
         return ans;
    }
   
}