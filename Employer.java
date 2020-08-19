/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stark.industries;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author DarkGamerX100
 */
@Entity
@Table(name = "employer", catalog = "stark_industries", schema = "")
@NamedQueries({
    @NamedQuery(name = "Employer.findAll", query = "SELECT e FROM Employer e")
    , @NamedQuery(name = "Employer.findById", query = "SELECT e FROM Employer e WHERE e.id = :id")
    , @NamedQuery(name = "Employer.findByName", query = "SELECT e FROM Employer e WHERE e.name = :name")
    , @NamedQuery(name = "Employer.findByDepartment", query = "SELECT e FROM Employer e WHERE e.department = :department")
    , @NamedQuery(name = "Employer.findBySalary", query = "SELECT e FROM Employer e WHERE e.salary = :salary")
    , @NamedQuery(name = "Employer.findByAddress", query = "SELECT e FROM Employer e WHERE e.address = :address")
    , @NamedQuery(name = "Employer.findByContact", query = "SELECT e FROM Employer e WHERE e.contact = :contact")
    , @NamedQuery(name = "Employer.findByGender", query = "SELECT e FROM Employer e WHERE e.gender = :gender")})
public class Employer implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Department")
    private String department;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Salary")
    private Double salary;
    @Column(name = "Address")
    private String address;
    @Column(name = "Contact")
    private Integer contact;
    @Column(name = "Gender")
    private String gender;

    public Employer() {
    }

    public Employer(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        String oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        Double oldSalary = this.salary;
        this.salary = salary;
        changeSupport.firePropertyChange("salary", oldSalary, salary);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        Integer oldContact = this.contact;
        this.contact = contact;
        changeSupport.firePropertyChange("contact", oldContact, contact);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employer)) {
            return false;
        }
        Employer other = (Employer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "stark.industries.Employer[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
