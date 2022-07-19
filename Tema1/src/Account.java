public class Account {
    private int accountNo;
    private int amount;
    private long nationalId;

    public Account() {
        this.amount = 0;
    }

    public void deposit(int amount){
        this.amount += amount;
        System.out.println("You have "+ this.amount + " money");
    }

    public void withdraw(int amount) throws Exception {
        if(amount > this.amount){
            throw new NotEnoughMoneyException("You don't have enough money");
        }else {
            this.amount -= amount;
            System.out.println("You have "+ this.amount + " money");
        }
    }

    public void linkToNationalId(long nationalId) throws InvalidNationalIdException {
        Long nId = nationalId;
        if(nId.toString().length()!=13){
            throw new InvalidNationalIdException("Your id is not correct");
        }
        else {
            this.nationalId = nationalId;
            System.out.println("Your id is: " + this.nationalId);
        }
    }
}
