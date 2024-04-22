package GreedAlgorithm;

import java.util.*;

public class Prim {
    public static void main(String[] args) {
        List<Point> listOfPoints = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listOfPoints.add(new Point(random.nextDouble(20), random.nextDouble(20)));
        }

//        List<Point> listOfPath = new LinkedList<>();
        Iterator<Point> iterator = listOfPoints.iterator();
        Point start = new Point(listOfPoints.get(0));
        double finalDistance = 0;
        while (iterator.hasNext()) {
            start = start.setPath(start, listOfPoints);
            finalDistance += start.getPerfectDistance();
        }
        System.out.println(finalDistance);
    }
}
