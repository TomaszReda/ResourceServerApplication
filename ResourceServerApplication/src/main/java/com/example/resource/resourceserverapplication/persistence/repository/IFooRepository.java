package com.example.resource.resourceserverapplication.persistence.repository;

import com.example.resource.resourceserverapplication.persistence.model.Foo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
