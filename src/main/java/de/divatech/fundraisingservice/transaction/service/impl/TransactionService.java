package de.divatech.fundraisingservice.transaction.service.impl;

import de.divatech.fundraisingservice.transaction.datatstore.repository.TransactionRepository;
import de.divatech.fundraisingservice.transaction.mapper.TransactionMapper;
import de.divatech.fundraisingservice.transaction.service.ITranactionService;
import de.divatech.fundraisingservice.transaction.web.model.TransactionDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransactionService implements ITranactionService {

    private final TransactionRepository repository;
    private final TransactionMapper mapper;


    @Override
    public void createTransaction() {

    }

    @Override
    public TransactionDto readTransaction() {
        return null;
    }
}

