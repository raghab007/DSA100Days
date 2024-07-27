package TrySomethingNew;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private static List<User> list  = new ArrayList<>();

    public static  void addUser(User user){
        list.add(user);
    }

    public static List<User> getUsers(){
        return list;
    }
}
