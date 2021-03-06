package br.edu.ifms.pykota.entidades;
// Generated 24/01/2014 12:32:52 by Hibernate Tools 3.6.0


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Billingcodes generated by hbm2java
 */
@Entity
@Table(name="billingcodes"
    ,catalog="pykota"
    , uniqueConstraints = @UniqueConstraint(columnNames="billingcode") 
)
public class Billingcodes  implements java.io.Serializable {


     private Integer id;
     private String billingcode;
     private String description;
     private Float balance;
     private Integer pagecounter;

    public Billingcodes() {
    }

	
    public Billingcodes(String billingcode) {
        this.billingcode = billingcode;
    }
    public Billingcodes(String billingcode, String description, Float balance, Integer pagecounter) {
       this.billingcode = billingcode;
       this.description = description;
       this.balance = balance;
       this.pagecounter = pagecounter;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="billingcode", unique=true, nullable=false)
    public String getBillingcode() {
        return this.billingcode;
    }
    
    public void setBillingcode(String billingcode) {
        this.billingcode = billingcode;
    }

    
    @Column(name="description", length=65535)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
    @Column(name="balance", precision=12, scale=0)
    public Float getBalance() {
        return this.balance;
    }
    
    public void setBalance(Float balance) {
        this.balance = balance;
    }

    
    @Column(name="pagecounter")
    public Integer getPagecounter() {
        return this.pagecounter;
    }
    
    public void setPagecounter(Integer pagecounter) {
        this.pagecounter = pagecounter;
    }




}


