public class Test {
    public static void main(String[] args){
        FileInputStream fin;          //声明输入流
        FileOutputStream fout;        //声明输出流
        int data;
        char ch;
        try {
            fin = new FileInputStream(FileDescriptor.in); //创建输入流对象
            fout = new FileOutputStream("d:\\123.txt");   //创建输出流对象
            System.out.println("请输入一串字符以 # 结束：");
            while ((ch = (char) fin.read()) != '#')       //read()方法读取输入流数据
                fout.write(ch);                           //write()方法将读取到的数据写入文件
            fin.close();
            fout.close();
            System.out.println();
            fin = new FileInputStream("d:\\123.txt");     //重新定义输入输出对象
            fout = new FileOutputStream(FileDescriptor.out);
            while (fin.available() > 0) {
                data = fin.read();
                fout.write(data);
            }
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件没找到！");
        } catch (IOException e) {

        }
    }
}