package com.oryx.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.UUID;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlContact", namespace = "http://model.ref.ws.oryx.com")
@Entity
@Table(
		name = SchemaTableConstantName.T_CONTACT
        /*, uniqueConstraints = {
        @UniqueConstraint(name = "UC_DATE_HOST"
                , columnNames = {SchemaTableConstantName.T_RDV_DATE, SchemaTableConstantName.T_HOST_ID}),
        @UniqueConstraint(name = "UC_DATE_GUEST"
                , columnNames = {SchemaTableConstantName.T_RDV_DATE, SchemaTableConstantName.T_GUEST_ID})}
                */
)
public class IContact extends ITracableCancelableEntity{
	private String name;
	private String phoneNumber;
	private String email;
	
	public IContact(){
		
	}
	
	public IContact(String name, String phoneNumber, String email, int id) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
