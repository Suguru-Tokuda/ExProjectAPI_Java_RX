/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Suguru
 */
@Entity
@Table(name = "UserTypes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UserTypes.findAll", query = "SELECT u FROM UserTypes u")
    , @NamedQuery(name = "UserTypes.findByUserTypeId", query = "SELECT u FROM UserTypes u WHERE u.userTypeId = :userTypeId")
    , @NamedQuery(name = "UserTypes.findByUserId", query = "SELECT u FROM UserTypes u WHERE u.userId = :userId")
    , @NamedQuery(name = "UserTypes.findByProjectId", query = "SELECT u FROM UserTypes u WHERE u.projectId = :projectId")
    , @NamedQuery(name = "UserTypes.findByUserType", query = "SELECT u FROM UserTypes u WHERE u.userType = :userType")})
public class UserTypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "userTypeId")
    private Integer userTypeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "userId")
    private int userId;
    @Column(name = "projectId")
    private Integer projectId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "userType")
    private String userType;

    public UserTypes() {
    }

    public UserTypes(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public UserTypes(Integer userTypeId, int userId, String userType) {
        this.userTypeId = userTypeId;
        this.userId = userId;
        this.userType = userType;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userTypeId != null ? userTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserTypes)) {
            return false;
        }
        UserTypes other = (UserTypes) object;
        if ((this.userTypeId == null && other.userTypeId != null) || (this.userTypeId != null && !this.userTypeId.equals(other.userTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.UserTypes[ userTypeId=" + userTypeId + " ]";
    }
    
}
