package com.lovetoread.springbootlibrary.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Table(name ="review")
@Entity
@Data
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="user_email")
    private String userEmail;
    @Column(name="date")
    @CreationTimestamp
    private Date date;
    @Column(name = "rating")
    private double rating;
    @Column(name="bookId")
    private Long bookId;
    @Column(name = "review_description")
    private String reviewDescription;

}
