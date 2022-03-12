public class Main {
    public static void main(String[] args) {
        int ticketPrice = 1200;
        int milePerRubles = 20;
        int bonusMile = ticketPrice / milePerRubles;

        System.out.println("Количество бонусных милей: " + bonusMile);
    }
}
