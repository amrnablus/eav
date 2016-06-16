package com.gmail.amrnablus.eav.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the entity_attribute_value_datetime database table.
 * 
 */
@Entity
@Table(name="entity_attribute_value_datetime")
@NamedQuery(name="EntityAttributeValueDatetime.findAll", query="SELECT e FROM EntityAttributeValueDatetime e")
public class EntityAttributeValueDatetime implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EntityAttributeValueDatetimePK id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="attribute_value")
	private Date attributeValue;

	//bi-directional many-to-one association to Entity
	@ManyToOne
	@JoinColumn(name="entity_id", insertable=false, updatable=false)
	private EAVEntity entity;

	//bi-directional many-to-one association to EntityAttribute
	@ManyToOne
	@JoinColumn(name="attribute_id", insertable=false, updatable=false)
	private EntityAttribute entityAttribute;

	public EntityAttributeValueDatetime() {
	}

	public EntityAttributeValueDatetimePK getId() {
		return this.id;
	}

	public void setId(EntityAttributeValueDatetimePK id) {
		this.id = id;
	}

	public Date getAttributeValue() {
		return this.attributeValue;
	}

	public void setAttributeValue(Date attributeValue) {
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