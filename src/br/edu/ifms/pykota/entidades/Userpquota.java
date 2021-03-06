package br.edu.ifms.pykota.entidades;
// Generated 24/01/2014 12:32:52 by Hibernate Tools 3.6.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Userpquota generated by hbm2java
 */
@Entity
@Table(name="userpquota"
    ,catalog="pykota"
    , uniqueConstraints = @UniqueConstraint(columnNames={"userid", "printerid"}) 
)
public class Userpquota  implements java.io.Serializable {


     private Long id;
     private Printers printers;
     private Users users;
     private Integer lifepagecounter;
     private Integer pagecounter;
     private Integer softlimit;
     private Integer hardlimit;
     private Date datelimit;
     private Integer maxjobsize;
     private Integer warncount;
     
    public Userpquota() {
    }

    public Userpquota(Printers printers, Users users, Integer lifepagecounter, Integer pagecounter, Integer softlimit, Integer hardlimit, Date datelimit, Integer maxjobsize, Integer warncount) {
       this.printers = printers;
       this.users = users;
       this.lifepagecounter = lifepagecounter;
       this.pagecounter = pagecounter;
       this.softlimit = softlimit;
       this.hardlimit = hardlimit;
       this.datelimit = datelimit;
       this.maxjobsize = maxjobsize;
       this.warncount = warncount;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="printerid")
    public Printers getPrinters() {
        return this.printers;
    }
    
    public void setPrinters(Printers printers) {
        this.printers = printers;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="userid")
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }

    
    @Column(name="lifepagecounter")
    public Integer getLifepagecounter() {
        return this.lifepagecounter;
    }
    
    public void setLifepagecounter(Integer lifepagecounter) {
        this.lifepagecounter = lifepagecounter;
    }

    
    @Column(name="pagecounter")
    public Integer getPagecounter() {
        return this.pagecounter;
    }
    
    public void setPagecounter(Integer pagecounter) {
        this.pagecounter = pagecounter;
    }

    
    @Column(name="softlimit")
    public Integer getSoftlimit() {
        return this.softlimit;
    }
    
    public void setSoftlimit(Integer softlimit) {
        this.softlimit = softlimit;
    }

    
    @Column(name="hardlimit")
    public Integer getHardlimit() {
        return this.hardlimit;
    }
    
    public void setHardlimit(Integer hardlimit) {
        this.hardlimit = hardlimit;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datelimit", length=19)
    public Date getDatelimit() {
        return this.datelimit;
    }
    
    public void setDatelimit(Date datelimit) {
        this.datelimit = datelimit;
    }

    
    @Column(name="maxjobsize")
    public Integer getMaxjobsize() {
        return this.maxjobsize;
    }
    
    public void setMaxjobsize(Integer maxjobsize) {
        this.maxjobsize = maxjobsize;
    }

    
    @Column(name="warncount")
    public Integer getWarncount() {
        return this.warncount;
    }
    
    public void setWarncount(Integer warncount) {
        this.warncount = warncount;
    }
}


