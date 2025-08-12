package com.sist.music;

import lombok.Data;

@Data
public class MusicVO { // VO = value Object 
	private int mno; // 뮤직번호
	private String title; //곡명 
	private String singer;
	private String album;
	private String state;
	private int idcrement; //등폭
	
}
