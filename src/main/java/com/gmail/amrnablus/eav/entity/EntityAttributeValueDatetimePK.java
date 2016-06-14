package com.gmail.amrnablus.eav.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by amr on 6/14/16.
 */
public class EntityAttributeValueDatetimePK implements Serializable {
    private Long entityId;
    private Long attributeId;

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    @Column(name = "entity_id", nullable = false)
    @Id
    public Long getEntityId() {
        return entityId;
    }

    @Column(name = "attribute_id", nullable = false)
    @Id
    public Long getAttributeId() {
        return attributeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityAttributeValueDatetimePK that = (EntityAttributeValueDatetimePK) o;

        if (entityId != that.entityId) return false;
        if (attributeId != that.attributeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        Long result = entityId;
        result = 31 * result + attributeId;
        return result.intValue();
    }
}
