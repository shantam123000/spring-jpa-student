package paymentInfoApp.paymentValidator;

import paymentInfoApp.Exceptions.PaymentException;

import java.util.HashMap;
import java.util.Map;

public class PaymentValidator {

    private final Map<String, Integer> accountDetails = new HashMap<>();

    public PaymentValidator() {
        accountDetails.put("1001", 10000);
        accountDetails.put("1002", 20000);
        accountDetails.put("1003", 30000);

    }

    public boolean isValidAmount(String accountNumber, double amount) {

        if (accountDetails.containsKey(accountNumber) && !accountNumber.isEmpty()) {
            if (amount > accountDetails.get(accountNumber)) {
                throw new PaymentException("insufficient amount ");
            } else {
                return true;
            }
        } else {
            throw new PaymentException("Invalid Account");
        }
    }

}
