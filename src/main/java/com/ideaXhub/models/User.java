package com.ideaXhub.models;

import javax.persistence.*;
import java.util.Date;


/**
 * User Class
 * id
 * email
 * password
 * firstName
 * lastName
 */

/**
 * User Class
 * id
 * email
 * password
 * firstName
 * lastName
 */

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String password;
    private String firstName;
    private String lastName;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;

    private boolean isActive;
    private boolean emailVerified;

}

