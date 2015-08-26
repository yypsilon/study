package main.java.sample3;

/**
 * Created by yuya on 2015/08/06.
 */
public class Sample3 {
    public static void main(String[] args) {
//        System.out.println(10 % 3.0);
//        System.out.println(10 % 3);
//        System.out.println(10 / 3);
//        System.out.println(10.0 / 3);
        methodA();
    }

    static void methodA(){
        int a=10, b=10,c=10,d=10;
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(c--);
        System.out.println(--d);

        System.out.println("----");


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}
