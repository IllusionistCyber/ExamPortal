package com.Examportal.ExamPortal.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class user {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long id;

    private String userName;

    private String password;
    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private boolean enable=true;

    private String profile;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "User")
    @JsonIgnore
    private List<userRole> userRoles=new ArrayList<>();

}
