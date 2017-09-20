import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        int number = 10000;

        UnsortedList usl = new UnsortedList(number);

        SortedList sl = new SortedList(number);

        File dictionary = new File("/Users/oliverscotten/IdeaProjects/List_Project/Helper Code/src/data.txt");

        Scanner in = null;
        try {
            in = new Scanner(dictionary);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (in.hasNextLine()){

            String e = in.nextLine();

            usl.add(e);
            sl.add(e);

        }

        System.out.println("Unsorted: " + usl.toString());
        System.out.println("Sorted: " + sl.toString());

    }
}
