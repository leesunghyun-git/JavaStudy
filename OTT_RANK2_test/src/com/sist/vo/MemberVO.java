package com.sist.vo;

import lombok.Getter;
import lombok.Setter;

public class MemberVO {
	@Getter
	@Setter
	private int id_num;
	@Getter
	@Setter
	private String nickname;
	@Getter
	@Setter
	private String Login_id;
	@Getter
	@Setter
	private String Login_pwd;
	@Getter
	@Setter
	private String sex;
	@Getter
	@Setter
	private String post;
	@Getter
	@Setter
	private String addr1;
	@Getter
	@Setter
	private String addr2;
	@Getter
	@Setter
	private String phone;
}
