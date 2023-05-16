package NameReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class KeyboardNameReader implements ShapeNameReader{
    @Override
    public String readName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose shape from the available options: Triangle, Rectangle, Diamond, Circle, Square. ");
        String result = scanner.nextLine();
        scanner.close();
        return result;
    }
}
