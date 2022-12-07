class Main {
    public static void main(String[] sndmn){
        test t=new test();
        t.first();
        t.second();
        t.third();
        t.fourth();
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
