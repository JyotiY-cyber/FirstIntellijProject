import javax.persistance.Entity;
import javax.persistance.id;

@Entity// its create database in h2
public class Employee{
    @Id
    private int eid;
    private String ename;
    private double esalary;
     Employee(int eid, String ename, double esalary){
        this.eid=eid;
        this.ename=ename;
        this.esalary=esalary;
    }
    public int getEid(){
        return eid;
    }
    public void setEid(int eid){
        this.eid=eid;
    }
    public String getEname(){
        return ename;
    }
    public void setEname(String ename){
        this.ename=ename;
    }
    public long getEsalary(){
        return esalary;
    }
    public void setEsalary(long esalary){
        this.esalary=esalary;
    }
}