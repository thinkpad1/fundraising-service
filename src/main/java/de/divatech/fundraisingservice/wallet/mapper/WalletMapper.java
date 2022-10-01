package de.divatech.fundraisingservice.wallet.mapper;

import de.divatech.fundraisingservice.wallet.datatstore.model.Wallet;
import de.divatech.fundraisingservice.wallet.web.model.WalletDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface WalletMapper {

    WalletDto walletMapToWalletDto(Wallet wallet);

}
