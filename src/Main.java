public class Main {
    public static void main(String[] args) {
        Cykelregistrering cr = new Cykelregistrering();
        TextUI ui = new TextUI();

        try {
            cr.cykelregistreringMenu();
        } catch (Exception e) {
            ui.displayMsg("Noget gik galt" + e.getMessage());
        }
    }
}