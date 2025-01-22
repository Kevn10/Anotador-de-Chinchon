package data.entityFramework;

import java.sql.Date;

import javax.print.attribute.standard.DateTimeAtCreation;

public class Match {
    int id;
    String tittle;
    int playerQuantity;
    int points;
    Date date;
    DateTimeAtCreation createDate;
    // Para el status hay que crear una clase enum aparte y poner los tipos de estados, de ahí usar la enumeración especificada.
    MatchStatus status;
    boolean winnerId;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTittle() {
        return tittle;
    }
    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
    public int getPlayerQuantity() {
        return playerQuantity;
    }
    public void setPlayerQuantity(int playerQuantity) {
        this.playerQuantity = playerQuantity;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public DateTimeAtCreation getCreateDate() {
        return createDate;
    }
    public void setCreateDate(DateTimeAtCreation createDate) {
        this.createDate = createDate;
    }
    public MatchStatus getStatus() {
        return status;
    }
    public void setStatus(MatchStatus status) {
        this.status = status;
    }
    public boolean isWinnerId() {
        return winnerId;
    }
    public void setWinnerId(boolean winnerId) {
        this.winnerId = winnerId;
    }

    
}
