import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Domain {
    //private  static final  Logger logger = Logger.getLogger(Domain.class.getName());

    private static Logger LOGGER = Logger.getLogger(Domain.class.getName());

    static {
        InputStream stream = Domain.class.getClassLoader().
                getResourceAsStream("logging.properties");
        try {
            LogManager.getLogManager().readConfiguration(stream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LOGGER.log(Level.FINER, "finer");
        LOGGER.log(Level.INFO, "info");

        /*Until until = new Until();
        until.getConnection();

        UsersService usersService = new UsersService();

        Users users = new Users();
        users.setEmail("test2@gmail.com");
        users.setFullName("Test2");
        users.setPassword("SomePassword2");
        users.setUserRole("player");
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        users.setCreatedAt(ts);
        try {
            usersService.add(users);
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
    }
}
