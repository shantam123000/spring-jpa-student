package paymentInfoApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import paymentInfoApp.Model.PaymentInformation;

public interface PaymentRepository extends JpaRepository<PaymentInformation, Integer> {
}
