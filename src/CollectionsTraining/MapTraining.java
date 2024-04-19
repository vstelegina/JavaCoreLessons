package CollectionsTraining;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraining {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Germany");
        map.put(2, "France");
        map.put(3, "Japan");
        map.put(4, "China");
        map.put(5, "Norway");

        String first = map.get(4);
        System.out.println(first);

        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys);

        Collection<String> values = map.values();
        System.out.println("Values: " + values);

        map.replace(2, "Italy");
        map.remove(1);
        System.out.println(values);

        //Map.Entry позволяет обращаться к элементам хэшмапа, вытягивая сразу пару ключ-значание
        for (Map.Entry<Integer,String> item: map.entrySet()) {
            //интересная штука
            //printf - форматированная печать
            //%d, %s - соответственно, автоподстановка для числа или строки, порядок определяется порядком после текста
            System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
        }
    }
}
