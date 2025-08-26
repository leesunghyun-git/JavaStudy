package com.sist.inner.win;
import java.util.Date;

import lombok.Data;
@Data
public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private Date hiredate;
	private int sal;
	private int comm;
	private int deptno;
}
