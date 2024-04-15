package Forest;

public class Tree extends Trees{
    String name = "Apple tree";
    @Override
    public void create() {
        this.name = "Pine";
        System.out.println("Дерево создано!");
    }
    public void create(String name) {
        this.name = name;
        System.out.println("Дерево " + name + " создано!");
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                '}';
    }
}
