public class Test {
    public static void main(String[] args) {
        String str=new String();
       try {
           BufferedReader bfin=new BufferedReader(new FileReader("d:\\3.txt"));
           BufferedWriter bfout=new BufferedWriter(new FileWriter("d:\\3.1.txt"));
           while((str=bfin.readLine())!=null){
               System.out.println(str);
               bfout.write(str);
               bfout.newLine();
           }
           bfout.flush();        //将缓冲区数据全部写入文件中
           bfin.close();
           bfout.close();

        } catch (IOException e) {
           System.out.println("错误！"+e);
        }
    }
}