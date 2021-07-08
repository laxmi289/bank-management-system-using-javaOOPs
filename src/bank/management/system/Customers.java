package bank.management.system;

public class Customers {
    private int id;
    private String name;
    private long acc_no;
    private double bank_balance;
    private int deposit_amount;
    private int withdraw_amount;

    public Customers(int id, String name, long acc_no) {
        this.id = id;
        this.name = name;
        this.acc_no = acc_no;
        bank_balance = 0;
        this.deposit_amount = 0;
        withdraw_amount = 0;
    }


    //getter functions for id,name,acc_no,bank_balance
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAcc_no() {
        return acc_no;
    }

    public double getBank_balance() {
        return bank_balance;
    }

    public int getDeposit_amount() {
        return deposit_amount;
    }

    public int getWithdraw_amount() {
        return withdraw_amount;
    }


    //setter functions for bank_balance
    public void setBank_balance(double bank_balance) {
        this.bank_balance = bank_balance;
    }

    public void setDeposit_amount(int deposit_amount) {
        bank_balance += deposit_amount;
        this.deposit_amount = deposit_amount;
        Bank.updateProfitEarned(deposit_amount);
    }


    public void setWithdraw_amount (int withdraw_amount) {
        bank_balance -= withdraw_amount;
        this.withdraw_amount = withdraw_amount;
    }

    public int depositDetails() {
        return deposit_amount;
    }

    public int withdrawDetails() {
        return withdraw_amount;
    }

    @Override
    public String toString() {
        return "Id: "+id+" | Name: "+name+" | Account No.: "+acc_no+ " | Bank Balance: $"+bank_balance;
    }
}
