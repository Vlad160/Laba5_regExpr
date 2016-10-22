import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Created by Vlad on 22.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        String str;
        try {
            Scanner in = new Scanner(new FileReader("D:\\Univer\\proga\\Laba5_regExpr\\input.txt"));
            while (in.hasNextLine()) {
                str = in.nextLine();
                System.out.println(str);
                if (str.matches("^([0-2][0-9]||[3][0-1])/([0][1-9]||[1][0-2])/([0][0-9]{3})$"))
                    System.out.println("yes");
                else
                    System.out.println("no");
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }

}
