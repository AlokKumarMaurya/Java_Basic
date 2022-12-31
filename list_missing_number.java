class Main{
    public static void main(String [] ernfg){
        testfn();
    }
    
    public static void   testfn(){
    int[]  a={1,2,3,4,5,6,7,8,9,0};
    boolean temp=false;
    for(int i=0;i<=8;i++){    
        for(int j=0;j<a.length;j++){
            if(a[j]==i){
                temp=true;
                break;
            }else temp=false;
        }
        if(temp==false){
            break;
        }
    }
    System.out.println(temp);
}
}


