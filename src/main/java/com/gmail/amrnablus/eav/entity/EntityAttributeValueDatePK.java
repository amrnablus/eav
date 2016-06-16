package com.gmail.amrnablus.eav.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the entity_attribute_value_date database table.
 * 
 */
@Embeddable
public class EntityAttributeValueDatePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="entity_id", insertable=false, updatable=false)
	private int entityId;

	@Column(name="attribute_id", insertable=false, updatable=false)
	private int attributeId;

	public EntityAttributeValueDatePK() {
	}
	public int getEntityId() {
		return this.entityId;
	}
	public void setEntityId(int entityId) {
		this.entityId = entityId;
	}
	public int getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EntityAttributeValueDatePK)) {
			return false;
		}
		EntityAttributeValueDatePK castOther = (EntityAttributeValueDatePK)other;
		return 
			(this.entityId == castOther.entityId)
			&& (this.attributeId == castOther.attributeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.entityId;
		hash = hash * prime + this.attributeId;
		
		return hash;
	}
}