package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        UserService service = new UserServiceImpl();

        service.createUsersTable();
        service.saveUser("Ivan", "Ivanov", (byte) 30);
        service.removeUserById(2);
        service.getAllUsers();
        service.cleanUsersTable();
        service.dropUsersTable();
        Util.sessionClose();


    }
}
