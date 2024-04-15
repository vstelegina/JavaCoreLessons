package Inheritance_Ex;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Гав!");
    }
    public void voice(String angryVoice) {
        System.out.println(angryVoice);
    }

    public void voice(int numberOfVoice) {

        for (int i = 0; i<= numberOfVoice; i++) {
            System.out.println("Гав!");
        }
    }
}
