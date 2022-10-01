package de.divatech.fundraisingservice.wallet.datatstore.repository;

import de.divatech.fundraisingservice.wallet.datatstore.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface WalletRepository extends JpaRepository<Wallet, Long> {
    Optional<Wallet> findByUuid(String uuid);
}
