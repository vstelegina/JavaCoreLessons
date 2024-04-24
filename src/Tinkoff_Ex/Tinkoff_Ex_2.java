package Tinkoff_Ex;

import java.util.*;

public class Tinkoff_Ex_2 {
    public static void main(String[] args) {
        //1 вход - количество
        //2 вход - высота каждой книги

        //разложить книги по стопкам так, чтобы книги одинаковой высоты были в одной стопке

        //выход 1 - количество стопок
        //выход 2 - количество книг в каждой стопке, выводится в порядке возрастания количества в стопке

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        //получаем всю строку данных
        String s = sc.nextLine();
        String[] array = s.split(" ");
        //зачем заморачиваться с переводом в int, если все прекрасно будет работать и без этого?
        //перевод трудоемок, может вызвать ошибки и исключения, а вот символы в любом случае подаются
        //в кодировке unicode
        //достаточно просто обработать все в формате String
        //вот если бы попросили операции сделать, тогда да

        //к сожалению, это самый простой и быстрый вариант (в теории). Меньше нельзя - потому что может быть случай,
        // когда книги каждой высоты по одной штуке, больше не надо, потому что книг не может быть больше.
        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < count; i++) {
            if (array[i].isEmpty()) {
                continue;
            }
            else {
                int a = findBooks(array[i], array);
            }
        }

    }

    public static int findBooks(String key, String[] array) {
        int value = 0;
        for (int j=0; j< array.length; j++) {
            if (array[j].equals(key)) {
                value++;
                array[j]="";
            }
        }
        return value;
    }
}
