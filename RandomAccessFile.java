public class Test {
    public static void main(String[] args) throws IOException {

        System.out.println("请输入文件所在路径");
        StringBuffer stfdir=new StringBuffer();
        char ch;
        while ((ch=(char)System.in.read())!='\r')
            stfdir.append(ch);

        File dir=new File(stfdir.toString());
        System.out.println("请输入与读取的文件名");
        StringBuffer stfFN=new StringBuffer();
        char c;

        while ((c=(char)System.in.read())!='\r')
            stfFN.append(c);

        stfFN.replace(0,1,"");
        File readform=new File(dir,stfFN.toString());
        if (readform.isFile()&&readform.canWrite()&&readform.canRead()){
            RandomAccessFile rafFile=new RandomAccessFile(readform,"rw");
            while (rafFile.getFilePointer()<rafFile.length())
                System.out.println(rafFile.readLine());
            rafFile.close();
        }
        else
            System.out.println("文件不可读！");

    }
}