package com.example.exercitii;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Spider(), new Cat(), new Fish("free willy"), new Cat("tekir"));
        List<Animal> res = animals.stream().filter(animal -> animal instanceof Pet).collect(Collectors.toList());
        animals.stream().max(Comparator.comparing(Animal::getLegs)).orElseThrow(RuntimeException::new);

    }
}
