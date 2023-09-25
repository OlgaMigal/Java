package homework.hometask6.task1;
import java.util.*;

/*
1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */
public class PhoneBook {
        public static int getChoice() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("1 - Добавление контакта \n2 - Вывод всех контактов \n3 - Поиск по фамилии \n4 - Выход");
            String choice = scanner.nextLine();
            switch (choice) {
                case ("1"):
                    return 1;
                case ("2"):
                    return 2;
                case ("3"):
                    return 3;
                case ("4"):
                    return 4;
            }
            return 0;
        }
        public static void actions() {
            Scanner scanner = new Scanner(System.in);
            Map<String, ArrayList<String>> phoneBook = new HashMap<>();
            add: while (true) {
                int choice = getChoice();
                if (choice == 1) {
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер телефона: ");
                    String number = scanner.nextLine();
                    if (!phoneBook.containsKey(name)) {
                        ArrayList<String> numbers = new ArrayList<>();
                        numbers.add(number);
                        phoneBook.put(name, numbers);
                    } else {
                        var numbers = phoneBook.get(name);
                        numbers.add(number);
                        phoneBook.put(name, numbers);
                    }
                }
                if (choice == 2) {
                    System.out.println(phoneBook);;
                }
                if (choice == 3) {
                    System.out.println("Введите имя для поиска: ");
                    String name = scanner.nextLine();
                    System.out.println(phoneBook.get(name));
                }
                if (choice == 4) {
                    break;
                }
            }
            scanner.close();
        }
        public static void main(String[] args) {
            actions();


    }
}
