package com.sms.schoolmanagementsystem.model;

import java.math.BigDecimal;
import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.*;

@Entity
@Table(name = "grades_assignment")
public class Grades {

    private @Id @GeneratedValue Long id;

    @Column(name = "grade_calculation", precision = 10, scale = 2)
    private BigDecimal gradeCalculation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

    @Column(name = "created_at", nullable = false, updatable = false)
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    Grades() {
    }

    Grades(BigDecimal gradeCalculation, Student student, Course course) {
        this.gradeCalculation = gradeCalculation;
        this.student = student;
        this.course = course;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getGradeCalculation() {
        return this.gradeCalculation;
    }

    public void setGradeCalculation(BigDecimal gradeCalculation) {
        this.gradeCalculation = gradeCalculation;
    }

    public Student getStudent() {
        return this.student;
    }

    public Course getCourse() {
        return this.course;
    }
}
