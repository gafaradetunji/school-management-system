package com.sms.schoolmanagementsystem.model;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "school")
public class School {

    private @Id @GeneratedValue Long id;

    @Column(name = "school_name", length = 150)
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Lob
    @Column(name = "logo")
    private byte[] logo;

    @Column(name = "email_address", unique = true, nullable = false)
    private String email;

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

    @Column(length = 150)
    private String streetAddress;

    @Column(length = 150)
    private String city;

    @Column(length = 150)
    private String state;

    @Column(length = 150)
    private String postalCode;

    @Column(length = 150)
    private String country;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    School() {
    }

    School(String name, String phoneNumber, byte[] logo, String email, String licenceNumber, Date licenceExpiryDate,
            Date licenceIssueDate, byte[] licenceCertificate, String streetAddress, String city, String state,
            String postalCode, String country) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.logo = logo;
        this.email = email;
        this.licenceNumber = licenceNumber;
        this.licenceExpiryDate = licenceExpiryDate;
        this.licenceIssueDate = licenceIssueDate;
        this.licenceCertificate = licenceCertificate;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public byte[] getLogo() {
        return this.logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicenceNumber() {
        return this.licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public Date getLicenceExpiryDate() {
        return this.licenceExpiryDate;
    }

    public void setLicenceExpiryDate(Date licenceExpiryDate) {
        this.licenceExpiryDate = licenceExpiryDate;
    }

    public Date getLicenceIssueDate() {
        return this.licenceIssueDate;
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

}
