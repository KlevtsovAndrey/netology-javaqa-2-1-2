public class Main {
    public static void main(String[] args) {
        int initial_balance = 100;
        int refill = 1100;
        if (refill > 100) {
            int add_to_balance = refill / 100;
            System.out.println(initial_balance + refill+ add_to_balance);
        }
        else {
            System.out.println(initial_balance + refill);
        }
    }
}