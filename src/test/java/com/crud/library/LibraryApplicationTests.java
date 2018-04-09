package com.crud.library;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryApplicationTests {

    //@Test
    //public void contextLoads() { }

    @Test
    public void testConnect() throws SQLException {
        //Given
        /*
        DbManager dbManager = DbManager.getInstance();



        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;

        while (rs.next()) {
            System.out.println(rs.getInt("USERID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("SURNAME") + "," +
                    rs.getInt("ACCOUNT_CREATED_ON"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(1, counter);




        Assert.assertNotNull(dbManager.getConnection());
        */
    }

}
