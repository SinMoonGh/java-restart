package Construct;

public class MethodStack {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }
    static void method1(){
        System.out.println("method1 start");
        method2();
        System.out.println("method1 end");
    }

    static void method2(){
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
