package com.wanyin.java;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionTest {

    @Test
    public void testConnection1() throws SQLException {
        Driver driver = new com.mysql.jdbc.Driver();

        String url = null;
        Properties info = null;

        Connection conn = driver.connect(url,info);

        System.out.println(conn);
    }
}
