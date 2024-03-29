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
public class ProjectAssignmentsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "projectId")
    private int projectId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userId")
    private int userId;

    public ProjectAssignmentsPK() {
    }

    public ProjectAssignmentsPK(int projectId, int userId) {
        this.projectId = projectId;
        this.userId = userId;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) projectId;
        hash += (int) userId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjectAssignmentsPK)) {
            return false;
        }
        ProjectAssignmentsPK other = (ProjectAssignmentsPK) object;
        if (this.projectId != other.projectId) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProjectAssignmentsPK[ projectId=" + projectId + ", userId=" + userId + " ]";
    }
    
}
