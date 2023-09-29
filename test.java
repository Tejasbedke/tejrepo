import java.net.SocketTimeoutException;

class test {
    public static void main(String []args){

        Integer i=new Integer(20);
        
        int a=i.intValue();
        System.out.println(a);

        float f=i.intValue();
        System.out.println(f);

        double b=(float)i.intValue();
        System.out.println(b);
          
        Integer s=-40;
        System.out.println(s);

        
    }
}