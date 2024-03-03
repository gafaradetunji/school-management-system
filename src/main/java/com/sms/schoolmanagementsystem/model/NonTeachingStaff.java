package com.sms.schoolmanagementsystem.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.sms.schoolmanagementsystem.enums.Gender;

import jakarta.persistence.*;

@Entity
@Table(name = "non_teaching_staff")
public class NonTeachingStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private String dateOfBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "student_id_number", unique = true, nullable = false)
    private String studentIdNumber;

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

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "school_id")
    private School school;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;
}
