public class Main {
    public static void main(String[] args) {
        int ticket_price = 10_001;
        int rubels_for_one_bonus_mile = 20;
        int total_bonus_miles = ticket_price / rubels_for_one_bonus_mile;
        System.out.printf("Количество бонусных миль за билет: " + total_bonus_miles);
    }
}