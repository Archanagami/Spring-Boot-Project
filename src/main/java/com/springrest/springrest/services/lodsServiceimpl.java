package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.lods;

@Service
public class lodsServiceimpl implements lodeService {

    private List<lods> list;

    public lodsServiceimpl() {
        list = new ArrayList<>();
        // Initialize lods objects with actual data using the constructor
        list.add(new lods(1, "delhi", "jaipur", "chemicals", "canter", 100, "", UUID.randomUUID(), "01-01-2023"));
        list.add(new lods(2, "mumbai", "bangalore", "computers", "truck", 200, "Handle with care",
                UUID.randomUUID(), "02-02-2023"));
    }

    @Override
    public List<lods> getlodes() {
        return list; // Return the list of all lods
    }

    @Override
    public lods getlods(long lodsId) {
        for (lods l : list) {
            if (l.getnoOfTrucks() == lodsId) {
                return l; // Return the lods object if found by id
            }
        }
        return null; // Return null if lods with given id is not found
    }

    @Override
    public lods addlods(lods l) {
        list.add(l); // Add a new lods object to the list
        return l; // Return the added lods object
    }

    @Override
    public lods updatelods(lods l) {
        for (int i = 0; i < list.size(); i++) {
            lods existingLods = list.get(i);
            if (existingLods.getnoOfTrucks() == l.getnoOfTrucks()) {
                list.set(i, l); // Update the existing lods object in the list
                return l; // Return the updated lods object
            }
        }
        return null; // Return null if lods with given id is not found for update
    }

    @Override
    public void deletelods(long lodsId) {
        list.removeIf(l -> l.getnoOfTrucks() == lodsId); // Remove lods object by id from the list
    }
}