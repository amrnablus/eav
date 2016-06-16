package com.gmail.amrnablus.eav.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the entity_attribute_value_string database table.
 * 
 */
@Embeddable
public class EntityAttributeValueStringPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="attribute_id", insertable=false, updatable=false)
	private int attributeId;

	@Column(name="entity_id", insertable=false, updatable=false)
	private int entityId;

	public EntityAttributeValueStringPK() {
	}
	public int getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}
	public int getEntityId() {
		return this.entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EntityAttributeValueStringPK)) {
			return false;
		}
		EntityAttributeValueStringPK castOther = (EntityAttributeValueStringPK)other;
		return 
			(this.attributeId == castOther.attributeId)
			&& (this.entityId == castOther.entityId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.attributeId;
		hash = hash * prime + this.entityId;
		
		return hash;
	}
}