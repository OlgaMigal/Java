package homework.hometask6.task1and2;

//import java.io.BufferedReader;
import java.io.*;
//import java.io.FileWriter;
//import java.io.IOException;
import java.lang.Exception;

/*
1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
2. Пусть дан список сотрудников:Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова,
Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова,
Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. Для сортировки можно использовать TreeMap, мы не успели,
но я расписал пример использования и прикрепил к материалам урока в файле TestTreeMap



 */


public class PhoneBook {
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
    public static void fileCreator(){
        try (FileWriter writer = new FileWriter("file.txt", false)) {
            String text = "TEST TEST TEST HELP ME";
            writer.write(text);
            writer.flush();
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
//
//
//
//    }
//
//    public void fileCreator() throws IOException {
//
//
//}
//
//
//class Interface{
//
//}
//
//class ActionsWithPhoneBook{
//
//}




