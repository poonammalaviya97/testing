import java.io.FileWriter;
import java.io.IOException;

public class FilwWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("myfile.txt",true);
        fw.write(97);
        fw.write("\n");
        fw.write("Trying hard to write filewriter class");
        fw.write("\n");
        fw.write(new char[]{'P','O','O','N','A','M'});
        fw.write("\n");
        fw.flush();
        fw.close();
    }
}
