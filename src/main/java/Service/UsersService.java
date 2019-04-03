package Service;

import bl.Until;
import dao.UsersDAO;
import entity.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UsersService extends Until implements UsersDAO {

    Connection connection = getConnection();

    public void add(Users user) throws SQLException {
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO users (team_id, full_name, email, password, user_role, created_at) VALUES(?,?,?,?,?,?)";

        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, user.getTeamId());
            preparedStatement.setString(2, user.getFullName());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getPassword());
            preparedStatement.setString(5, user.getUserRole());
            preparedStatement.setString(6, user.getCreatedAt());

            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

    public List<Users> getAll() {
        return null;
    }

    public Users getById(Integer id) {
        return null;
    }

    public void update(Users user) {

    }

    public void remove(Users user) {

    }
}
