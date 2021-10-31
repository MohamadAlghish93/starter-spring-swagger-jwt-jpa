package com.flowengine.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.flowengine.entity.ext.Auditable;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"},ignoreUnknown = true)
@Entity
@Table(name = "SYSTEM_USER")
public class UserEntity extends Auditable<String> implements Serializable {


//    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    // constructor

    public UserEntity() {
    }

    // setter and getter

    @Column(name = "ID")
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "USER_NAME", nullable = true, length = 255)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "FIRST_NAME", nullable = true, length = 255)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "LAST_NAME", nullable = true, length = 255)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "EMAIL", nullable = true, length = 255)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Column(name = "PASSWORD", nullable = true, length = 500)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
