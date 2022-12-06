//interfaces in java
interface Test{
    int i=10;
    void fn1();
    void fn2();
}

interface Test1{
    void fn3();
    void fn4();
}


class Name implements Test,Test1{
    
    
    public void fn1(){
        System.out.println("fn 1 overwritten");
    }
    public void fn2(){
        System.out.println("fn 2 overwritten");
    }
    
    
    public void fn3(){
        System.out.println("fn 3 overwritten");
    }
    public void fn4(){
        System.out.println("fn 4 overwritten");
    }
    
    Name(){
        fn1();
        fn2();
        // fn3();
        fn4();
    }
}



class Main{
    public static void main(String [] sdsjkhdk){
      Name n=new Name();
      System.out.println();
      
    }
}
