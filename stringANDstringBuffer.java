import com.sun.jdi.VirtualMachine;

class Main{
    public static void main(String[] sdsds){
        String s=new  String("test");
        System.out.println(s);
        System.out.println(s.hashCode());
      s=s.concat("another test");
        System.out.println(s);
        StringBuffer stringBuffer=new StringBuffer("stringBuffer");
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuffer);
        stringBuffer.append("string");
        System.out.println(stringBuffer.hashCode());
        System.out.println(stringBuffer);

    }
}
