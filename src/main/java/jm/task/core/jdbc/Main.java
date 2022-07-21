package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

        userDaoHibernate.createUsersTable();
        userDaoHibernate.saveUser("Donald", "Trump", (byte)77);
        userDaoHibernate.saveUser("Vovka", "Pupkin", (byte)15);
        userDaoHibernate.saveUser("Jan", "Jak", (byte)33);
        userDaoHibernate.saveUser("James", "Hatfield", (byte)55);
        System.out.println(userDaoHibernate.getAllUsers());
        userDaoHibernate.cleanUsersTable();
        userDaoHibernate.dropUsersTable();
    }
}
