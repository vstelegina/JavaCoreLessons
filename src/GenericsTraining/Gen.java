package GenericsTraining;

public class Gen <T>{
    T obj;
    Gen() {}

    static void setA(Gen<? extends A> a){
        System.out.println("A");
    }

    static void setB(Gen<? super B> b) {System.out.println("B");
    }

    public static void main(String[] args) {
        //инициализируем объекты
        Gen<A> genA = new Gen<>();
        Gen<B> genB = new Gen<>();
        Gen<C> genC = new Gen<>();

        //очевидно рабочие варианты
        setA(genA);
        setB(genB);

        //работает, потому что B, C - наследники A, и использовано extends
        setA(genB);
        setA(genC);

        //работает, потому что A - родитель B, и использовано super
        setB(genA);

        //не работает, потому что super обращается к текущему классу (В) и его родителям (А), а класс С - "братский",
        //т.е. С != В, и С не является родителем для А
        setB(genC);
    }
}
