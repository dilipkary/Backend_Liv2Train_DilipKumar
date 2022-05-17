package net.mvp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Table(name = "center")
@Entity
public class Center {
	
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id")
         private Long id;
     
	 @NotNull(message = "Center Name must be maximum 40 characters only")
	 @Size(max = 40)
     @Column(name="center_name")
     private String centerName;
	 
	 @NotNull(message = "Center Code must exactly 12 characters only")
	 @Size(min= 12, max = 12)
     @Column(name="center_code")
     private String centerCode;
     
	 @NotNull(message = "Please Specify Detailed  Address")
     @Column(name="detailed_address")
     private String detailedAddress;
     
	 @NotNull(message = "Please Specify City")
     @Column(name="city")
     private String city;
     
	 @NotNull(message = "Please Specify State")
     @Column(name="state")
     private String state;
     
	 @NotNull(message = "Please Specify Pincode")
     @Column(name="pincode")
     private long pincode;
     
     @Column(name="student_capacity")
     private int studentCapacity;
     
     @Column(name="courses_offered")
     private String coursesOffered;
     
     @Temporal(TemporalType.TIMESTAMP)
     @Column(name="created_on")
     private Date createdOn;

     @PrePersist
     private void onCreate() {
    	 createdOn = new Date();
     }

     @Email(message="Enter vali email")
     @Column(unique=true,name="contact_email")
     private String contactEmail;
     
     @NotNull(message = "Please Specify Phone Number")
     @Column(name="contact_phone")
     private String contactPhone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getCenterCode() {
		return centerCode;
	}

	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}

	public String getDetailedAddress() {
		return detailedAddress;
	}

	public void setDetailedAddress(String detailedAddress) {
		this.detailedAddress = detailedAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public int getStudentCapacity() {
		return studentCapacity;
	}

	public void setStudentCapacity(int studentCapacity) {
		this.studentCapacity = studentCapacity;
	}

	public String getCoursesOffered() {
		return coursesOffered;
	}

	public void setCoursesOffered(String coursesOffered) {
		this.coursesOffered = coursesOffered;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
}
