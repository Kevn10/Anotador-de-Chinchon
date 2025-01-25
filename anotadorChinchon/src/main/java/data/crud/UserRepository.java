package data.crud;

import data.DatabaseConfig;
import data.entityFramework.User;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class UserRepository {

    public void insertarUser(User user){
        String sql = "INSERT INTO Users (usu_name, usu_birthday, usu_mail, usu_username, usu_password, usu_country ) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConfig.getConnection();
        PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, user.getName());
            pst.setDate(2, user.getBirthDate());
            pst.setString(3, user.getMail());
            pst.setString(4, user.getUsername());
            pst.setString(5, user.getPassword());
            pst.setString(6, user.getCountry());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<User> obtenerUser() {
        String sql = "SELECT * FROM Users";
        List<User> user = new ArrayList<>();

        try (Connection conn = DatabaseConfig.getConnection();
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery(sql)) {

            while (rs.next()) {
                User users = new User();
                users.setId(rs.getInt("id"));
                users.setName(rs.getString("name"));
                users.setBirthDate(rs.getDate("birthday"));
                users.setMail(rs.getString("mail"));
                users.setUsername(rs.getString("username"));
                users.setPassword(rs.getString("password"));
                users.setCountry(rs.getString("country"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public void ActualizarUser(int id ,String mail, String username, String password, Date modifiedDate) {
        // Mail, NombreUsuario, FechaModificación, Contraseña
        String sql = "UPDATE Users SET (usu_mail, usu_username, usu_password, usu_modifiedDate) = ? WHERE usu_id = ?";

        try (Connection conn = DatabaseConfig.getConnection();
        PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setString(1, mail);
            pst.setString(2, username);
            pst.setString(3, password);
            pst.setDate(4, modifiedDate);
            pst.setInt(5, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
