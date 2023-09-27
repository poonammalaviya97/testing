import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsDemo {
    public static void main(String[] args) throws IOException {
      //  Path p = Paths.get("practice/myfile.txt");
     /*   Path p = Paths.get("myfile.txt");

        System.out.println("Does file myfile.txt exists? :" + Files.exists(p));
        System.out.println("Whole path :" + p.toString());
        System.out.println("File name :" + p.getFileName());
        System.out.println(p.toAbsolutePath());
        System.out.println(p.getNameCount());
        System.out.println(p.getName(0));
     //   Files.createFile(p);
        System.out.println("After creating file does myfile.txt exists ? :" + Files.exists(p));
        //This works with real path which exists. If specified path does not exist in real it throws exception.
        System.out.println(p.toRealPath(LinkOption.NOFOLLOW_LINKS));


        Path myDir = Paths.get("myDir");
        System.out.println("Does myDir exists? :" + Files.exists(myDir));
        System.out.println(myDir.toString());
        System.out.println(myDir.getFileName());
        System.out.println(myDir.toAbsolutePath());
        System.out.println(myDir.getNameCount());
        System.out.println(myDir.getName(0));
     //   Files.createDirectory(myDir);
        System.out.println("After createFile Does file myDir exists? :" + Files.exists(myDir));
        System.out.println(myDir.toRealPath(LinkOption.NOFOLLOW_LINKS));
*/
        Path path1 = Paths.get("/java/source");
        Path path2 = Paths.get("myDir/source/directory");
        Path file = Paths.get("myDir/source/directory/Program.java");
      /*  Files.createDirectory(path1);
        Files.createDirectory(path2);
        Files.createFile(file);*/


        Files.createDirectories(path2);
        Files.createFile(file);
        System.out.println(Files.exists(path2));
    }
}
