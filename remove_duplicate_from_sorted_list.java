class Solution {
    public int removeDuplicates(int[] nums) {
    List temp = new ArrayList();  
        int count=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                int test=nums[i];
                temp.add(test);
                count++;
            }else{
                count++;
                 temp.add(nums[i]);
                i--;
            }
        }
        // System.out.println(count);
    Collections.reverse(temp);
         System.out.println(temp);
        return count;
    }
}
