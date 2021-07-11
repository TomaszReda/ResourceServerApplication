package com.example.resourceserverapp.persistence.repository;

import com.baeldung.resource.persistence.model.Foo;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IFooRepository extends PagingAndSortingRepository<Foo, Long> {
}
