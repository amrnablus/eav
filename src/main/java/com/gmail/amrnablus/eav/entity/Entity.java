package com.gmail.amrnablus.eav.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by amr on 6/14/16.
 */
@javax.persistence.Entity
public class Entity {
    private Long entityId;
    private Long entityType;

    @Id
    @Column(name = "entity_id", nullable = false)
    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    @Basic
    @Column(name = "entity_type", nullable = false)
    public Long getEntityType() {
        return entityType;
    }

    public void setEntityType(Long entityType) {
        this.entityType = entityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entity entity = (Entity) o;

        if (entityId != entity.entityId) return false;
        if (entityType != null ? !entityType.equals(entity.entityType) : entity.entityType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Long result = entityId;
        result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
        return result.intValue();
    }

    @Override
    public String toString() {
        return String.format("[entityId]: %d, [entity_type]: %d,", entityId, entityType);
    }
}
