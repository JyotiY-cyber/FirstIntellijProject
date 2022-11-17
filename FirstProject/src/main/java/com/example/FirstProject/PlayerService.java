
@Service                           // its seems as service layer putting @Service ,its enable dependency.
public class PlayerService{

    private List<Players> list= new ArrayList<>();

    public PlayerService(){
        System.out.println(" service layer is created");
        list.add(new Players(1,"Jyoti"));
        list.add(new Players(2,"shruti"));
        list.add(new Players(3,"pintu"));
        list.add(new Players(4,"puttu"));
}
//return all the players
public List<Players> getAllPlayers(){
    return list;
}
//return the player by id 
public Players getPlayerById(){
    for(Players p: list){
        if(P.getId()==id){
        return p;
        }
    }
    return null;
}
//add the players
public void addPlayers(){
    this.list.add(Players)
}
// update the players 
public Players updatePlayer(){
    for(Players p: list){
        if(p.getId()==players.getId()){
           p.setName(players.getsName());
        }
    }
}
//remove the player
public void deletePlayers(){
    
}


}