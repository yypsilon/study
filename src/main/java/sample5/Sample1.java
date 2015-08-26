package main.java.sample5;

/**
 * Created by yuya on 2015/08/02.
 */
public class Sample1 {
    public static void main(String[] args) {
//        Employee a = new Employee(1);
//        a.setId(100);
//
//        Employee b = new Employee(2);
//        b.setId(200);
//
//        System.out.println(a.getId());
//        System.out.println(b.getId());


        Test t = new Test();
        t.methodA();
        System.out.println(t.instanceVal);
        t.methodB();
        System.out.println(Test.staticVal);
        Test.methodB();
    }
}

class Employee{
    String name;
    int id = 10;

    public Employee(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
class Item{}


class Test{
    int instanceVal = 100;
    static int staticVal = 200;

    void methodA(){
        System.out.println("methodA();" + instanceVal);
    }
    static void methodB(){
        System.out.println("methodB();" + staticVal);
    }
}