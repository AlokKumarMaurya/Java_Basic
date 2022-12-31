class Main{
    public static void main(String[] a){
      boolean tempbool=false;
      int[] test={1,2,1,3,4,5,6,7,8,9,9};
      int temp=0;
      
      for(int j=0;j<test.length;j++){
              for(int i=j+1;i<test.length;i++){
          if(test[j]==test[i]){
              tempbool=true;
              break;
          }
      }
      }
  
      System.out.println(tempbool);
    }
}
