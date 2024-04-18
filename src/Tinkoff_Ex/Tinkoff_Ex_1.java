package Tinkoff_Ex;

import MemoryMeasureTraining.MemoryMeasure;

import java.util.Scanner;

public class Tinkoff_Ex_1 {

    public static void main(String[] args) {
        //тестовые данные для ввода
        //fjvndcode
        //fjvndcode123kbm
        //fjvndcode123kbmfgbmcode576345329fkvjbdfrcjde1fvdcode58763

        MemoryMeasure.memoryMeasureKilobytes();
        Scanner scanner = new Scanner(System.in);
        StringBuilder strBuilder = new StringBuilder(scanner.nextLine());
        replacePassword(strBuilder, "???");
        System.out.println(strBuilder);
        MemoryMeasure.memoryMeasureKilobytes();
    }

    public static void replacePassword(StringBuilder line, String replaceText) {

        int start, end, index = 0;
        //ответ -1 придет только в том случае, если индекс превысит длину строки
        // т.е., когда мы пройдем всю строку
        while (line.indexOf("code", index)>-1) {
            start = line.indexOf("code", index);
            end = start + 4 + definePasswordLength(line, start+3);

            line.replace(start, end, replaceText);
            index = end;
        }
    }

    public static int definePasswordLength(StringBuilder line, int indexOfStart) {
        int passwordLength = 0;

        while (isNumber(line.charAt(indexOfStart+passwordLength))) {
            passwordLength++;
            //это условие прописано на случай, если то, что нужно вырезать, попадет в конец строки
            if ((indexOfStart+passwordLength) == line.length()) {
                return 0;
            }
        }
        return passwordLength;
    }
    public static boolean isNumber(char a) {
        return switch (a) {
            case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> true;
            default -> false;
        };
    }

}
