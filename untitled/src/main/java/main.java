import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public class main {
    public static void main(String[] args) throws SQLException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        System.out.println("Hello");
        System.out.println("Hello");
        User u = new User();
        List<User> userList = u.getAll();
        for (User x : userList){
            System.out.println(x);
        }
    }
}
