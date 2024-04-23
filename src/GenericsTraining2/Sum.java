package GenericsTraining2;

public class Sum<E extends Number> implements PointOperations{
    @Override
    public MyPoint<E> operation(MyPoint<E> a, MyPoint<E> b) {
        return a.getX();
    }
}
