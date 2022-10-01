package de.divatech.fundraisingservice.datatstore.repository;

import de.divatech.fundraisingservice.datatstore.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonationRepository extends JpaRepository<Donation, Long> {

}
