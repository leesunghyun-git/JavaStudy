package com.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAOdefault {
	private Connection conn;
	private PreparedStatement ps;
	private final static String URL="jdbc:oracle:thin:@211.238.142.22:1521:XE";
	public DAOdefault() {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr_2","happy");
		}catch(Exception ex) {}
	}
	public void disConnection()
	{
		try
		{
			if(conn!=null) conn.close(); if(ps!=null) ps.close();
		}catch(Exception ex) {}
	}
	public Connection getConn() {
        return conn;
    }
	public PreparedStatement getPs() {
        return ps;
    }
}
