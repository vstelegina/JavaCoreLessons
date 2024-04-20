package GreedAlgorithm;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class GreedAlgorithm {
    public static void main(String[] args) {
        List<Point> listOfPoints = new LinkedList<Point>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listOfPoints.add(new Point(random.nextDouble(20), random.nextDouble(20)));
        }
        System.out.println(listOfPoints);
    }
}
