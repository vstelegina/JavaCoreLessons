package GreedAlgorithm;

import java.util.*;

public class GreedAlgorithm {
    public static void main(String[] args) {
        List<Point<Double>> listOfPoints = new LinkedList<Point<Double>>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listOfPoints.add(new Point<>(random.nextDouble(20), random.nextDouble(20)));
        }
        System.out.println(listOfPoints);

        List<Point<Double>> listOfPath = new LinkedList<Point<Double>>();
        Iterator<Point<Double>> iterator = listOfPoints.iterator();
        Point<Double> start = new Point<Double>(listOfPoints.get(0));
        while (iterator.hasNext()) {

        }
    }
}
