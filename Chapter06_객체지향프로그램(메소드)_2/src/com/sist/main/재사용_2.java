package com.sist.main;
/*
 * 
 * 	class A
 *  {
 *    int a;
 *    int b;
 *    public void aaa(){}
 *  }
 *  class B extends A
 *  {
 *    int c;
 *    public void bbb(){}
 *    
 *    int a;
 *    int b;
 *    public void aaa(){}
 *  }
 * 	
 * 	B bb=new B();
 * 
 * 	----bb-----   --------------------
 * 	 저장된 주소		  -----super----
 * 	-----------			----a----
 * 				
 * 						----b----
 * 
 * 						---------
 * 						  aaa()
 * 						---------
 * 					   -----------
 * 			
 * 						-----this-----
 * 						  -----c-----
 * 			
 * 						  ------------
 * 							 bbb()
 * 						  ------------
 * 						----------------
 * 					-----------------------
 */
public class 재사용_2 {

}
