package hw6;

/*
*
* Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
*
Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
* TextSource - FileSource, DirSource
* TextCombiner
* TextFinder
*
* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле (работаем только с латиницей).

*
*
* ** Написать метод, проверяющий, есть ли указанное слово в файлах внутри папки
*
* */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void showTextSource(TextSource source) throws Exception{
        for(String s : source.getText()){
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws Exception{
        List<TextSource> col = new ArrayList<TextSource>();
        TextSource ts = new FileTextSource("data\\test.txt");
        TextSource ts2 = new FileTextSource("data\\test2.txt");
        col.add(ts);
        col.add(ts2);

        TextCombiner tc = new TextCombiner(col);
        TextSource ds = new DirTextSource("data");
        String sq = "necessitatibus";

        TextSearch tsrch = new TextSearch();

        System.out.println(tsrch.hasText(ts, sq));
        System.out.println(tsrch.hasText(tc, sq));
        System.out.println(tsrch.hasText(ds, sq));

        // showTextSource(ds);
    }
}
