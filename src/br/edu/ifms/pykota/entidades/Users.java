package br.edu.ifms.pykota.entidades;
// Generated 24/01/2014 12:32:52 by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Users generated by hbm2java
 */
@Entity
@Table(name="users"
    ,catalog="pykota"
    , uniqueConstraints = @UniqueConstraint(columnNames="username") 
)
public class Users implements java.io.Serializable {


     private Integer id;
     private String username;
     private String email;
     private Float balance;
     private Float lifetimepaid;
     private String limitby;
     private String description;
     private float overcharge;
     private Set<Userpquota> userpquotas = new HashSet<Userpquota>(0);
     private Set<Payments> paymentses = new HashSet<Payments>(0);
     private Set<Groups> groupses = new HashSet<Groups>(0);
	
     public Users(){}
     
    public Users(String username, float overcharge) {
        this.username = username;
        this.overcharge = overcharge;
    }
    public Users(String username, String email, Float balance, Float lifetimepaid, String limitby, String description, float overcharge, Set<Userpquota> userpquotas, Set<Payments> paymentses, Set<Groups> groupses) {
       this.username = username;
       this.email = email;
       this.balance = balance;
       this.lifetimepaid = lifetimepaid;
       this.limitby = limitby;
       this.description = description;
       this.overcharge = overcharge;
       this.userpquotas = userpquotas;
       this.paymentses = paymentses;
       this.groupses = groupses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="username", unique=true, nullable=false)
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    
    @Column(name="email", length=65535)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="balance", precision=12, scale=0)
    public Float getBalance() {
        return this.balance;
    }
    
    public void setBalance(Float balance) {
        this.balance = balance;
    }

    
    @Column(name="lifetimepaid", precision=12, scale=0)
    public Float getLifetimepaid() {
        return this.lifetimepaid;
    }
    
    public void setLifetimepaid(Float lifetimepaid) {
        this.lifetimepaid = lifetimepaid;
    }

    
    @Column(name="limitby", length=30)
    public String getLimitby() {
        return this.limitby;
    }
    
    public void setLimitby(String limitby) {
        this.limitby = limitby;
    }

    
    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="overcharge", nullable=false, precision=12, scale=0)
    public float getOvercharge() {
        return this.overcharge;
    }
    
    public void setOvercharge(float overcharge) {
        this.overcharge = overcharge;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="users")
    public Set<Userpquota> getUserpquotas() {
        return this.userpquotas;
    }
    
    public void setUserpquotas(Set<Userpquota> userpquotas) {
        this.userpquotas = userpquotas;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="users")
    public Set<Payments> getPaymentses() {
        return this.paymentses;
    }
    
    public void setPaymentses(Set<Payments> paymentses) {
        this.paymentses = paymentses;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="groupsmembers", catalog="pykota", joinColumns = { 
        @JoinColumn(name="userid", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="groupid", nullable=false, updatable=false) })
    public Set<Groups> getGroupses() {
        return this.groupses;
    }
    
    public void setGroupses(Set<Groups> groupses) {
        this.groupses = groupses;
    }

    public String toString(){return this.username;} 


}


