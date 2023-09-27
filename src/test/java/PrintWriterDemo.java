import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter("myfile.txt");
        pw.write(99);
        pw.println(99);
        pw.println(true);
        pw.println('A');
        pw.println("Poonam");
        pw.flush();
        pw.close();

    }
}
