package account;

public class AccountService {

    Logger logger = new Logger();

    public void withdraw(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
            logger.log(amount + " has been withdraw from " + accountNumber);
            //System.out.println(amount + " has been withdraw from " + accountNumber);
        }
    }

    public void deposit(String accountNumber, double amount) {
        if(amount>0 && AccountNumberValidator.validate(accountNumber)) {
            logger.log(amount + " has been deposit into " + accountNumber);
            System.out.println(amount + " has been deposit into " + accountNumber);
        }
    }
}
