public class Test {
    public static void main(String[] args) {
        try {
            String str=new String();
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bfr=new BufferedReader(isr);
            String sdir="d:\\1";
            String sfile;
            File fdir1=new File(sdir);
            if (fdir1.exists()&&fdir1.isDirectory()){          //判断文件是否存在或者文件夹是否有效
                System.out.println("文件夹"+sdir+"已存在");
                for (int i=0;i<fdir1.list().length;i++){
                    System.out.println(fdir1.list()[i]);
                }
                File fdir2=new File("d:\\1\\2");  //文件路径
                if (!fdir2.exists())
                    fdir2.mkdir();                            //创建文件夹2
                System.out.println();
                System.out.println("建立新文件夹后的文件列表");
                for (int i=0;i<fdir1.list().length;i++)
                    System.out.println(fdir1.list()[i]);       //将文件夹中的列表名保存在文件数组中返回
            }
            System.out.println("请输入该文件夹中的一个文件名：");
            sfile=bfr.readLine();                               //从键盘读取字符
            File ffile=new File(fdir1,sfile);
            if (ffile.isFile()){
                System.out.println("文件名："+ffile.getName());            //返回名
                System.out.println("所在文件夹："+ffile.getPath());        //返回路径
                System.out.println("文件大小："+ffile.length()+"字节");    //返回大小
            }
            if (bfr!=null)
                bfr.close();
        } catch (IOException e) {
           System.out.println(e.toString());
        }


    }
}
