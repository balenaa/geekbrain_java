package hw6;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DirTextSource implements TextSource {
    private TextCombiner combiner;

    public DirTextSource(String pathToDir) throws Exception{
        List<TextSource> sources = new ArrayList<TextSource>();
        File dir = new File(pathToDir);
        for (String path : dir.list()){
            sources.add(new FileTextSource(Paths.get(pathToDir,path).toString()));
        }
        this.combiner = new TextCombiner(sources);
    }

    @Override
    public List<String> getText() throws Exception {
        return this.combiner.getText();
    }
}
