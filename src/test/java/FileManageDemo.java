import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileManageDemo {

    public static void main(String[] args)throws IOException {
        /*Path source = Paths.get("files/source.txt");
        System.out.println(source.getFileName());
        Path target = Paths.get("files/target.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);


        Path newDir = Paths.get("files/newDir");
        Files.createDirectory(newDir);
        Files.move(source,newDir.resolve(source.getFileName()),StandardCopyOption.REPLACE_EXISTING);
*/
        Path fileToDelete = Paths.get("files/fileToDelete.txt");
        Files.delete(fileToDelete);
        System.out.println("File deleted successfully");
    }
}
