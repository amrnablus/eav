package com.gmail.amrnablus.eav.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the entity_attribute_value_float database table.
 * 
 */
@Entity
@Table(name="entity_attribute_value_float")
@NamedQuery(name="EntityAttributeValueFloat.findAll", query="SELECT e FROM EntityAttributeValueFloat e")
public class EntityAttributeValueFloat implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EntityAttributeValueFloatPK id;

	@Column(name="attribute_value")
	private BigDecimal attributeValue;

	//bi-directional many-to-one association to Entity
	@ManyToOne
	@JoinColumn(name="entity_id", insertable=false, updatable=false)
	private EAVEntity entity;

	//bi-directional many-to-one association to EntityAttribute
	@ManyToOne
	@JoinColumn(name="attribute_id", insertable=false, updatable=false)
	private EntityAttribute entityAttribute;

	public EntityAttributeValueFloat() {
	}

	public EntityAttributeValueFloatPK getId() {
		return this.id;
	}

	public void setId(EntityAttributeValueFloatPK id) {
		this.id = id;
	}

	public BigDecimal getAttributeValue() {
		return this.attributeValue;
	}

	public void setAttributeValue(BigDecimal attributeValue) {
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