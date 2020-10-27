import classes.*;

public class App {
    public static void main(String[] args) throws Exception {
        Paar XY = new Paar<int,long>(-2,3);
        Paar paar1 = new Paar<double,float>(-2.213213123,3.12344123414321);
        Paar paar2 = new Paar<Paar,Paar>(new Paar<int,int>(3,1),new Paar<int,int>(3,4));
        System.out.println("Hello, World!");
    }
}
