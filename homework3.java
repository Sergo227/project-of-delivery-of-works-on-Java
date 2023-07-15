// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Collections;
public class homework3 {
    public static List<Integer> getRandomList() {
        Random random = new Random();
        int size = 20;
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println(list.toString());
        return list;
    }

    public static List<Integer> deletEvenNum(List<Integer> list) {

        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }

        }
        System.out.println(list.toString());
        return list;
    }

    public static void mainf(String[] args) {
        deletEvenNum(getRandomList());
    }

 public static void getRezult(List<Integer> list) {
        int min = Collections.min(list);
        int max = Collections.max(list);
        int count = list.size();
        int sum = 0;
        
        for (Integer i : list) {
            sum += i;
        }

        double result = sum / count;

        System.out.printf("Минимальное: %d, максимальное: %d, среднее арифметичское: %f", min, max, result);

    }

    public static void main(String[] args) {
        getRezult(getRandomList(20));
    }
}
