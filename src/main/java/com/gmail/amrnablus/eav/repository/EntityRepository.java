package com.gmail.amrnablus.eav.repository;

import com.gmail.amrnablus.eav.entity.Entity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by amr on 6/14/16.
 */
public interface EntityRepository extends CrudRepository<Entity, Long> {
}
