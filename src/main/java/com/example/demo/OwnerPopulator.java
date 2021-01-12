package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OwnerPopulator implements CommandLineRunner {
    OwnerStorage ownerStorage;

    public OwnerPopulator(OwnerStorage inOwnerStorage){
        ownerStorage = inOwnerStorage;
    }

    @Override
    public void run(String... args) throws Exception {
        TodoOwner Jordan = new TodoOwner("Jordan");
        TodoOwner Rickie = new TodoOwner("Rickie");
        TodoOwner Cliff = new TodoOwner("Cliff");
        TodoOwner Lauren = new TodoOwner("Lauren");


        ownerStorage.addOwner(Jordan);
        ownerStorage.addOwner(Rickie);
        ownerStorage.addOwner(Cliff);
        ownerStorage.addOwner(Lauren);

    }
}
