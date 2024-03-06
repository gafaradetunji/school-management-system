package com.sms.schoolmanagementsystem.model;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.sms.schoolmanagementsystem.enums.Gender;

import jakarta.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher {

    private @Id @GeneratedValue Long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "licence_number")
    private String licenceNumber;

    @Column(name = "licence_expiry_date")
    @Temporal(TemporalType.DATE)
    private Date licenceExpiryDate;

    @Column(name = "licence_issue_date")
    @Temporal(TemporalType.DATE)
    private Date licenceIssueDate;

    @Column(name = "licence_certificate")
    @Lob
    private byte[] licenceCertificate;

    @Column(name = "street_address", length = 150)
    private String streetAddress;

    @Column(length = 150)
    private String city;

    @Column(length = 150)
    private String state;

    @Column(length = 150)
    private String postalCode;

    @Column(length = 150)
    private String country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    private School school;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    Teacher() {
    }

    Teacher(String phoneNumber, String dateOfBirth, Gender gender, String licenceNumber,
            byte[] licenceCertificate, String streetAddress, String city, String state,
            String postalCode, String country, User user, School school) {

        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.licenceNumber = licenceNumber;
        this.licenceCertificate = licenceCertificate;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.user = user;
        this.school = school;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return this.gender;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public byte[] getLicenceCertificate() {
        return this.licenceCertificate;
    }

    public void setLicenceCertificate(byte[] licenceCertificate) {
        this.licenceCertificate = licenceCertificate;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public User getUser() {
        return this.user;
    }

    public School getSchool() {
        return this.school;
    }
}
