public class Klimarabat {
    private String måned;
    private int ture;
    private int rabat;
    TextUI ui = new TextUI();

    public Klimarabat (String måned, int ture){
        this.måned = måned;
        this.ture = ture;
    }

    public int rabat (String måned, int ture){
        int rabat;

        switch (måned.toLowerCase()) {
            case "november", "december", "januar", "februar", "marts":
                rabat = 15;
                break;

            case "april", "maj", "juni", "juli", "august", "september", "oktober":
                rabat = 10;
                break;

            default:
                System.out.println("Ugyldig måned");
                return 0;
        }
        if (ture >= 20) {
            int sum = rabat * ture + 50;
            System.out.println("Rabat for " + måned + ": " + sum + " kr. (Ekstra 50 kr for 20+ ture!!");
            return sum;
        } else {
            int sum = rabat * rabat;
            System.out.println("Rabat for " + måned + ": " + sum + " kr.");
            return sum;
        }
    }
}
