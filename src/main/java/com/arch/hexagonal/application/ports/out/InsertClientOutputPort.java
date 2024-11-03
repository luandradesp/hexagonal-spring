package com.arch.hexagonal.application.ports.out;

import com.arch.hexagonal.application.core.domain.Client;

public interface InsertClientOutputPort {

    void insert(Client client);

}
