package de.divatech.fundraisingservice.wallet.datatstore.model;

import de.divatech.fundraisingservice.transaction.datatstore.model.Transaction;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Wallet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String uuid = UUID.randomUUID().toString();

    private Double balance;

    @OneToMany
    private List<Transaction> transactions;

    private String walletType;


}
