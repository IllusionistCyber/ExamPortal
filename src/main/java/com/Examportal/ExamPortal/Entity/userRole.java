package com.Examportal.ExamPortal.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "userRole")
public class userRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private user User;


    @ManyToOne(cascade = CascadeType.ALL)
    private roles Role;


}
