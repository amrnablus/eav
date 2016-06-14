package com.gmail.amrnablus.eav.entity;

import javax.persistence.*;
import javax.persistence.Entity;

/**
 * Created by amr on 6/14/16.
 */
@Entity
@Table(name = "entity_attribute_value_string", schema = "metadata", catalog = "")
@IdClass(EntityAttributeValueStringPK.class)
public class EntityAttributeValueString {
    private Long attributeId;
    private Long entityId;
    private String attributeValue;

    @Id
    @Column(name = "attribute_id", nullable = false)
    public Long getAttributeId() {
        return attributeId;
    }

    public void setAttributeId(Long attributeId) {
        this.attributeId = attributeId;
    }

    @Id
    @Column(name = "entity_id", nullable = false)
    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    @Basic
    @Column(name = "attribute_value", nullable = true, length = 200)
    public String getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(String attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EntityAttributeValueString that = (EntityAttributeValueString) o;

        if (attributeId != null ? !attributeId.equals(that.attributeId) : that.attributeId != null) return false;
        if (entityId != null ? !entityId.equals(that.entityId) : that.entityId != null) return false;
        if (attributeValue != null ? !attributeValue.equals(that.attributeValue) : that.attributeValue != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = attributeId != null ? attributeId.hashCode() : 0;
        result = 31 * result + (entityId != null ? entityId.hashCode() : 0);
        result = 31 * result + (attributeValue != null ? attributeValue.hashCode() : 0);
        return result;
    }
}
