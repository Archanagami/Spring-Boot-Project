package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.springrest.springrest.entities.lods;
import com.springrest.springrest.services.lodeService;

@RestController 
@RequestMapping("/lodes") // Base mapping for all endpoints related to "lodes"
public class MyController {
    
    @Autowired
    private lodeService lodsService; // Use camelCase for variable names

    // GET endpoint to fetch all lods
    @GetMapping
    public List<lods> getlodes() {
        return lodsService.getlodes();
    }

    // GET endpoint to fetch a specific lods by ID
    @GetMapping("/{id}")
    public lods getlodsById(@PathVariable long id) {
        return lodsService.getlods(id);
    }

    // POST endpoint to add a new lods
    @PostMapping
    public lods addlods(@RequestBody lods l) {
        return lodsService.addlods(l);
    }

    // PUT endpoint to update an existing lods by ID
    @PutMapping("/{id}")
    public lods updatelods(@PathVariable long noOfTrucks, @RequestBody lods l) {
        if (l.getnoOfTrucks() != noOfTrucks) {
            throw new IllegalArgumentException("IDs in path and body do not match");
        }
        return lodsService.updatelods(l);
    }

    // DELETE endpoint to delete a lods by ID
    @DeleteMapping("/{noOfTrucks}")
    public void deletelods(@PathVariable long id) {
        lodsService.deletelods(id);
    }
}
