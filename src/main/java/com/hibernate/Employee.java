package com.hibernate;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "emp_details")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name", nullable = false)
	private String empName;
	
	private Double salary;
	
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	
	
	private String email;
	
	private boolean status;
	
	@Transient
	private String token;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, Double salary, Date joiningDate, String email, boolean status, String token) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.joiningDate = joiningDate;
		this.email = email;
		this.status = status;
		this.token = token;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + ", joiningDate=" + joiningDate
				+ ", email=" + email + ", status=" + status + ", token=" + token + "]";
	}
	
}
