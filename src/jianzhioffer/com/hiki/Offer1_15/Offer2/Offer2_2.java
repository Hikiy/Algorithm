package jianzhioffer.com.hiki.Offer1_15.Offer2;
/*
实现单例模式
懒汉式1(非线程安全)
 */
public class Offer2_2 {
    private Offer2_2(){

    }
    private static Offer2_2 instance;
    public static Offer2_2 getInstance(){
        if(instance==null){
            instance=new Offer2_2();
        }
        return instance;
    }
}
