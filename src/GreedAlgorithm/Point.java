package GreedAlgorithm;

import java.util.Iterator;
import java.util.List;

public class Point {
    private double x;
    private double y;
    private double perfectDistance;

    public double getPerfectDistance() {
        return perfectDistance;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point a) {
        this.x = a.x;
        this.y = a.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "\nPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point setPath(Point point, List<Point> listOfPoints) {

        Iterator<Point> iterator = listOfPoints.iterator();
        Point distance = listOfPoints.get(0);


       while (iterator.hasNext()) {
           if (setDistance(point, iterator.next()) < setDistance(point, distance)) {
                distance = iterator.next();
           }
       }
       perfectDistance = setDistance(point,distance);
        return distance;
    }

    public double setDistance(Point a, Point b) {
        double x_ = a.x - b.x;
        double y_ =a.y - b.y;
        return Math.sqrt(Math.pow(x_, 2) + Math.pow((y_), 2));
    }
}
