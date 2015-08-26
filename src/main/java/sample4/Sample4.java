package main.java.sample4;

import java.util.ArrayList;

/**
 * Created by yuya on 2015/08/03.
 */
public class Sample4 {

    public static void main(String[] args) {
        System.out.println("s1");
        sample1();
        System.out.println("s2");
        sample2();
        System.out.println("s3");
        sample3();

        System.out.println("s4");
        sample4();
        System.out.println("s5");
        sample5();
    }

    public static void sample1() {
        int num = 0;
        while (num < 5) {
            System.out.println(num);
            num++;
        }
    }

    public static void sample2() {
        int num = 0;
        do {
            System.out.println(num);
        }
        while (num > 0);
    }

    public static void sample3() {
        for (int count = 0; count < 5; count++) {
            System.out.println(count);
        }

        for (int i = 0, c = 0; i < 4; i++) {

        }
    }

    public static void sample4(){
        ArrayList<String> al = new ArrayList<String>();
        al.add("a");
        al.add("b");
        al.add("c");

        for(String s : al){
            System.out.println(s);
        }
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println(al.indexOf("c"));
    }

    public static void sample5(){
        for (int i = 0;  ; i++) {
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("last");
    }
}
