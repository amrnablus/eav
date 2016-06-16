package com.gmail.amrnablus.eav.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the entity_attribute_value_int database table.
 * 
 */
@Entity
@Table(name="entity_attribute_value_int")
@NamedQuery(name="EntityAttributeValueInt.findAll", query="SELECT e FROM EntityAttributeValueInt e")
public class EntityAttributeValueInt implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EntityAttributeValueIntPK id;

	@Column(name="attribute_value")
	private Long attributeValue;

	//bi-directional many-to-one association to Entity
	@ManyToOne
	@JoinColumn(name="entity_id", insertable=false, updatable=false)
	private EAVEntity entity;

	//bi-directional many-to-one association to EntityAttribute
	@ManyToOne
	@JoinColumn(name="attribute_id", insertable=false, updatable=false)
	private EntityAttribute entityAttribute;

	public EntityAttributeValueInt() {
	}

	public EntityAttributeValueIntPK getId() {
		return this.id;
	}

	public void setId(EntityAttributeValueIntPK id) {
		this.id = id;
	}

	public Long getAttributeValue() {
		return this.attributeValue;
	}

	public void setAttributeValue(Long attributeValue) {
		this.attributeValue = attributeValue;
	}

	public EAVEntity getEntity() {
		return this.entity;
	}

	public void setEntity(EAVEntity entity) {
		this.entity = entity;
	}

	public EntityAttribute getEntityAttribute() {
		return this.entityAttribute;
	}

	public void setEntityAttribute(EntityAttribute entityAttribute) {
		this.entityAttribute = entityAttribute;
	}
	
	@Override
	public String toString() {
		return String.format("[EnttiyAttribute]: entity_id: %d, attribute_id: %d, entity_value: %s", 
				entity.getEntityId(), entityAttribute.getAttributeId(), attributeValue.toString());
	}


}