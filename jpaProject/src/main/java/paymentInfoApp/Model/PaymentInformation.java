package paymentInfoApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
public class PaymentInformation {

    @Id
    private int paymentId;

    private String passengerName;
    private String accNumber;
    private double amount;

}
