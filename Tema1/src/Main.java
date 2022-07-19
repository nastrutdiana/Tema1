public class Main {
    public static void main(String[] args) throws Exception {
        Account account = new Account();
        account.deposit(100);
        //account.withdraw(200);
        account.withdraw(70);
        //account.linkToNationalId(123);
        account.linkToNationalId(1111111111111l);

    }
}
