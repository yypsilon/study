package main.java.sample7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yuya on 2015/08/06.
 */
public class Sample {
    public static void main(String[] args) {
        int i = Integer.parseInt("10");
        try {
            FileReader fr = new FileReader("sss");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


//        int[] num = {10, 20, 30};
//        for (int i = 0; i < 4; i++)
//            try {
//                System.out.print(num[i]);
//                System.out.println(i + 1);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("ex");
//            } catch (NullPointerException e) {
//
//            } catch (NumberFormatException ignored) {
//
//            } catch (Exception e) {
//
//            } finally {
//                System.out.println("--finally");
//            }
//        System.out.println("--end--");
//        int[] num = {10, 20, 30};
//        for (int i = 0; i < 4; i++) {
//            System.out.print("num :" + num[i]);
//            System.out.println(" : " + (i + 1) + "回目");
//        }
//        System.out.println("---end---");
    }


    class Super {
        void method() throws IOException, ClassNotFoundException, Exception {}
    }
    class SubA extends Super{
        @Override
        void method(){}
    }
    class SubB extends Super{
        @Override
        void method() throws Exception{}
    }

    class SubC extends Super{
        void  method() throws RuntimeException{}
    }

    class SubD extends Super{
        @Override
        void method() throws ClassNotFoundException{}
    }
}
