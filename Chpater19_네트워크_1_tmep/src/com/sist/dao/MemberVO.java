package com.sist.dao;

import lombok.Data;

/*
 * 	이름      널?       유형            
 *------- -------- ------------- 
 *  ID      NOT NULL VARCHAR2(20)  
    PWD     NOT NULL VARCHAR2(20)  
    NAME    NOT NULL VARCHAR2(51)  
    POST    NOT NULL VARCHAR2(7)   
    ADDRESS NOT NULL VARCHAR2(250) 
    ADDR2            VARCHAR2(200) 
    LOGIN            NUMBER 
 * 
 */
@Data
public class MemberVO {
	private String id;
	private String pwd;
	private String name;
	private String post;
	private String addr1;
	private String addr2;
	private int login;
	private String msg;
}
