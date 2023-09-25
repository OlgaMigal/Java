package homework.hometask5.calculatorWithCancel;

import java.util.LinkedList;

class ICantNameYou {
    public int calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        int res;
        LinkedList<Integer> list = new LinkedList<>();
        if (op!='<'){
            if (op == '+'){
                res = a+b;
                list.addLast(res);
            }
            if (op == '-'){
                res = a-b;
                list.addLast(res);
            }
            if (op == '*'){
                res = a*b;
                list.addLast(res);
            }
            if (op == '/'){
                res = a/b;
                list.addLast(res);
            }
            return res;
        }
        else{
            list.pollLast();
            return list.peekLast();
        }
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Calculator {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        ICantNameYou ICantNameYou = new ICantNameYou();
        int result = ICantNameYou.calculate(op, a, b);
        System.out.println(result);
        int result2 = ICantNameYou.calculate(op2, c, d);
        System.out.println(result2);
        int prevResult = ICantNameYou.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
