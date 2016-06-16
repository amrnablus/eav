package com.gmail.amrnablus.eav.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the entity_attribute_value_string database table.
 * 
 */
@Entity
@Table(name="entity_attribute_value_string")
@NamedQuery(name="EntityAttributeValueString.findAll", query="SELECT e FROM EntityAttributeValueString e")
public class EntityAttributeValueString implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EntityAttributeValueStringPK id;

	@Column(name="attribute_value")
	private String attributeValue;

	//bi-directional many-to-one association to Entity
	@ManyToOne
	@JoinColumn(name="entity_id", insertable=false, updatable=false)
	private EAVEntity entity;

	//bi-directional many-to-one association to EntityAttribute
	@ManyToOne
	@JoinColumn(name="attribute_id", insertable=false, updatable=false)
	private EntityAttribute entityAttribute;

	public EntityAttributeValueString() {
	}

	public EntityAttributeValueStringPK getId() {
		return this.id;
	}

	public void setId(EntityAttributeValueStringPK id) {
		this.id = id;
	}

	public String getAttributeValue() {
		return this.attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
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

}