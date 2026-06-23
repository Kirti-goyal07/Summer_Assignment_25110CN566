import java.util.Scanner;

public class Q92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        int max = 0;
        char maxChar = ' ';

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] > max) {
                max = freq[str.charAt(i)];
                maxChar = str.charAt(i);
            }
        }

        System.out.println("Maximum Occurring Character: " + maxChar);
        System.out.println("Frequency: " + max);
    }
}