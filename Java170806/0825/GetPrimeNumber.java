/*************************************************************************
    > File Name: GetPrimeNumber.java
    > Author: Feng6255
    > Mail: fenzang6255@sina.com
    > Created Time: 2017/8/26 11:41:40
 ************************************************************************/
//求100以内素数
public class GetPrimeNumber{
    public static void main(String args[]){

    int i,j;
    for(i=2;i<=100;i++){
        for(j=2;j<=i/2;j++){
            if(i%j==0)
                break;
        }
        if(j>i/2)
            System.out.print(i+" ");
    }
    System.out.println();
    }
}
