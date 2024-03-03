package com.sms.schoolmanagementsystem.model;

import java.sql.Timestamp;
import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "school")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

}
