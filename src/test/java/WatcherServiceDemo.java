import java.nio.file.*;
import java.util.HashMap;
import java.util.Map;

import static java.nio.file.StandardWatchEventKinds.*;

public class WatcherServiceDemo {
    public static void main(String[] args) {
        Map<WatchKey, Path> keyMap = new HashMap<>();
        try(WatchService service = FileSystems.getDefault().newWatchService()) {
            Path path  = Paths.get("files");
            keyMap.put(path.register(service,ENTRY_CREATE,ENTRY_DELETE,ENTRY_MODIFY),path);
            WatchKey watchKey;
            do {
                watchKey= service.take();
                Path eventDIr = keyMap.get(watchKey);
                for (WatchEvent<?> event:watchKey.pollEvents()){
                    WatchEvent.Kind<?> kind = event.kind();
                    Path eventPath =(Path)event.context();
                    System.out.println(eventDIr + " : " + kind + " : " + eventPath);
                }
            }while (watchKey.reset());
        }
        catch (Exception e){

        }
    }
}
