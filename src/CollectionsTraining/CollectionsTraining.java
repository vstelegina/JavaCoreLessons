package CollectionsTraining;

import java.util.*;

public class CollectionsTraining {
    public static void main(String[] args) {

        //лист с 100 рандомными числами от 0 до 20, удалить четные числа через итератор, закинуть в TreeSet
        Collection<Integer> myList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i<=100; i++) {
            myList.add(random.nextInt(20));
        }
        System.out.println(myList);

        Iterator<Integer> iterator = myList.iterator();

        //вообще-то можно и через removeIf и лямбда-выражение, но пока не дошла до этой темы
        while (iterator.hasNext()) {
            if (iterator.next()%2 == 0) {
                iterator.remove();
            }
        }

        Collection<Integer> myTree = new TreeSet<>(myList);
        System.out.println(myTree);
    }


    public static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

}
