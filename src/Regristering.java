import java.util.Scanner;

public class Regristering {
    Scanner scan = new Scanner(System.in);
    TextUI ui = new TextUI();

    public void registrering () {
        boolean running = true;
        int samletRabat = 0;
        double co2 = 0;
        double samletTræer = 0;

        while (running) {
            ui.displayMsg("\nDu skal bare udfylde følgende spørgsmål");

            ui.displayMsg("\nHvilken måned vil du registrere?: ");
            String måned = scan.nextLine();

            ui.displayMsg("Hvor mange ture har du cyklet?: ");
            int ture = scan.nextInt();
            scan.nextLine();

            Klimarabat rb = new Klimarabat(måned, ture);
            int beregnetRabat = rb.rabat(måned, ture);

            Kuldioxid kd = new Kuldioxid(ture);
            double beregnetCo2 = kd.co2Beregner(ture);

            samletRabat += beregnetRabat;
            co2 += beregnetCo2;
            samletTræer = co2 / 20;


            running = ui.choiceYN("Vil du registrere endnu en måned? (Y/N)");
        }
        ui.displayMsg("\nTak for at gøre klimaet sundere!");
        ui.displayMsg("\nSamlet rabat i alt: " + samletRabat + " kr. og vil blive overført til NemKonto.");
        ui.displayMsg("\nDu har samlet sparet klimaet for " + co2 + "kg CO2 og træ-ækvivalent på " + samletTræer + " træers årlige absorption.");
        ui.displayMsg("\n ");
    }
}
