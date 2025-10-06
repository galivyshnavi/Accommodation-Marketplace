package com.dcl.entity;


import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class User {
    private UUID userId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Role role;
    private String email;
    private String password;
    private String phoneNumber;
    private String avatar;
    private Instant createdAt;
    private String createdBy;
    private Instant lastUpdatedAt;


}
