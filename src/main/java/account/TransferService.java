package account;

import com.sun.deploy.util.StringUtils;

public class TransferService {
    Logger logger = new Logger();
    public void transfer(final String accountNumberSource,final String accountNumberDestination, double ammount) {
        if(ammount>0 && AccountNumberValidator.validate(accountNumberSource)
                && AccountNumberValidator.validate(accountNumberDestination)) {
            logger.log("money from " + accountNumberSource + " to " + accountNumberDestination + " has been transferred ...");
           // System.out.println("money from " + accountNumberSource + " to " + accountNumberDestination + " has been transferred ...");

        }
    }
}
