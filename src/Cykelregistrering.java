import java.util.Scanner;
public class Cykelregistrering {
Scanner scan = new Scanner(System.in);
TextUI ui = new TextUI();
Regristering rg = new Regristering();


    public void cykelregistreringMenu() {
        boolean running = true;
        while (running) {

            System.out.println("\nVelkommen til cykelregistreringen");
            System.out.println("---------------------------------");
            System.out.println("1) Registrer ture");
            System.out.println("2) Afslut");

            char cNumber = scan.next().charAt(0);

            if (cNumber != '1' && cNumber != '2'){
                ui.displayMsg("Ugyldigt Valg!");

            } else {
                switch (cNumber) {
                    case '1':
                        ui.displayMsg("Du har valgt at registrere dine cykelture!");
                        rg.registrering();
                    }
                }
            }
        }
    }
