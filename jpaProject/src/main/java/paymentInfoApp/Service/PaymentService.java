package paymentInfoApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import paymentInfoApp.Dto.PaymentRequestDto;
import paymentInfoApp.Dto.PaymentResponseDto;
import paymentInfoApp.Exceptions.PaymentException;
import paymentInfoApp.Model.PaymentInformation;
import paymentInfoApp.Repositories.PassengerRepository;
import paymentInfoApp.Repositories.PaymentRepository;
import paymentInfoApp.paymentValidator.PaymentValidator;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
public class PaymentService {

    private final PaymentValidator paymentValidator = new PaymentValidator();

    @Autowired
    private PassengerRepository passengerRepository;
    @Autowired
    private PaymentRepository paymentRepository;


    public PaymentResponseDto payment(PaymentRequestDto paymentRequestDto) {

        System.out.println(paymentRequestDto);

        PaymentResponseDto paymentResponseDto = new PaymentResponseDto();
        PaymentInformation paymentInformation = paymentRequestDto.getPaymentInformation();

        String accNumber = paymentRequestDto.getPassengerInfo().getPassengerAccNumber();

        double amount = paymentRequestDto.getPassengerInfo().getAmount();

        paymentInformation.setAmount(amount);
        paymentInformation.setAccNumber(accNumber);

        passengerRepository.save(paymentRequestDto.getPassengerInfo());

/* Note: If we dont handle teh exception and dont use @Transactional in the Service class
         we may get a logical error .
         i.e the PaymentInformation table will also get updated
         no matter the validator is success or not to save that i have used them

 */
        try {

            System.out.println(paymentInformation);

            if (paymentValidator.isValidAmount(accNumber, amount)) ;
            {
                paymentResponseDto.setStatus("Success");
                paymentResponseDto.setPnr(UUID.randomUUID().toString());
                paymentResponseDto.setPaymentInformation(paymentInformation);
                paymentResponseDto.setError("");
            }
            paymentRepository.save(paymentInformation);

        } catch (PaymentException e) {
            paymentResponseDto.setStatus("Failed");
            paymentResponseDto.setPnr("");
            paymentResponseDto.setPaymentInformation(paymentInformation);
            paymentResponseDto.setError(e.toString());
        }

        return paymentResponseDto;
    }

}



