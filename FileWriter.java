public class Test {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("d:\\4.txt");
        char[] c={'H','e','l','l','o','\r','\n'};
        String str="欢迎使用Java！";
        fw.write(c);
        fw.write(str);
        fw.close();
    }
}