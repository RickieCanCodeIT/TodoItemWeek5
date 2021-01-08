package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service
public class OwnerStorage {
    Map<Long, TodoOwner> ownerList = new HashMap<>();

    public OwnerStorage() {

    }

    public void addOwner(TodoOwner inOwner) {
        ownerList.put(inOwner.getId(), inOwner);
    }

    public Collection<TodoOwner> getOwners() {
        return ownerList.values();
    }

    public TodoOwner getOwnerByID(Long id) {
        return ownerList.get(id);
    }
    //ownerList.get(id)
}
