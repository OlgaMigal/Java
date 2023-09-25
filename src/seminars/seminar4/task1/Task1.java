package seminars.seminar4.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
//        List<Integer> list = new ArrayList<>();
        long timeStart = System.currentTimeMillis();
        for (int i= 0; i < 100000; i++) {
            list.add(i);
        }
        long timeFinish = System.currentTimeMillis();

        System.out.println(timeFinish - timeStart);
    }
}
