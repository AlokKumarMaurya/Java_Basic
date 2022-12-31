class Main{
    public static void main(String[] wkjdeb){
        int[] test={1,2,3,4,-1,5,6,7,8,9,0};
        int val=test[0];
        for(int i=0;i<test.length;i++){
            val=test[i];
            for(int j=0;j<test.length;j++){
                if(val<test[j]){           //largest number
                    ///if(val>test[j]){    //smallest number
                    val=test[j];
                }
            }
        }
        System.out.println(val);
    }
}
