import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public class PathFileFinder extends SimpleFileVisitor<Path> {
    private PathMatcher matcher;
    ArrayList<Path> matchList = new ArrayList();

    public PathFileFinder(String pattern) {
        matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attr) throws IOException {
        Path name = file.getFileName();
        System.out.println("Examining file:" + name);
        if (matcher.matches(name)) {
            System.out.println();
            matchList.add(name);
        }

        return FileVisitResult.CONTINUE;
    }

}

class PathMatcherDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("files");
        PathFileFinder finder = new PathFileFinder("*.txt");
        Files.walkFileTree(path,finder);
        ArrayList<Path> matchList  =finder.matchList;
        System.out.println(matchList);
        if (matchList.size() >0){
            for (Path p:matchList){
                System.out.println(p.getFileName());
            }
        }else {
            System.out.println("No files found");
        }
    }
}
