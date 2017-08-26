/*************************************************************************
    > File Name: Russian.java
    > Author: Feng6255
    > Mail: fenzang6255@sina.com
    > Created Time: 2017/8/26 11:47:39
 ************************************************************************/
//用for循环输出俄文的字母表
public class Russian{
    public static void main(String args[]){
        System.out.println((char)(65+2));

        char c1 = 'А';//俄文A
        char c2 = 'а';//俄文a
        System.out.println(c1+" "+c2);
        for (int i = c1; i < c1 + 32; i++) {
            System.out.print((char) i+""+(char)(c2++)+" ");
        }

        char c3  ='A',c4  = 'a';//英文A、a
        System.out.println(c3+" "+c4);
        for(int i = c3; i < c3 + 32; i++){
            System.out.print((char)i+""+(char)(c4++)+" ");
        }
    }
}
