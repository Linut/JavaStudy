/*
1. 输入文件夹，循环该文件夹下所有TXT文件，删除文件中的空白字符和空行。
2. 直接利用main函数输入文件夹路径
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Replace {

	public static void main(String[] args) {	//直接利用main函数参数输入文件夹路径
		Replace r = new Replace();
		r.removeSpaceAndLinebreak(args[0]);
	}

	public void removeSpaceAndLinebreak(String url){

		try{
			File srcFile = new File(url);
			boolean b = srcFile.exists();
			if (b && srcFile.isDirectory()) {	//判断是否是路径是否存在，是否是文件夹
				File[] file = srcFile.listFiles();
				if (file.length == 0) {
						System.out.println("文件夹内不存在文件！");
						System.exit(0);
				};
				for (int i = 0; i < file.length; i++) {
					//file[i]就是循环出来的文件夹里的文件。然后用下面的方法读它。
					if (!file[i].getName().endsWith("txt")) {	//判断是否是TXT文件
						System.out.println(file[i].getName()+"不是TXT文件！");
						continue;
					}
					Runtime.getRuntime().exec("notepad "+file[i].getAbsolutePath());//打开待处理文件,参数是字符串，是个命令
					String str = null;
					String REGEX = "\\s+";	//空格、制表符正则表达式,\s匹配任何空白字符，包括空格、制表符、换页符等

					InputStreamReader stream = new InputStreamReader(new FileInputStream(file[i]),"GBK");	//读入字节流，并且设置编码为UTF-8																
					BufferedReader reader = new BufferedReader(stream);	////构造一个字符流的缓存器，存放在控制台输入的字节转换后成的字符

					File newFile = new File(file[i].getParent(),"new"+file[i].getName());	//建立将要输出的文件和文件名

					OutputStreamWriter outstream = new OutputStreamWriter(new FileOutputStream(newFile),"GBK");	//写入字节流
					BufferedWriter writer = new BufferedWriter(outstream);
					Pattern patt = Pattern.compile(REGEX);	//创建Pattern对象，处理正则表达式				
					while ((str = reader.readLine()) != null) {	
						Matcher mat = patt.matcher(str);	//先处理每一行的空白字符
						str = mat.replaceAll("");
						if (str == "") {	//如果不想保留换行符直接写入就好，不用多此一举
							continue;
						}else{
							writer.write(str);	//如果想保留换行符，可以利用str+"\r\n" 来在末尾写入换行符
						}
					}
					writer.close();
					reader.close();

					//打开修改后的文档
					Runtime.getRuntime().exec("notepad "+newFile.getAbsolutePath());	
				}
				System.out.println("文件修改完成！");
			}else{
				System.out.println("文件夹路径不存在或输入的不是文件夹路径！");
				System.exit(0);
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	

}
