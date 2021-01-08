package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
public class OwnerPopulator implements CommandLineRunner {
    OwnerStorage ownerStorage;

    public OwnerPopulator(OwnerStorage inOwnerStorage){
        ownerStorage = inOwnerStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        TodoOwner Jordan = new TodoOwner("Jordan", Collections.EMPTY_LIST,1L);
        TodoOwner Rickie = new TodoOwner("Rickie", Collections.EMPTY_LIST,2L);
        TodoOwner Cliff = new TodoOwner("Cliff", Collections.EMPTY_LIST,3L);
        TodoOwner Lauren = new TodoOwner("Lauren", Collections.EMPTY_LIST,4L);


        ownerStorage.addOwner(Jordan);
        ownerStorage.addOwner(Rickie);
        ownerStorage.addOwner(Cliff);
        ownerStorage.addOwner(Lauren);

    }
}
