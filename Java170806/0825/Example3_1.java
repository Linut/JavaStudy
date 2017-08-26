/*************************************************************************
    > File Name: Example3_1.java
    > Author: Feng6255
    > Mail: fenzang6255@sina.com
    > Created Time: 2017/8/25 11:18:47
 ************************************************************************/
class Test{
    int a = 0;
}

public class Example3_1{
    public static void main(String args[]){
        char a1='中',a2='国',a3='您',a4='好';
        char secret = 'A';
        a1 = (char)(a1 ^ secret);
        a2 = (char)(a2 ^ secret);
        a3 = (char)(a3 ^ secret);
        a4 = (char)(a4 ^ secret);
        System.out.println("加密的字符是："+a1+a2+a3+a4);
        a1 = (char)(a1 ^ secret);
        a2 = (char)(a2 ^ secret);
        a3 = (char)(a3 ^ secret);
        a4 = (char)(a4 ^ secret);
        System.out.println("初始的字符是："+a1+a2+a3+a4);
        Test t = new Test();
        boolean b = t instanceof Test;
        System.out.println(b);

    }
}
