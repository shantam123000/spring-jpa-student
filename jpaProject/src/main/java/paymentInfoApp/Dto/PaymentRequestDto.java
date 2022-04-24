package paymentInfoApp.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import paymentInfoApp.Model.PassengerInfo;
import paymentInfoApp.Model.PaymentInformation;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PaymentRequestDto {

    private PassengerInfo passengerInfo;

    private PaymentInformation paymentInformation;

}
