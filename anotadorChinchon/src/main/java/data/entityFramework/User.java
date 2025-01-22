package data.entityFramework;

import java.sql.Date;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.DateTimeAtCreation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    Date birthDate;
    String mail;
    String username;
    String password;
    String country;
    DateTimeAtCreation createDate;
    DateTimeFormatter modifiedDate;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public DateTimeAtCreation getCreateDate() {
        return createDate;
    }
    public void setCreateDate(DateTimeAtCreation createDate) {
        this.createDate = createDate;
    }
    public DateTimeFormatter getModifiedDate() {
        return modifiedDate;
    }
    public void setModifiedDate(DateTimeFormatter modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    
}
