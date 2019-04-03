import Service.UsersService;
import bl.Until;
import entity.Users;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Domain {

    public static void main(String[] args){
        Until until = new Until();
        until.getConnection();
        /*
        UsersService usersService = new UsersService();

        Users users = new Users();
        users.setEmail("test@gmail.com");
        users.setFullName("Test");
        users.setPassword("SomePassword");
        users.setUserRole("player");
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        users.setCreatedAt(timeStamp);
        try {
            usersService.add(users);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */
    }
}
