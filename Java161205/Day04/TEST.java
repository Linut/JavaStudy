/*
1、设置sublime text3的首选项下：设置-默认中Default -encoding由原来的UTF-8,为现在的GBK
2、测试是否能编写Java代码时不需要再手动设置编码

*/
class TEST {
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
}
/*
结论：不行，只能用以下方法。
安装ConvertToUTF8插件，然后修改ConvertToUTF8.sublime-settings文件中default_encoding_on_create，后面引号里写GBK就好了
ConvertToUTF8的中文说明：
https://github.com/seanliang/ConvertToUTF8/blob/master/README.zh_CN.md
*/