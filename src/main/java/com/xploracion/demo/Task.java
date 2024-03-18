package com.xploracion.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity


public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer idtask;
    private String title;
    private String description;
    private Date create_date;
    private Date deadline;
    private Integer iduser;

    public Task() {
        this.idtask = idtask;

    }

    public Integer getIdtask() {
        return idtask;
    }

    public void setIdtask(Integer idtask) {
        this.idtask = idtask;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }
}
