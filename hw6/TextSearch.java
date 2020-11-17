package hw6;

public class TextSearch {
    public boolean hasText (TextSource source, String search_word) throws Exception{
        for(String line: source.getText()){
            if (line.contains(search_word)){
                return true;
            }
        }
        return false;
    }
}
