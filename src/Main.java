import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/* 1. Обход дерева в глубину
    2. Поиск файла по названию
    3. Поиск фала по размеру
    4. Поиск файла по типу
    5. Поиск фала рекурсией
    6. Поиск фала без рекурсии
 */

public class Main {

    // печать дерева
    public static void pritTree(List<File> list) {
        System.out.println("Начало Списка");
        System.out.println("___________________________________________");
        for (File x : list) {
            System.out.println(x.getAbsolutePath());
        }
        System.out.println("___________________________________________");
        System.out.println("Конец Списка");
    }

    //Обход с рекурсией//
    public static void searchFiles(File rootFile, List<File> files) {
        if (rootFile.isDirectory()) {
            File[] files1 = rootFile.listFiles();
            if (files1 != null) {
                for (File file : files1) {
                    System.out.println(file.getAbsolutePath());
                    if (file.isDirectory()) {
                        searchFiles(file, files);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".pdf") & file.getName().toLowerCase().contains("java"))
                            files.add(file);
                    }
                }
            }
        }
    }

    //обход без рекурсии и поиск файла по формату//
    public static List<File> searchFiles(File root, String formatFile) {
        if (root != null) {
            List<File> result = new ArrayList<>();
            Queue<File> queue = new PriorityQueue<>();
            Collections.addAll(queue, root.listFiles());
            while (!queue.isEmpty()) {
                File fileQueue = queue.remove();
                if (fileQueue.isDirectory()) {
                    Collections.addAll(queue, fileQueue.listFiles());
                } else {
                    if(fileQueue.getName().toLowerCase().endsWith(formatFile))
                    result.add(fileQueue);
                }
            }
            System.out.println(result.size());
            return result;
        }
        return null;
}

    public static List<File> searchFilesName(File root, String name) {
        if (root != null) {
            List<File> result = new ArrayList<>();
            Queue<File> queue = new PriorityQueue<>();
            Collections.addAll(queue, root.listFiles());
            while (!queue.isEmpty()) {
                File fileQueue = queue.remove();
                if (fileQueue.isDirectory()) {
                    Collections.addAll(queue, fileQueue.listFiles());
                } else {
                    if(fileQueue.getName().toLowerCase().contains(name))
                        result.add(fileQueue);
                }
            }
            System.out.println(result.size());
            return result;
        }
        return null;
    }


    public static void main(String[] args) throws ParseException {
//        File path = new File("C:\\Users\\Ilya\\Documents\\MarketPlaceManadgments");
//        List<File> result = new ArrayList<>();
//        searchFiles(new File("D:\\"),result);
//        pritTree(result);
//        pritTree(searchFiles(path,".xlsx"));
        Date date = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-dd-MM", Locale.ENGLISH);
        System.out.println(simpleDateFormat2.format(date));


    }
}