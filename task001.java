import java.util.LinkedList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class task001 {
    public static void main(String[] args) {
        Random rnd_arr = new Random();
        LinkedList<Integer> rnd_list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd_arr.nextInt(100);
            rnd_list.add(val);
        }
        System.out.printf("Список из случайных чисел: %s\n", rnd_list);
        LinkedList<Integer> even_arr = new LinkedList<Integer>();
        for (int i = 0; i < rnd_list.size(); i++) {
            if (rnd_list.get(i) % 2 == 0) {
               even_arr.add(rnd_list.get(i));
            }
        }
        for (Object even : even_arr) {
            rnd_list.remove(even);
        }
        System.out.printf("Новый список, без четных чисел: %s\n", rnd_list);
    }
}