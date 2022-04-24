package paymentInfoApp.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PassengerInfo {

    @Id
    private int passengerId;

    private String passengerName;
    private String passengerAccNumber;
    private double amount;
    private String passengerEmail;
    private String passengerNumber;


}
