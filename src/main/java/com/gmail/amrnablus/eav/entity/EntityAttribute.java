package com.gmail.amrnablus.eav.entity;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.Serializable;

/**
 * Created by amr on 6/14/16.
 */
@Entity
@Table(name = "entity_attribute", schema = "metadata", catalog = "")
public class EntityAttribute {
    private Long attributeId;
    private Long entityId;
    private Serializable entityType;
    private Byte isRequired;

    @Id
    @Column(name = "attribute_id", nullable = false)
    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    @Basic
    @Column(name = "entity_id", nullable = false)
    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    @Basic
    @Column(name = "entity_type", nullable = false)
    public Serializable getEntityType() {
        return entityType;
    }

    public void setEntityType(Serializable entityType) {
        this.entityType = entityType;
    }

    @Basic
    @Column(name = "is_required", nullable = true)
    public Byte getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Byte isRequired) {
        this.isRequired = isRequired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityAttribute that = (EntityAttribute) o;

        if (attributeId != null ? !attributeId.equals(that.attributeId) : that.attributeId != null) return false;
        if (entityId != null ? !entityId.equals(that.entityId) : that.entityId != null) return false;
        if (entityType != null ? !entityType.equals(that.entityType) : that.entityType != null) return false;
        if (isRequired != null ? !isRequired.equals(that.isRequired) : that.isRequired != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attributeId != null ? attributeId.hashCode() : 0;
        result = 31 * result + (entityId != null ? entityId.hashCode() : 0);
        result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
        result = 31 * result + (isRequired != null ? isRequired.hashCode() : 0);
        return result;
    }
}
