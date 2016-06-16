package com.gmail.amrnablus.eav.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the entity database table.
 * 
 */
@Entity
@Table(name="entity")
@NamedQuery(name="EAVEntity.findAll", query="SELECT e FROM EAVEntity e")
public class EAVEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="entity_id")
	private Long entityId;

	@Column(name="entity_type")
	private Long entityType;

	//bi-directional many-to-one association to EntityAttribute
	@OneToMany(mappedBy="entity")
	private List<EntityAttribute> entityAttributes;

	//bi-directional many-to-one association to EntityAttributeValueDate
	@OneToMany(mappedBy="entity")
	private List<EntityAttributeValueDate> entityAttributeValueDates;

	//bi-directional many-to-one association to EntityAttributeValueDatetime
	@OneToMany(mappedBy="entity")
	private List<EntityAttributeValueDatetime> entityAttributeValueDatetimes;

	//bi-directional many-to-one association to EntityAttributeValueFloat
	@OneToMany(mappedBy="entity")
	private List<EntityAttributeValueFloat> entityAttributeValueFloats;

	//bi-directional many-to-one association to EntityAttributeValueInt
	@OneToMany(mappedBy="entity", fetch=FetchType.EAGER)
	private List<EntityAttributeValueInt> entityAttributeValueInts;

	//bi-directional many-to-one association to EntityAttributeValueString
	@OneToMany(mappedBy="entity")
	private List<EntityAttributeValueString> entityAttributeValueStrings;

	public EAVEntity() {
	}

	public Long getEntityId() {
		return this.entityId;
	}

	public void setEntityId(Long entityId) {
		this.entityId = entityId;
	}

	public Long getEntityType() {
		return this.entityType;
	}

	public void setEntityType(Long entityType) {
		this.entityType = entityType;
	}

	public List<EntityAttribute> getEntityAttributes() {
		return this.entityAttributes;
	}

	public void setEntityAttributes(List<EntityAttribute> entityAttributes) {
		this.entityAttributes = entityAttributes;
	}

	public EntityAttribute addEntityAttribute(EntityAttribute entityAttribute) {
		getEntityAttributes().add(entityAttribute);
		entityAttribute.setEntity(this);

		return entityAttribute;
	}

	public EntityAttribute removeEntityAttribute(EntityAttribute entityAttribute) {
		getEntityAttributes().remove(entityAttribute);
		entityAttribute.setEntity(null);

		return entityAttribute;
	}

	public List<EntityAttributeValueDate> getEntityAttributeValueDates() {
		return this.entityAttributeValueDates;
	}

	public void setEntityAttributeValueDates(List<EntityAttributeValueDate> entityAttributeValueDates) {
		this.entityAttributeValueDates = entityAttributeValueDates;
	}

	public EntityAttributeValueDate addEntityAttributeValueDate(EntityAttributeValueDate entityAttributeValueDate) {
		getEntityAttributeValueDates().add(entityAttributeValueDate);
		entityAttributeValueDate.setEntity(this);

		return entityAttributeValueDate;
	}

	public EntityAttributeValueDate removeEntityAttributeValueDate(EntityAttributeValueDate entityAttributeValueDate) {
		getEntityAttributeValueDates().remove(entityAttributeValueDate);
		entityAttributeValueDate.setEntity(null);

		return entityAttributeValueDate;
	}

	public List<EntityAttributeValueDatetime> getEntityAttributeValueDatetimes() {
		return this.entityAttributeValueDatetimes;
	}

	public void setEntityAttributeValueDatetimes(List<EntityAttributeValueDatetime> entityAttributeValueDatetimes) {
		this.entityAttributeValueDatetimes = entityAttributeValueDatetimes;
	}

	public EntityAttributeValueDatetime addEntityAttributeValueDatetime(EntityAttributeValueDatetime entityAttributeValueDatetime) {
		getEntityAttributeValueDatetimes().add(entityAttributeValueDatetime);
		entityAttributeValueDatetime.setEntity(this);

		return entityAttributeValueDatetime;
	}

	public EntityAttributeValueDatetime removeEntityAttributeValueDatetime(EntityAttributeValueDatetime entityAttributeValueDatetime) {
		getEntityAttributeValueDatetimes().remove(entityAttributeValueDatetime);
		entityAttributeValueDatetime.setEntity(null);

		return entityAttributeValueDatetime;
	}

	public List<EntityAttributeValueFloat> getEntityAttributeValueFloats() {
		return this.entityAttributeValueFloats;
	}

	public void setEntityAttributeValueFloats(List<EntityAttributeValueFloat> entityAttributeValueFloats) {
		this.entityAttributeValueFloats = entityAttributeValueFloats;
	}

	public EntityAttributeValueFloat addEntityAttributeValueFloat(EntityAttributeValueFloat entityAttributeValueFloat) {
		getEntityAttributeValueFloats().add(entityAttributeValueFloat);
		entityAttributeValueFloat.setEntity(this);

		return entityAttributeValueFloat;
	}

	public EntityAttributeValueFloat removeEntityAttributeValueFloat(EntityAttributeValueFloat entityAttributeValueFloat) {
		getEntityAttributeValueFloats().remove(entityAttributeValueFloat);
		entityAttributeValueFloat.setEntity(null);

		return entityAttributeValueFloat;
	}

	public List<EntityAttributeValueInt> getEntityAttributeValueInts() {
		return this.entityAttributeValueInts;
	}

	public void setEntityAttributeValueInts(List<EntityAttributeValueInt> entityAttributeValueInts) {
		this.entityAttributeValueInts = entityAttributeValueInts;
	}

	public EntityAttributeValueInt addEntityAttributeValueInt(EntityAttributeValueInt entityAttributeValueInt) {
		getEntityAttributeValueInts().add(entityAttributeValueInt);
		entityAttributeValueInt.setEntity(this);

		return entityAttributeValueInt;
	}

	public EntityAttributeValueInt removeEntityAttributeValueInt(EntityAttributeValueInt entityAttributeValueInt) {
		getEntityAttributeValueInts().remove(entityAttributeValueInt);
		entityAttributeValueInt.setEntity(null);

		return entityAttributeValueInt;
	}

	public List<EntityAttributeValueString> getEntityAttributeValueStrings() {
		return this.entityAttributeValueStrings;
	}

	public void setEntityAttributeValueStrings(List<EntityAttributeValueString> entityAttributeValueStrings) {
		this.entityAttributeValueStrings = entityAttributeValueStrings;
	}

	public EntityAttributeValueString addEntityAttributeValueString(EntityAttributeValueString entityAttributeValueString) {
		getEntityAttributeValueStrings().add(entityAttributeValueString);
		entityAttributeValueString.setEntity(this);

		return entityAttributeValueString;
	}

	public EntityAttributeValueString removeEntityAttributeValueString(EntityAttributeValueString entityAttributeValueString) {
		getEntityAttributeValueStrings().remove(entityAttributeValueString);
		entityAttributeValueString.setEntity(null);

		return entityAttributeValueString;
	}
	
	public String toString() {
		return String.format("[EAVEntity]: enttiy_id: %d, attributes: %s", entityId, entityAttributeValueInts.toString());
	}

}