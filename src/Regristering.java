import java.util.Scanner;

public class Regristering {
    Scanner scan = new Scanner(System.in);
    TextUI ui = new TextUI();

    public void registrering () {
        boolean running = true;
        int samletRabat = 0;

        while (running) {
            ui.displayMsg("\nDu skal bare udfylde følgende spørgsmål");

            ui.displayMsg("\nHvilken måned vil du registrere?: ");
            String måned = scan.nextLine();

            ui.displayMsg("Hvor mange ture har du cyklet?: ");
            int ture = scan.nextInt();
            scan.nextLine();

            Klimarabat rb = new Klimarabat(måned, ture);
            int beregnetRabat = rb.rabat(måned, ture);

            samletRabat += beregnetRabat;


            running = ui.choiceYN("Vil du registrere endnu en måned? (Y/N)");
        }
        ui.displayMsg("\nTak for at gøre klimaet sundere!");
        ui.displayMsg("\nSamlet rabat i alt: " + samletRabat + " kr.");
    }
}
