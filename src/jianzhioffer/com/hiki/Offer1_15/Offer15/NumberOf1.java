package jianzhioffer.com.hiki.Offer1_15.Offer15;

public class NumberOf1 {
    public int numberOf1(int n){
        int i=1;
        int count=0;
        while(i!=0){
            if((n&i)==i)
                count++;
            i=i<<1;
        }
        return count;
    }
}
