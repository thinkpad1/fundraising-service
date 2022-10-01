package de.divatech.fundraisingservice.wallet.service;

import de.divatech.fundraisingservice.wallet.web.model.WalletDto;

public interface IWalletService {
    void createWallet();
    WalletDto readWallet();
    void editWallet();
}
