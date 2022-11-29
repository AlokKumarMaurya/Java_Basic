//now we can pass as many arguments as we want in the same function
class Main{
    
    static int fn(int ...arr){
        int sum=0;
        for(int a:arr){
            sum=sum+a;
        }
        return sum;
    }
    
    public static void main(String [] sd){
        System.out.println(fn(1,2,3,4));
        System.out.println(fn(1,2));
    }
}
