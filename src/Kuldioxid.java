public class Kuldioxid {
private int ture;

    public Kuldioxid(int ture){ // Bruges til at sætte en start værdi når klassen kaldes!
        this.ture = ture;
    }

    public double co2Beregner (int ture){ // Kort lille klasse som har en enkelt metode for at gøre det pænere.
        double sum = 0;
        sum = ture * 2.6;
        return sum;
    }
}
