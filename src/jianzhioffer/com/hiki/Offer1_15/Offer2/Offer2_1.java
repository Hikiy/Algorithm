package jianzhioffer.com.hiki.Offer1_15.Offer2;
/*
实现单例模式
饿汉式：线程安全，耗费资源。(只要调用了该类，就会实例化一个对象，
但有时我们并只需要调用该类中的一个方法，而不需要实例化一个对象，
所以饿汉式是比较消耗资源的。)
 */
public class Offer2_1 {
    private static final Offer2_1 instance=new Offer2_1();
    private Offer2_1(){

    }
    public static Offer2_1 getInstance(){
        return instance;
    }
}
