import java.util.Scanner;

public class TextUI {
    Scanner scan = new Scanner(System.in);

    public String displayMsg (String msg) {
        System.out.print(msg);
        return msg;
    }

    public boolean choiceYN(String msg) {
        this.displayMsg(msg);
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("Y")) {
            return true;
        } else {
            return input.equalsIgnoreCase("N") ? false : this.choiceYN(msg); // Kører indtil brugeren faKtisk svare Yes eller No ved hjælp af rekursion.
        }
    }
}
