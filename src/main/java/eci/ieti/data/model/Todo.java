package eci.ieti.data.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Todo {

    @Id
    private Long id;
    private String description ;
    private Integer priority;
    private Date dueDate;
    private String responsible;
    private String status;

    public Todo(){

    }

    public Todo(Long id, String description, Integer priority, Date dueDate, String responsible, String status){
        this.id=id;
        this.description = description;
        this.priority = priority;
        this.dueDate = dueDate;
        this.responsible = responsible;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo[id=%s, dedscription='%s', priority=%s , date='%s', responsible='%s', status='%s']",id,description, priority, dueDate,responsible,status);
    }

}
