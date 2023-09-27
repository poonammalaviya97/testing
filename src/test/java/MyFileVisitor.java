import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)throws IOException{
        System.out.println("About to visit " + dir);
        //Keep on navigating the tree
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
        if(attrs.isRegularFile()){
            System.out.println("Regular file");
        }
        System.out.println(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file,IOException ex) throws IOException{
        System.err.println(ex.getMessage());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir,IOException exc)throws IOException{
        System.out.println("Just visited" + dir );
        return FileVisitResult.CONTINUE;
    }
}

class VisitorDemo{
    public static void main(String[] args)throws IOException{
        Path path = Paths.get("files");
        MyFileVisitor myFileVisitor = new MyFileVisitor();
        Files.walkFileTree(path,myFileVisitor);
    }
}
