package MemoryMeasureTraining;

public class MemoryMeasure {
    static long usedMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();

    public static void memoryMeasureBytes() {
        //помни, что получаем мы все это добро в байтах, так что раздели правильно,
        // если надо будет пересчитать на кб, мб или гб
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory() + "bytes");
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory() + "bytes");
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() + "bytes");
        System.out.println("Used memory: " + usedMemory + "bytes");
        System.out.println("________________________________________________________");
        System.out.println("Garbage Collector call... ");
        System.out.println("________________________________________________________");
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory() + "bytes");
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory() + "bytes");
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() + "bytes");
        usedMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println("Used memory: " + usedMemory + "bytes");
    }

    public static void memoryMeasureKilobytes() {
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory() / 1024 + "kb");
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory() / 1024 + "kb");
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() / 1024 + "kb");
        System.out.println("Used memory: " + usedMemory / 1024 + "kb");
        System.out.println("________________________________________________________");
        System.out.println("Garbage Collector call... ");
        System.out.println("________________________________________________________");
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory() / 1024 + "kb");
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory() / 1024 + "kb");
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() / 1024 + "kb");
        usedMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println("Used memory: " + usedMemory / 1024 + "kb");
    }

    public static void memoryMeasureMegabytes() {
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory() / 1048576 + "mb");
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory() / 1048576 + "mb");
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() / 1048576 + "mb");
        System.out.println("Used memory: " + usedMemory / 1048576 + "mb");
        System.out.println("________________________________________________________");
        System.out.println("Garbage Collector call... ");
        System.out.println("________________________________________________________");
        System.out.println("Max memory: " + Runtime.getRuntime().maxMemory() / 1048576 + "mb");
        System.out.println("Total memory: " + Runtime.getRuntime().totalMemory() / 1048576 + "mb");
        System.out.println("Free memory: " + Runtime.getRuntime().freeMemory() / 1048576 + "mb");
        usedMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        System.out.println("Used memory: " + usedMemory / 1048576 + "mb");
    }

}
