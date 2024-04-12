import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter list of items: ");
        String input = scnr.nextLine();
        
        String[] data = input.split(" ");

        int count = 0;
        int longest = 0;
        boolean isint = false;
        for (int i = 0; i < data.length; i++) {
            try {
                Integer.parseInt(data[i]);
                isint = true;
            } catch (Exception e) {
                isint = false;
            }

            if (isint) {
                count += 1;
            } else {
                count = 0;
            }

            if (count > longest) {
                longest = count;
            }
        }

        System.out.println("Longest sequence = " + longest);

        scnr.close();
    }
}
