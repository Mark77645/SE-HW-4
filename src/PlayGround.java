import java.util.Vector;

public class PlayGround {
    private String name;
    private String location;
    private PlayGroundOwner owner;
    private Boolean status;
    private Vector<Reservations> reservation;
    private String hours;
    public void setHours(String h){
        hours=h;
    }
    public String getHours(){
        return hours;
    }
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setLocation(String loc){
        location=loc;
    }
    public String getLocation(){
        return location;
    }
    public void setStatus(Boolean stat){
        status=stat;
    }
    public Boolean getStatus(){
        return status;
    }
    public void setPlayGroundOwner(PlayGroundOwner pgo){
        PlayGroundOwner=pgo;
    }
}
