public class bankaccountmain {
    public static void main(String[] args) {
        bankaccount b = new bankaccount("123456","Sajid");
        b.getBalance();
        System.out.println("AccountBalance:"+ b.getBalance());
    }
}

