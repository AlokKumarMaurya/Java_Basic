class Main {
    public static void main(String[] sndmn){
        test t=new test();
        t.first();
        t.second();
        t.third();
        t.fourth();
        t.ten();
        }
}



interface one{
    
    private void fn(){
        System.out.println("private fn");
    }
    
    
    default void  ten(){
        fn();
        System.out.println("default method");
    }
    
    void first();
    void second();
}

interface two{
    void third();
    void fourth();
}



class test implements one,two{
    public void first(){
        System.out.println("First");
    }
    
    public void second(){
        System.out.println("Second");
    }
    
    public void third(){
        System.out.println("third");
    }
    
    public void fourth(){
        System.out.println("Fourth");
    }
    
}
