package com.crud.library.service;

import com.crud.library.domain.User;
import com.crud.library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

@Service
public class DbManager {

    @Autowired
    private UserRepository repository;

    public List<User> getAllUsers(){
        return repository.findAll();
    }

    public User getUserById(final Long id){
        return repository.findOne(id);
    }

    public User saveUser(final User user){
        return repository.save(user);
    }

    public void deleteUser(Long id){
        repository.delete(id);
    }


    //Odpowiada z łączenie się z bazą danych
    /*
    private Connection conn;
    private static DbManager dbManagerInstance;

    private DbManager() throws SQLException {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "pablo");
        connectionProps.put("password", "muminia");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library?serverTimezone=Europe/Warsaw" +
                        "&useSSL=False",
                connectionProps);
    }

    public static DbManager getInstance() throws SQLException {
        if (dbManagerInstance == null) {
            dbManagerInstance = new DbManager();
        }
        return dbManagerInstance;
    }

    public Connection getConnection() {
        return conn;
    }*/

}