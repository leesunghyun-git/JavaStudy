package com.sist.io;

import lombok.Getter;
import lombok.Setter;

//1|
//쇼생크 탈출|
//드라마|
//https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
//팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
//2016 .02.24 재개봉, 1995 .01.28 개봉|
//15세 관람가|
//프랭크 다라본트
/*
 * 
 * 	Select name , address , phone FROM member
 * 		   ----------------------
 * 		   setName setAdrress setPhone 
 */
public class MovieVO {
	@Getter
	@Setter
	private int mno;
	@Getter
	@Setter
	private String title;
	@Getter
	@Setter
	private String genre;
	@Getter
	@Setter
	private String poster;
	@Getter
	@Setter
	private String actor;
	@Getter
	@Setter
	private String regdate;
	@Getter
	@Setter
	private String grade;
	@Getter
	@Setter
	private String director;

}
