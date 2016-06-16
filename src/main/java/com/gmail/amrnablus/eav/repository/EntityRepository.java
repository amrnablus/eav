package com.gmail.amrnablus.eav.repository;

import com.gmail.amrnablus.eav.entity.EAVEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by amr on 6/14/16.
 */
@Repository
public interface EntityRepository extends CrudRepository<EAVEntity, Long> {
}
