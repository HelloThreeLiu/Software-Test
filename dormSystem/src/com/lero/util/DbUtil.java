package com.lero.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	
	public Connection getCon() throws Exception {
		Class.forName(PropertiesUtil.getValue("jdbcName"));
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3333/db_dorm?useSSL=false&serverTimezone=CST&characterEncoding=utf-8","root","20010214");
		return con;
	}
	
	public void closeCon(Connection con) throws Exception {
		if(con!=null) {
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil = new DbUtil();
		try {
			dbUtil.getCon();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("no");
			e.printStackTrace();
		}
	}
}
