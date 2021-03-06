package dev.landen.daos;

import dev.landen.entities.app_user;

import java.util.List;

    public interface app_userDAO {

        // Create
        app_user createapp_user(app_user app_user);



        // Read
        app_user getuserByuserNameandPassword(String username, String pswd);
        app_user getuserById(int id);
        List<app_user> getAllusers();

        //Update
        app_user updateUser(String username, int id);

        //Delete
        app_user deleteapp_userById(int id);

    }



