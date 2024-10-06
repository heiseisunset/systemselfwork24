package com.wyr.repository;

import com.wyr.pojo.Charactor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChaRepository extends CrudRepository<Charactor,Integer> {
}
