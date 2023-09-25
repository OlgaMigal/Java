package homework.hometask6.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ListActions {
    public static void main(String[] args) throws Exception{
        fileCreator();
        fileReader();
//        File file = new File("/Users/anteya/IdeaProjects/Projects/src/homework/hometask6/task1and2/PhoneBook.java/file");
//        if (file.createNewFile()) {
//            System.out.println("Файл создан");
//        } else {
//            System.out.println("Проблемка и не создан");
//        }


    }

//    public static void findDoubleName {
//
//
//    }
    public static void fileCreator(){
        try (FileWriter writer = new FileWriter("file.txt", false)) {
//            String text = "TEST TEST TEST HELP ME";
//            writer.write(text);
//            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void fileReader() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine())!=null){
            System.out.printf("== %s == \n", str);
        }
        br.close();
    }
}
