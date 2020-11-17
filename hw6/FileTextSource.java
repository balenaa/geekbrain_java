package hw6;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileTextSource implements TextSource {
    private  String filename;

    public FileTextSource(String filename){
        this.filename = filename;
    }

    @Override
    public List<String> getText() throws Exception {
        return  Files.readAllLines(Paths.get(this.filename), StandardCharsets.UTF_8);
    }
}
