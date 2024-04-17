package EnumTraining;

import java.util.Arrays;

public class StartEnum {
    public static void main(String[] args) {
        Pair<Day, Integer>[] schedule = new Pair[3];
        schedule[0] = new Pair<>(Day.Monday, 7);
        schedule[1] = new Pair<>(Day.Tuesday, 8);
        schedule[2] = new Pair<>(Day.Wednesday, 3);

        Arrays.stream(schedule).map(p -> p.getKey() + " " + p.getValue()).forEach(System.out::println);
    }
}
