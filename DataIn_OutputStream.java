public class Test {
    public static void main(String[] args){
        FileInputStream fin;
        DataInputStream din;
        FileOutputStream fout;
        DataOutputStream dout;
        try {
            fout = new FileOutputStream("d:2.txt");
            dout = new DataOutputStream(fout);
            dout.writeInt(10);                  //  4字节
            dout.writeLong(12345);              //  8字节
            dout.writeFloat(3.1415925f);         // 4字节
            dout.writeBoolean(true);             //
            dout.writeDouble(987654321.123);     // 8字节
            dout.writeChars("Goodby!");         //
            dout.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }
        try {
             fin=new FileInputStream("d:2.txt");
             din=new DataInputStream(fin);
             System.out.println(din.readInt());
             System.out.println(din.readLong());
             System.out.println(din.readFloat());
             System.out.println(din.readBoolean());
             System.out.println(din.readDouble());
             char ch;
             while ((ch=din.readChar())!='\0')
                 System.out.print(ch);
             din.close();
        } catch (IOException e) {
            //e.printStackTrace();
        }

    }
}
