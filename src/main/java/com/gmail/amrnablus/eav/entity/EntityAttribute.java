package com.gmail.amrnablus.eav.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the entity_attribute database table.
 * 
 */
@Entity
@Table(name="entity_attribute")
@NamedQuery(name="EntityAttribute.findAll", query="SELECT e FROM EntityAttribute e")
public class EntityAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="attribute_id")
	private Long attributeId;

	@Column(name="entity_type")
	private String entityType;

	@Column(name="is_required")
	private byte isRequired;

	//bi-directional many-to-one association to Entity
	@ManyToOne
	@JoinColumn(name="entity_id")
	private EAVEntity entity;

	//bi-directional many-to-one association to EntityAttributeValueDate
	@OneToMany(mappedBy="entityAttribute")
	private List<EntityAttributeValueDate> entityAttributeValueDates;

	//bi-directional many-to-one association to EntityAttributeValueDatetime
	@OneToMany(mappedBy="entityAttribute")
	private List<EntityAttributeValueDatetime> entityAttributeValueDatetimes;

	//bi-directional many-to-one association to EntityAttributeValueFloat
	@OneToMany(mappedBy="entityAttribute")
	private List<EntityAttributeValueFloat> entityAttributeValueFloats;

	//bi-directional many-to-one association to EntityAttributeValueInt
	@OneToMany(mappedBy="entityAttribute")
	private List<EntityAttributeValueInt> entityAttributeValueInts;

	//bi-directional many-to-one association to EntityAttributeValueString
	@OneToMany(mappedBy="entityAttribute")
	private List<EntityAttributeValueString> entityAttributeValueStrings;

	public EntityAttribute() {
	}

	public Long getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(Long attributeId) {
		this.attributeId = attributeId;
	}

	public String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	public byte getIsRequired() {
		return this.isRequired;
	}

	public void setIsRequired(byte isRequired) {
		this.isRequired = isRequired;
	}

	public EAVEntity getEntity() {
		return this.entity;
	}

	public void setEntity(EAVEntity entity) {
		this.entity = entity;
	}

	public List<EntityAttributeValueDate> getEntityAttributeValueDates() {
		return this.entityAttributeValueDates;
	}

	public void setEntityAttributeValueDates(List<EntityAttributeValueDate> entityAttributeValueDates) {
		this.entityAttributeValueDates = entityAttributeValueDates;
	}

	public EntityAttributeValueDate addEntityAttributeValueDate(EntityAttributeValueDate entityAttributeValueDate) {
		getEntityAttributeValueDates().add(entityAttributeValueDate);
		entityAttributeValueDate.setEntityAttribute(this);

		return entityAttributeValueDate;
	}

	public EntityAttributeValueDate removeEntityAttributeValueDate(EntityAttributeValueDate entityAttributeValueDate) {
		getEntityAttributeValueDates().remove(entityAttributeValueDate);
		entityAttributeValueDate.setEntityAttribute(null);

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
		entityAttributeValueDatetime.setEntityAttribute(this);

		return entityAttributeValueDatetime;
	}

	public EntityAttributeValueDatetime removeEntityAttributeValueDatetime(EntityAttributeValueDatetime entityAttributeValueDatetime) {
		getEntityAttributeValueDatetimes().remove(entityAttributeValueDatetime);
		entityAttributeValueDatetime.setEntityAttribute(null);

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
		entityAttributeValueFloat.setEntityAttribute(this);

		return entityAttributeValueFloat;
	}

	public EntityAttributeValueFloat removeEntityAttributeValueFloat(EntityAttributeValueFloat entityAttributeValueFloat) {
		getEntityAttributeValueFloats().remove(entityAttributeValueFloat);
		entityAttributeValueFloat.setEntityAttribute(null);

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
		entityAttributeValueInt.setEntityAttribute(this);

		return entityAttributeValueInt;
	}

	public EntityAttributeValueInt removeEntityAttributeValueInt(EntityAttributeValueInt entityAttributeValueInt) {
		getEntityAttributeValueInts().remove(entityAttributeValueInt);
		entityAttributeValueInt.setEntityAttribute(null);

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
		entityAttributeValueString.setEntityAttribute(this);

		return entityAttributeValueString;
	}

	public EntityAttributeValueString removeEntityAttributeValueString(EntityAttributeValueString entityAttributeValueString) {
		getEntityAttributeValueStrings().remove(entityAttributeValueString);
		entityAttributeValueString.setEntityAttribute(null);

		return entityAttributeValueString;
	}
	
	@Override
	public String toString() {
		return String.format("[EnttiyAttribute]: entity_id: %d, attribute_id: %d", 
				entity.getEntityId(), attributeId );
	}


}