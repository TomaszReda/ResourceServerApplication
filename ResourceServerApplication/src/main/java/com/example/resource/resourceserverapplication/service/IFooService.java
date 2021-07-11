package com.example.resource.resourceserverapplication.service;

import com.example.resource.resourceserverapplication.persistence.model.Foo;

import java.util.Optional;


public interface IFooService {
    Optional<Foo> findById(Long id);

    Foo save(Foo foo);
    
    Iterable<Foo> findAll();

}
