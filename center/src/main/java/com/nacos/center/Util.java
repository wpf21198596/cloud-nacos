package com.nacos.center;

public class Util {

    public static int num=1;

    static {
        System.out.println("执行静态代码块-"+num);
    }

    {
        System.out.println("构造代码块一");
    }

    {
        System.out.println("构造代码块二");
    }

    public void fun(){
        num++;
        System.out.println("执行普通方法--"+num);
    }

    public static void main() {
        System.out.println("次方法");
    }

    public Util(){
        System.out.println("构造方法");
    }

}
