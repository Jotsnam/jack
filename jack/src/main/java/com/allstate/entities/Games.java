package com.allstate.entities;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "games")
@Data

public class Games {
    private int id;
    private int userid;
    private boolean wonlost;
    private int amount;
    private int version;
    private Date playeddate;

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
    public int getUserid() {
        return userid;
    }
    public void setUserid(int userid) {
        this.userid = userid;
    }

    @javax.persistence.Version
    public int getVersion() {
        return version;
    }
    public void setVersion(int version) {
        this.version = version;
    }

    @CreationTimestamp
    public Date getPlayeddate() {
        return playeddate;
    }
    public void setPlayeddate(Date playeddate) {
        this.playeddate = playeddate;
    }
}

