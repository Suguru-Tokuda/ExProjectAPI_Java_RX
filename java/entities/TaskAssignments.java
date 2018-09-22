/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Suguru
 */
@Entity
@Table(name = "TaskAssignments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TaskAssignments.findAll", query = "SELECT t FROM TaskAssignments t")
    , @NamedQuery(name = "TaskAssignments.findByTaskId", query = "SELECT t FROM TaskAssignments t WHERE t.taskAssignmentsPK.taskId = :taskId")
    , @NamedQuery(name = "TaskAssignments.findByProjectId", query = "SELECT t FROM TaskAssignments t WHERE t.taskAssignmentsPK.projectId = :projectId")
    , @NamedQuery(name = "TaskAssignments.findByUserId", query = "SELECT t FROM TaskAssignments t WHERE t.userId = :userId")})
public class TaskAssignments implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TaskAssignmentsPK taskAssignmentsPK;
    @Column(name = "userId")
    private Integer userId;

    public TaskAssignments() {
    }

    public TaskAssignments(TaskAssignmentsPK taskAssignmentsPK) {
        this.taskAssignmentsPK = taskAssignmentsPK;
    }

    public TaskAssignments(int taskId, int projectId) {
        this.taskAssignmentsPK = new TaskAssignmentsPK(taskId, projectId);
    }

    public TaskAssignmentsPK getTaskAssignmentsPK() {
        return taskAssignmentsPK;
    }

    public void setTaskAssignmentsPK(TaskAssignmentsPK taskAssignmentsPK) {
        this.taskAssignmentsPK = taskAssignmentsPK;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (taskAssignmentsPK != null ? taskAssignmentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaskAssignments)) {
            return false;
        }
        TaskAssignments other = (TaskAssignments) object;
        if ((this.taskAssignmentsPK == null && other.taskAssignmentsPK != null) || (this.taskAssignmentsPK != null && !this.taskAssignmentsPK.equals(other.taskAssignmentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TaskAssignments[ taskAssignmentsPK=" + taskAssignmentsPK + " ]";
    }
    
}
