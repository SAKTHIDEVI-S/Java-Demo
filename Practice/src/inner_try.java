class outer1 //Outer
{
   static class outer2 //nested
   {
   
     class inner //nested in nested
	 {
	    void  inn() //nested in nested method
		 {
		    System.out.println("I am in inner");
		 }
	 }
	 void  pqr() //nested method
	 {
		 System.out.println("I am in Outer2");
	 }
   }
   void abc() //outer method
	 {
		 System.out.println("I am in Outer1");
	 }

}

class inner_try
{
    public static void main(String [] args)
    {
		outer1 O1 = new outer1();//outer1
		outer1.outer2 O2 = new outer1.outer2();//outer2 static
        outer1.outer2.inner inst = O2.new inner();//inner nonstatic
  
        O1.abc();
		O2.pqr();
        inst.inn();		
		
	}
	
	
}

