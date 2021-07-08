package bank.management.system;

public class Bank {
    private String name;
    private static int profitEarned;
    private int amountSpent;

    public Bank(String name) {
        this.name = name;
        amountSpent = 0;
    }

    //setter functions
    public static void updateProfitEarned(int profit) {
        profitEarned += profit;
    }

    public void setAmountSpent(int amountSpent) {
        this.amountSpent = amountSpent;
    }

    //getter functions
    public String getName() {
        return name;
    }

    public int getProfitEarned() {
        return profitEarned;
    }

    public int getAmountSpent() {
        return amountSpent;
    }

    @Override
    public String toString() {
        return "Bank Name: "+name;
    }
}
