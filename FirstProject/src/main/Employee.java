import javax.persistance.Entity;
import javax.persistance.id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
//@Scope(value="prototype")
@Entity// its create database in h2
public class Employee{
    @Id
    private int eid;
    private String ename;
    private double esalary;
    @Autowired                 //adding dependency injection and its search by type of object
    @Qualifier("cli")       // @Qualifier("name of object") its search/ connect by qualified name of object
    Private Client client;   
    
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
    public long getClient(){
        return client;
    }
    public void setClient(long client){
        this.client=client;
    }
    public void show(){
        System.out.println("showing");
        client.run();
    }
}