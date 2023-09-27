import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("myfile.txt");

        Writer w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
        bw.write(99);
        bw.newLine();
        bw.write(new char[]{'P','O','O','N','A','M'});
        bw.newLine();
        bw.write("I am learning automation");
        bw.flush();
        bw.close();
    }
}
