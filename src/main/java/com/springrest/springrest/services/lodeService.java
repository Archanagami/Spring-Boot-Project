package com.springrest.springrest.services;

import java.util.List;
import java.util.UUID;

import com.springrest.springrest.entities.lods;

public interface lodeService {

    public List<lods> getlodes();

    public lods getlods(long lodsId);

    public lods addlods(lods lods);

    public lods updatelods(lods lods);

    public void deletelods(long lodsId);

    // Optionally, add more methods as per your requirements
}
