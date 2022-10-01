package de.divatech.fundraisingservice.transaction.service;

import de.divatech.fundraisingservice.transaction.web.model.TransactionDto;

public interface ITranactionService {

    void createTransaction();
    TransactionDto readTransaction();
}
