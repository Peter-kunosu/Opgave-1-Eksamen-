import java.util.Scanner;
public class Cykelregistrering {
Scanner scan = new Scanner(System.in);
TextUI ui = new TextUI();
Regristering rg = new Regristering();


    public void cykelregistreringMenu() {
        boolean running = true; // Gør at selve while loopet kan stoppes igen efter man har valgt 2) Afslut!
        while (running) {

            System.out.println("\nVelkommen til cykelregistreringen");
            System.out.println("---------------------------------");
            System.out.println("1) Registrer ture");
            System.out.println("2) Afslut");

            char cNumber = scan.next().charAt(0); // Dette er måden jeg scanner brugerens svar!

            if (cNumber != '1' && cNumber != '2'){ // Et lille safety net for at brugeren ikke ødelægger koden ved at skrive et bogstav!
                ui.displayMsg("Ugyldigt Valg!");

            } else {
                switch (cNumber) {
                    case '1':
                        ui.displayMsg("Du har valgt at registrere dine cykelture!");
                        rg.registrering();
                        break;
                    case '2':
                        ui.displayMsg("Ses en anden gang!");
                        running = false;
                    }

                }
            }
        }
    }
