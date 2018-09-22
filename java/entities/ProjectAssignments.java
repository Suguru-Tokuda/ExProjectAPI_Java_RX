/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
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
@Table(name = "ProjectAssignments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProjectAssignments.findAll", query = "SELECT p FROM ProjectAssignments p")
    , @NamedQuery(name = "ProjectAssignments.findByProjectId", query = "SELECT p FROM ProjectAssignments p WHERE p.projectAssignmentsPK.projectId = :projectId")
    , @NamedQuery(name = "ProjectAssignments.findByUserId", query = "SELECT p FROM ProjectAssignments p WHERE p.projectAssignmentsPK.userId = :userId")})
public class ProjectAssignments implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProjectAssignmentsPK projectAssignmentsPK;

    public ProjectAssignments() {
    }

    public ProjectAssignments(ProjectAssignmentsPK projectAssignmentsPK) {
        this.projectAssignmentsPK = projectAssignmentsPK;
    }

    public ProjectAssignments(int projectId, int userId) {
        this.projectAssignmentsPK = new ProjectAssignmentsPK(projectId, userId);
    }

    public ProjectAssignmentsPK getProjectAssignmentsPK() {
        return projectAssignmentsPK;
    }

    public void setProjectAssignmentsPK(ProjectAssignmentsPK projectAssignmentsPK) {
        this.projectAssignmentsPK = projectAssignmentsPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (projectAssignmentsPK != null ? projectAssignmentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProjectAssignments)) {
            return false;
        }
        ProjectAssignments other = (ProjectAssignments) object;
        if ((this.projectAssignmentsPK == null && other.projectAssignmentsPK != null) || (this.projectAssignmentsPK != null && !this.projectAssignmentsPK.equals(other.projectAssignmentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ProjectAssignments[ projectAssignmentsPK=" + projectAssignmentsPK + " ]";
    }
    
}
