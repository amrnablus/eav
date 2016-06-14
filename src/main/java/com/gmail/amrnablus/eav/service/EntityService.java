package com.gmail.amrnablus.eav.service;

import com.gmail.amrnablus.eav.entity.Entity;
import com.gmail.amrnablus.eav.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by amr on 6/14/16.
 */
@Service
public class EntityService {

    @Autowired
    EntityRepository entityRepository;

    public Entity getEntityById(Long id) {
        return entityRepository.findOne(id);
    }
}
