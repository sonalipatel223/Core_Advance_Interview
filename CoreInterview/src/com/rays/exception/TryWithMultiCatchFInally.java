
package com.rays.exception;

public class TryWithMultiCatchFInally {

	public static void main(String[] args) {
		String s = null;
		String st = "abc";
		try {
			

			System.out.println(s.length());
			System.out.println(st.charAt(5));
			//System.exit(0);

		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
			 //System.exit(0);
		
		} catch (RuntimeException e) {
			System.out.println(e);
			 System.exit(0);
			
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("Finally block");
		}
	}

}
