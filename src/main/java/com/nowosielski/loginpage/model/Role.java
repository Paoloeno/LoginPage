package com.nowosielski.loginpage.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by panowosielski on 2018-12-18.
 */

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;

    @Column(name = "role")
    private String role;
}