class Main{
    public static void main(String [] sjkdhis){
        test t=new test();
        t.first();
        t.second();
        t.third();
        t.fourth();
        
        one o=new test();
        o.first();
        o.third();//this will give error
    }
}


interface one{
    void first();
    void second();
}


interface two{
    void third();
    void fourth();
}

class test implements one , two{
    public void first(){
        System.out.println("first");
    }
    
    public void second(){
        System.out.println("second");
    }
    
    public void third(){
        System.out.println("third");
    }
    
    public void fourth(){
        System.out.println("fourth");
    }
    
}
