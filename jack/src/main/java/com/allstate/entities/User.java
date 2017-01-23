package com.allstate.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "users")
@Data

public class User {

    private int id;
    private String name;
    private int version;
    private int balance = 100000;
    private Date createdate;
    private Date modifieddate;


    @Id
    @GeneratedValue
    public int getId() {return id;}
    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @javax.persistence.Version
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @Column(nullable = false)
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @CreationTimestamp
    public Date getCreatedate() {
        return createdate;
    }
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    @UpdateTimestamp
    public Date getModifieddate() {
        return modifieddate;
    }
    public void setModifieddate(Date modifieddate) {
        this.modifieddate = modifieddate;
    }
}
