package com.alpha.test;

import com.alpha.utils.Utilities;

public class AlphaAppTest 
{
   public static void main(String[] args) 
   {
	  Utilities util = new Utilities();
	  
	  boolean res; 
	  
	  res = util.verifyName("ALPHA"); 
	  System.out.println("res : "+res);
	  
	  
	  res = util.verifyEmailFormat("ALPHA123@gmail.com"); 
	  System.out.println("res : "+res);
	  
	  
	  res = util.verifyPassword("abc1234%");
	  System.out.println("res : "+res);
	  
   }
}
