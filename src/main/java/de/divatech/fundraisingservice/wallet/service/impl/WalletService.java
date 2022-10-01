package de.divatech.fundraisingservice.wallet.service.impl;

import de.divatech.fundraisingservice.wallet.datatstore.repository.WalletRepository;
import de.divatech.fundraisingservice.wallet.mapper.WalletMapper;
import de.divatech.fundraisingservice.wallet.service.IWalletService;
import de.divatech.fundraisingservice.wallet.web.model.WalletDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WalletService implements IWalletService {

    private final WalletRepository repository;
    private final WalletMapper mapper;


    @Override
    public void createWallet() {

    }

    @Override
    public WalletDto readWallet() {
        return null;
    }

    @Override
    public void editWallet() {

    }
}
