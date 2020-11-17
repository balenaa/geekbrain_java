package hw6;

import java.util.ArrayList;
import java.util.List;

public class TextCombiner implements TextSource {
    private List<TextSource> sources;

    public TextCombiner(List<TextSource> sources){
        this.sources = sources;
    }

    @Override
    public List<String> getText() throws Exception {
        List<String> result = new ArrayList<String>();
        for(TextSource source : this.sources){
            result.addAll(source.getText());
        }
        return result;
    }
}