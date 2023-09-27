import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadingWritingTOFromTextFileDemo {
    public static void main(String[] args) throws Exception {

        Path source = Paths.get("files/from.txt");
        System.out.println(source.getFileName());

        Path target = Paths.get("files/to.txt");
        System.out.println(target.getFileName());

        Charset charset = Charset.forName("US-Ascii");
        ArrayList<String> lines = new ArrayList();
        try (BufferedReader reader = Files.newBufferedReader(source, charset)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            }
        }

        try (BufferedWriter writer = Files.newBufferedWriter(target, charset)) {
            Iterator<String> itr= lines.iterator();
            while (itr.hasNext()){
                String line = itr.next();
                writer.append(line,0,line.length());
                writer.newLine();
            }

        }

    }
}
