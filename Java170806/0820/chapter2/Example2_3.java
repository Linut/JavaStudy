/*************************************************************************
    > File Name: Example2_3.java
    > Author: Feng6255
    > Mail: fenzang6255@sina.com
    > Created Time: 2017/8/20 21:47:01
    > Describe: Java输入与输出
 ************************************************************************/
import java.util.Scanner;
public class Example2_3{
    public static void main(String args[]){
        System.out.println("请输入若干个数字，每输入一个数字以回车确认"+
                "最后输入0结束输入操作");//在输出时，括号里不能加回车键，但是使用“+”号后就可以使用回车键
        Scanner reader = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        double x = reader.nextDouble();
        while(x!=0){
            m = m + 1;
            sum = sum + x;
            x = reader.nextDouble();
        }
        System.out.println(m+"个数的和为："+sum);
    }
}
