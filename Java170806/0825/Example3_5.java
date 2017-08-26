/*************************************************************************
    > File Name: Example3_5.java
    > Author: Feng6255
    > Mail: fenzang6255@sina.com
    > Created Time: 2017/8/25 11:40:39
 ************************************************************************/
//计算表达式：8+88+888+8888+……的前12项的和。
public class Example3_5{
    public static void main(String args[]){
        long sum =0,a= 8,item =a;
        for(int i=0;i<12;i++){
            sum = sum+item;
            item = item * 10 +a;
        }
        System.out.println("和为："+sum);
    }
}
