public class bankaccount {
    private String accno;
    private String username;
    private double balance;

    public bankaccount(String accno, String username) {
        this.accno = accno;
        this.username = username;
    }

    public bankaccount(String accno) {
        this.accno = accno;
    }

    public double getBalance() {
        return this.balance;

    }

    public void deposit(double depositamount) {
        if (depositamount <= 0) {
            throw new IllegalArgumentException("Connot deposit amount");
        }
        this.balance = this.balance += depositamount;
    }
}

