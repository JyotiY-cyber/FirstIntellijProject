import org.springframework.stereotype.Component;
@Component       //@Component("cli")-> give name to object.
public class Client
{
private int cid;
private String projname;

/*Client(int cid, String projname){
    this.cid=cid;
    this.projname;
}*/
 public int getCid(){
        return cid;
    }
    public void setCid(int cid){
        this.cid=cid;
    }
    public int getProjNAme(){
        return projname;
    }
    public void setProjNAme(String projname){
        this.projname=projname;
    }
    public void run(){
        System.out.println(" running");
    }
}