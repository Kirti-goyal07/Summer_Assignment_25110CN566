import java.util.Scanner;

public class Q86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        str = str.trim();

        if (str.isEmpty()) {
            System.out.println("Total Words = 0");
        } else {
            String[] words = str.split("\\s+");
            System.out.println("Total Words = " + words.length);
        }
    }
}