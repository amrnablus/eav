package com.gmail.amrnablus.eav.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by amr on 6/14/16.
 */
public class EntityAttributeValueFloatPK implements Serializable {
    private Long attributeId;
    private Long entityId;

    @Column(name = "attribute_id", nullable = false)
    @Id
    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    @Column(name = "entity_id", nullable = false)
    @Id
    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityAttributeValueFloatPK that = (EntityAttributeValueFloatPK) o;

        if (attributeId != that.attributeId) return false;
        if (entityId != that.entityId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Long result = attributeId;
        result = 31 * result + entityId;
        return result.intValue();
    }
}
