package paymentInfoApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import paymentInfoApp.Dto.PaymentRequestDto;
import paymentInfoApp.Dto.PaymentResponseDto;
import paymentInfoApp.Service.PaymentService;

@RestController
public class PaymentApiController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment")
    public PaymentResponseDto paymentGateway(@RequestBody PaymentRequestDto paymentRequestDto) {
        return paymentService.payment(paymentRequestDto);
    }

}
