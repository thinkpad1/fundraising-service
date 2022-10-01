package de.divatech.fundraisingservice.transaction.mapper;

import de.divatech.fundraisingservice.transaction.datatstore.model.Transaction;
import de.divatech.fundraisingservice.transaction.web.model.TransactionDto;
import org.mapstruct.Mapper;

@Mapper (componentModel = "spring")
public interface TransactionMapper {

    TransactionDto transactionMaptoTransactionDto(Transaction transaction);

}
