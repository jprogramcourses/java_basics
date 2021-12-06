package com.in28minutes.database.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long emp_no;

    @Temporal(value = TemporalType.DATE)
    private Date birth_date;
    private String first_name;
    private String last_name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Temporal(value = TemporalType.DATE)
    private Date hire_date;

    public Employee() {
	super();
    }

    public Long getEmp_no() {
	return emp_no;
    }

    public void setEmp_no(Long emp_no) {
	this.emp_no = emp_no;
    }

    public Date getBirth_date() {
	return birth_date;
    }

    public void setBirth_date(Date birth_date) {
	this.birth_date = birth_date;
    }

    public String getFirst_name() {
	return first_name;
    }

    public void setFirst_name(String first_name) {
	this.first_name = first_name;
    }

    public String getLast_name() {
	return last_name;
    }

    public void setLast_name(String last_name) {
	this.last_name = last_name;
    }

    public Gender getGender() {
	return gender;
    }

    public void setGender(Gender gender) {
	this.gender = gender;
    }

    public Date getHire_date() {
	return hire_date;
    }

    public void setHire_date(Date hire_date) {
	this.hire_date = hire_date;
    }

}
