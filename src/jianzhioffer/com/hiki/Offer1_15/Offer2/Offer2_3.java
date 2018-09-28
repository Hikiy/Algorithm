package jianzhioffer.com.hiki.Offer1_15.Offer2;
/*
实现单例模式
懒汉式线程安全：
给方法加锁
 */
public class Offer2_3 {
    private Offer2_3(){

    }
    private static Offer2_3 instance;
    public synchronized static Offer2_3 getInstance(){
        if(instance==null){
            instance=new Offer2_3();
        }
        return instance;
    }
}
