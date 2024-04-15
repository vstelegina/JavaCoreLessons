package GenericsTraining;

public class Gen <T>{
    T obj;
    Gen(T o) {
        obj = o;
    }

    void forA(Gen <? extends A> a){
        System.out.println(a);
    }

    void forB(Gen <? super B> b) {
        System.out.println(b);
    }
}
