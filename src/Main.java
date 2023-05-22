public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10_001;
        int rubelsForOneBonusMile = 20;
        int totalBonusMiles = ticketPrice / rubelsForOneBonusMile;
        System.out.printf("Количество бонусных миль за билет: " + totalBonusMiles);
    }
}