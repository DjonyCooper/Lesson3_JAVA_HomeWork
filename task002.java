import java.util.Random;
import java.util.ArrayList;

//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

public class task002 {
    public static void main(String[] args) {
        Random rnd_arr = new Random();
        ArrayList<Integer> first_list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd_arr.nextInt(100);
            first_list.add(val);
        }
        System.out.printf("Целочисленный список: %s\n", first_list);
        int max = 0;
        int min = first_list.get(0);
        double arith_mean = 0.0;
        for (int i = 0; i < first_list.size(); i++) {
            if (max < first_list.get(i)) {
                max = first_list.get(i);
            } 
            if (min > first_list.get(i)) {
                min = first_list.get(i);
            }
            arith_mean += first_list.get(i);
        }
        System.out.printf("Максимальное значение: %s\n", max);
        System.out.printf("Минимальное значение: %s\n", min);
        System.out.printf("Ср. арифметическое значение: %s\n", arith_mean/first_list.size());
    }
}
