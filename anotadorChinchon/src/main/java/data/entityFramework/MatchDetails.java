package data.entityFramework;

public class MatchDetails {
    int id;
    String player;
    int point;
    MatDetailsStatus status;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPlayer() {
        return player;
    }
    public void setPlayer(String player) {
        this.player = player;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    public MatDetailsStatus getStatus() {
        return status;
    }
    public void setStatus(MatDetailsStatus status) {
        this.status = status;
    }
    
}
