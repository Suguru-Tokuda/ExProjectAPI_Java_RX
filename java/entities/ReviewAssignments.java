/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Suguru
 */
@Entity
@Table(name = "ReviewAssignments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReviewAssignments.findAll", query = "SELECT r FROM ReviewAssignments r")
    , @NamedQuery(name = "ReviewAssignments.findByReviewId", query = "SELECT r FROM ReviewAssignments r WHERE r.reviewAssignmentsPK.reviewId = :reviewId")
    , @NamedQuery(name = "ReviewAssignments.findByUserId", query = "SELECT r FROM ReviewAssignments r WHERE r.reviewAssignmentsPK.userId = :userId")
    , @NamedQuery(name = "ReviewAssignments.findByReviewerId", query = "SELECT r FROM ReviewAssignments r WHERE r.reviewerId = :reviewerId")
    , @NamedQuery(name = "ReviewAssignments.findByProjectId", query = "SELECT r FROM ReviewAssignments r WHERE r.projectId = :projectId")})
public class ReviewAssignments implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReviewAssignmentsPK reviewAssignmentsPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "reviewerId")
    private int reviewerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "projectId")
    private int projectId;

    public ReviewAssignments() {
    }

    public ReviewAssignments(ReviewAssignmentsPK reviewAssignmentsPK) {
        this.reviewAssignmentsPK = reviewAssignmentsPK;
    }

    public ReviewAssignments(ReviewAssignmentsPK reviewAssignmentsPK, int reviewerId, int projectId) {
        this.reviewAssignmentsPK = reviewAssignmentsPK;
        this.reviewerId = reviewerId;
        this.projectId = projectId;
    }

    public ReviewAssignments(int reviewId, int userId) {
        this.reviewAssignmentsPK = new ReviewAssignmentsPK(reviewId, userId);
    }

    public ReviewAssignmentsPK getReviewAssignmentsPK() {
        return reviewAssignmentsPK;
    }

    public void setReviewAssignmentsPK(ReviewAssignmentsPK reviewAssignmentsPK) {
        this.reviewAssignmentsPK = reviewAssignmentsPK;
    }

    public int getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(int reviewerId) {
        this.reviewerId = reviewerId;
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
        hash += (reviewAssignmentsPK != null ? reviewAssignmentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReviewAssignments)) {
            return false;
        }
        ReviewAssignments other = (ReviewAssignments) object;
        if ((this.reviewAssignmentsPK == null && other.reviewAssignmentsPK != null) || (this.reviewAssignmentsPK != null && !this.reviewAssignmentsPK.equals(other.reviewAssignmentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ReviewAssignments[ reviewAssignmentsPK=" + reviewAssignmentsPK + " ]";
    }
    
}
