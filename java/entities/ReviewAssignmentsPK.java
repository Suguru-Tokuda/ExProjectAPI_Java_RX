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
public class ReviewAssignmentsPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "reviewId")
    private int reviewId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userId")
    private int userId;

    public ReviewAssignmentsPK() {
    }

    public ReviewAssignmentsPK(int reviewId, int userId) {
        this.reviewId = reviewId;
        this.userId = userId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
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
        hash += (int) reviewId;
        hash += (int) userId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReviewAssignmentsPK)) {
            return false;
        }
        ReviewAssignmentsPK other = (ReviewAssignmentsPK) object;
        if (this.reviewId != other.reviewId) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ReviewAssignmentsPK[ reviewId=" + reviewId + ", userId=" + userId + " ]";
    }
    
}
