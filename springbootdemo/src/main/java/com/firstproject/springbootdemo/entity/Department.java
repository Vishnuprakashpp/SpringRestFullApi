package com.firstproject.springbootdemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


//@Table(name="Department")
@Entity
//@Data this annotation is used for the boiler plates such as setters getters
public class Department {
	 
     @Id
     @GeneratedValue(strategy=GenerationType.AUTO)


	private long departmentId;
	//hibernate validation as follows nb;first we have to add the validation
	// dependency also we have to add @valid on the controller
	@NotBlank(message = "please add the name")
//	@Length(max = 10,min = 3)
//	@Size(max = 10,min=5)
//	@Email
//	@Positive
//	@Negative
//	@Future
//adding loggers

  private String departmentName;
  private String departmentAddress;
  private String departmentCode;
public long getDepartmentId() {
	return departmentId;
}
@Override
public String toString() {
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAddress="
			+ departmentAddress + ", departmentCode=" + departmentCode + "]";
}
public void setDepartmentId(long departmentId) {
	this.departmentId = departmentId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getDepartmentAddress() {
	return departmentAddress;
}
public void setDepartmentAddress(String departmentAddress) {
	this.departmentAddress = departmentAddress;
}
public String getDepartmentCode() {
	return departmentCode;
}
public void setDepartmentCode(String departmentCode) {
	this.departmentCode = departmentCode;
}
public Department(long departmentId, String departmentName, String departmentAddress, String departmentCode) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.departmentAddress = departmentAddress;
	this.departmentCode = departmentCode;
}
public Department() {

}
}
