package com.sms.schoolmanagementsystem.model;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "course_material")
public class CourseMaterial {

    private @Id @GeneratedValue Long id;

    @Lob
    @Column(name = "course_resources")
    private byte[] courseResources;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    private Timestamp updatedAt;

    CourseMaterial() {
    }

    CourseMaterial(byte[] courseResources, Course course) {
        this.courseResources = courseResources;
        this.course = course;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getCourseResources() {
        return this.courseResources;
    }

    public void setCourseResources(byte[] courseResources) {
        this.courseResources = courseResources;
    }

    public Course getCourse() {
        return this.course;
    }
}
