public class Test {
    public static void main(String[] args){
       String thisLine;
       int count = 0;

        try {
            FileReader fr=new FileReader("d:\\3.txt");
            BufferedReader bf=new BufferedReader(fr);
            while ((thisLine=bf.readLine())!=null){   //每次读一行
                count++;
                System.out.println(thisLine);
            }
            System.out.println("共读取了"+count+"行");
        } catch (IOException e) {
            System.out.println("错误！"+e);
        }

    }
}
