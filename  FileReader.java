
import java.io.*;
public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("d:\\3.txt");
        char[] c=new char[500];
        int num=fr.read(c);
        String str=new String(c,0,num);
        System.out.println("读取的字符个数为："+num+"，其内容如下");
        System.out.println(str);
        fr.close();

    }
}