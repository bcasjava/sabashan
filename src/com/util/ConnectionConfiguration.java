package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionConfiguration {

	public static Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://mysql-dev-01.cloud.wso2.com:3306/staff_sabashan","staff_Sc9iK0nP","!@qwaszx");
            //System.out.println("connection = " + connection);
            //System.out.println("Established");
        } catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}