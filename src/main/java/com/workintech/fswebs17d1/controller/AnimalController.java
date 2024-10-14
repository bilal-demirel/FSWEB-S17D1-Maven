package com.workintech.fswebs17d1.controller;

import com.workintech.fswebs17d1.entity.Animal;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/workintech")
public class AnimalController {
    private Map<Integer, Animal> animals = new HashMap<>();
    @GetMapping("/animal")
    public List<Animal> getAnimal(){
        return new ArrayList<>(animals.values());
    }
    @GetMapping("/animal/{id}")
    public Animal getAnimalByID(@PathVariable int id){
        return animals.get(id);
    }
    @PostMapping("/animal")
    public void addAnimal(@RequestBody Animal animal ){
        animals.put(animal.getId(), animal);
    }
    @PutMapping("/animal/{id}")
    public void updateAnimal(@PathVariable int id, @RequestBody Animal animal){
        animals.put(id, animal);
    }
    @DeleteMapping("/animal/{id}")
    public void deleteAnimal(@PathVariable int id){
        animals.remove(id);
    }
}
