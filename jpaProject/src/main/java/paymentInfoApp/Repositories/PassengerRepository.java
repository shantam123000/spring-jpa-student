package paymentInfoApp.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import paymentInfoApp.Model.PassengerInfo;

public interface PassengerRepository extends JpaRepository<PassengerInfo,Integer> {
}
