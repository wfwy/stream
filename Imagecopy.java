public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("d:\\1.jpg");
        FileOutputStream fout = new FileOutputStream("d:\\11.jpg");
        System.out.println("文件大小："+fin.available());
        byte[] b=new byte[fin.available()];            //创建byte数组储存图像二进制数据
        fin.read(b);
        fout.write(b);
        System.out.println("文件已被复制更名");
        fin.close();
        fout.close();
    }
}