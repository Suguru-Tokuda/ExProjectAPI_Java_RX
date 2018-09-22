/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Suguru
 */
@Entity
@Table(name = "Tasks")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tasks.findAll", query = "SELECT t FROM Tasks t")
    , @NamedQuery(name = "Tasks.findByTaskId", query = "SELECT t FROM Tasks t WHERE t.taskId = :taskId")
    , @NamedQuery(name = "Tasks.findByTaskName", query = "SELECT t FROM Tasks t WHERE t.taskName = :taskName")
    , @NamedQuery(name = "Tasks.findByStartDate", query = "SELECT t FROM Tasks t WHERE t.startDate = :startDate")
    , @NamedQuery(name = "Tasks.findByEnddate", query = "SELECT t FROM Tasks t WHERE t.enddate = :enddate")
    , @NamedQuery(name = "Tasks.findByCompleted", query = "SELECT t FROM Tasks t WHERE t.completed = :completed")
    , @NamedQuery(name = "Tasks.findByApproved", query = "SELECT t FROM Tasks t WHERE t.approved = :approved")})
public class Tasks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "taskId")
    private Integer taskId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "taskName")
    private String taskName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "startDate")
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enddate")
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "completed")
    private boolean completed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "approved")
    private boolean approved;

    public Tasks() {
    }

    public Tasks(Integer taskId) {
        this.taskId = taskId;
    }

    public Tasks(Integer taskId, String taskName, Date startDate, Date enddate, boolean completed, boolean approved) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.startDate = startDate;
        this.enddate = enddate;
        this.completed = completed;
        this.approved = approved;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public boolean getCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean getApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskId != null ? taskId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tasks)) {
            return false;
        }
        Tasks other = (Tasks) object;
        if ((this.taskId == null && other.taskId != null) || (this.taskId != null && !this.taskId.equals(other.taskId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Tasks[ taskId=" + taskId + " ]";
    }
    
}
