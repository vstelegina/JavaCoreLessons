package GreedAlgorithm;

import java.util.Iterator;
import java.util.LinkedList;

public class Point<E extends Number> {
    private E x;
    private E y;

    public Point(E x, E y) {
        this.x = x;
        this.y = y;
    }

    public E getX() {
        return x;
    }

    public void setX(E x) {
        this.x = x;
    }

    public E getY() {
        return y;
    }

    public void setY(E y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "\nPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point<E> setPath(Point<E> point, LinkedList<Point<E>> listOfPoints) {

        Iterator<Point<E>> iterator = listOfPoints.iterator();
        Point<E> perfectDistance = listOfPoints.get(1);

       while (iterator.hasNext()) {
           if (setDistance(point, iterator.next()) < setDistance(point, perfectDistance)) {
                perfectDistance = iterator.next();
           }
       }
        return perfectDistance;
    }

    public Point<E> setDistance(Point<E> a, Point<E> b) {


        E x_ = a.x - b.x;
        double sqrt = Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow((a.y - b.y), 2));
        return sqrt;
    }
}
