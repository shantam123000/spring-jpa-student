package paymentInfoApp.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import paymentInfoApp.Model.PaymentInformation;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class PaymentResponseDto {

    private String status;
    private String pnr;
    private PaymentInformation paymentInformation;
    private String error;



}
