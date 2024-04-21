package GreedAlgorithm;

import java.util.Iterator;
import java.util.LinkedList;

public class Point<Double> {
    private Double x;
    private Double y;


    public Point(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point<Double> a) {
        this.x = a.x;
        this.y = a.y;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "\nPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point<Double> setPath(Point<Double> point, LinkedList<Point<Double>> listOfPoints) {

        Iterator<Point<Double>> iterator = listOfPoints.iterator();
        Point<Double> perfectDistance = listOfPoints.get(0);

       while (iterator.hasNext()) {
           if (setDistance(point, iterator.next()) < setDistance(point, perfectDistance)) {
                perfectDistance = iterator.next();
           }
       }
        return perfectDistance;
    }

    public double setDistance(Point<Double> a, Point<Double> b) {
        double x_ = a.x - b.x;
        double y_ =a.y - b.y;
        return Math.sqrt(Math.pow(x_, 2) + Math.pow((y_), 2));
    }
}
