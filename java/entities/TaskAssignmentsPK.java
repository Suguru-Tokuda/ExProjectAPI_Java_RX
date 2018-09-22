/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Suguru
 */
@Embeddable
public class TaskAssignmentsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "taskId")
    private int taskId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "projectId")
    private int projectId;

    public TaskAssignmentsPK() {
    }

    public TaskAssignmentsPK(int taskId, int projectId) {
        this.taskId = taskId;
        this.projectId = projectId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) taskId;
        hash += (int) projectId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TaskAssignmentsPK)) {
            return false;
        }
        TaskAssignmentsPK other = (TaskAssignmentsPK) object;
        if (this.taskId != other.taskId) {
            return false;
        }
        if (this.projectId != other.projectId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TaskAssignmentsPK[ taskId=" + taskId + ", projectId=" + projectId + " ]";
    }
    
}
