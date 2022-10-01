package de.divatech.fundraisingservice.transaction.datatstore.repository;

import de.divatech.fundraisingservice.transaction.datatstore.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    Optional<Transaction> findByUuid(String uuid);
}
