import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args)throws IOException {
        File f = new File("myfile.txt");
        Reader w = new FileReader(f);
        BufferedReader br = new BufferedReader(w);
        String line = br.readLine();
        while (line!=null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
