/*************************************************************************
    > File Name: SumOfFactorial.java
    > Author: Feng6255
    > Mail: fenzang6255@sina.com
    > Created Time: 2017/8/26 11:45:59
 ************************************************************************/
//求1！+2！+……+20！的和
public class SumOfFactorial{
    public static void main(String args[]){
        double sum = 0, t  = 20,a = 1;
        for(int i = 1;i<=t;i++){
            for(int j=1;j<=i;j++){
                a= a*j;
            }
            sum = sum + a;
            System.out.println(sum);
        }
        System.out.println("和为："+sum);
        double d=1;
        for(int i=1;i<=20;i++){
            d=d*i;
        }
        System.out.println(d);
    }
}
