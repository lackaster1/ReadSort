import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReadSort {

    public static void main(String args[]) throws IOException {
        File file = new File("C://Users//Славик//Downloads//Document.txt");

        FileReader reader = new FileReader(file);
        Scanner scan = new Scanner(reader);
        String textFromFile = scan.nextLine();

        reader.close();

// Строки 23 и 24 нужны чтобы убрать какой то неведомый символ,
// который возникает перед числами при запуске программы на моем компе.
// Если при запуске кода вылетает ошибка, закомментируйте эти строки.

        String removeFirstChar = textFromFile;
        removeFirstChar = removeFirstChar.substring(1);

        String[] integerStrings = removeFirstChar.split(",");
        Integer[] integers = new Integer[integerStrings.length];
        for (
                int i = 0;
                i < integers.length; i++) {
            integers[i] = Integer.parseInt(integerStrings[i]);
        }
        Arrays.sort(integers);
        System.out.println(Arrays.toString( integers ));

        Arrays.sort(integers, Collections.reverseOrder());
        System.out.println(Arrays.toString( integers ));
    }
}
