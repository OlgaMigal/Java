package homework.hometask6.task2;


import java.util.*;

/*
Пусть дан список сотрудников:
Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов,
Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова,
 Иван Мечников, Петр Петин, Иван Ежов.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности. Для сортировки использовать TreeMap
 */
public class ListActions {
        public static void main (String[]args){
            List<String> myList = List.of("Иван Иванов", "Светлана Петрова", "Кристина Белова",
                    "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                    "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                    "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
                    "Петр Петин", "Иван Ежов");

            String[] array;
            List<String> namesOnly = new ArrayList<>();

            for (int i = 0; i < myList.size(); i++) {
                array = myList.get(i).split(" ", 2);
                namesOnly.add(array[0]);
            }
            Map<String, Integer> notFinalMap = counterAndSorter(namesOnly);
            System.out.println(sortByValues(notFinalMap));
        }
        static Map<String, Integer> counterAndSorter(List < String > namesOnly) {
            Map<String, Integer> nameCounter = new TreeMap<>();
            for (int i = 0; i < namesOnly.size(); i++) {
                if (nameCounter.containsKey(namesOnly.get(i))) {
                    nameCounter.put(namesOnly.get(i), nameCounter.get(namesOnly.get(i)) + 1);
                } else {
                    nameCounter.put(namesOnly.get(i), 1);
                }
            }
            Map<String, Integer> sorted = new TreeMap<>();
            int max_value = 0;
            for (int value : nameCounter.values()) {
                if (value > max_value) {
                    max_value = value;
                }
            }
            for (int i = max_value; i > 0; i--) {
                for (Map.Entry<String, Integer> count : nameCounter.entrySet()) {
                    String key = count.getKey();
                    if (nameCounter.get(key) == i) {
                        sorted.put(key, nameCounter.get(key));
                    }
                }
            }
            return sorted;
        }
        public static <K, V extends Comparable<V>> Map<K, V> sortByValues(final Map<K, V> map) {
            Comparator<K> valueComparator = new Comparator<K>() {
                public int compare(K k1, K k2) {
                    int compare = map.get(k2).compareTo(map.get(k1));
                    if (compare == 0)
                        return 1;
                    else
                        return compare;
                }
            };
            Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
            sortedByValues.putAll(map);
            return sortedByValues;
        }
}

//    не обращайте, пожалуйста, внимания на код ниже - я тестила создание файла, и пока
//    не готова его удалять, хочу покрутить на досуге (если он когда-нибудь случится)

//    public static void fileCreator(List myList){
//        try (FileWriter writer = new FileWriter("file.txt", false)) {
////            String text = "Мечтаю сдать домашку";
//            writer.write(myList.toString());
//            writer.flush();
//
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
//    public static void fileReader() throws Exception{
//        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//        String str;
//        while ((str = br.readLine())!=null){
//            System.out.printf("== %s == \n", str);
//        }
//        br.close();
//    }
//}
