package Strings;

public class Strings {
	public static void main(String[] args) {

		// 1. 
		        String s1 = "NIRANJAN MANOJ MOGARE";
		     
		        System.out.println(s1);

		      
		        String s2 = new String("NIRANJAN MOGARE IN EAP MEMORY\"");
		        System.out.println(s2);


		// 2. Concatenating two strings using + operator
		        String sc1 = "niranjan ";
		        String sc2 = "mogare";
		        String con = sc1 + sc2; 
		        System.out.println(con);


		// 3. 
		        String sl = "niranjan";
		      
		        int len = sl.length();
		        System.out.println("String Length : " + len);


		// 4. 
		        String es = "niranjan mogare";
		       
		        String sub = es.substring(2, 10);
		        System.out.println("Extracted string : " + sub);


		// 5. 
		        String si = "Searching index";
		     
		        int i1 = si.indexOf("index");
		 
		        int i2 = si.indexOf("h", 3);
		        System.out.println("At Index : " + i1);
		        System.out.println("At Index : " + i2);


		// 6. 
		        String ms = "Matching  String";
		       
		        boolean match = ms.matches("niranjan");
		     
		        System.out.println("Matches : " + match);


		/* 7. 
		 */
		        String cs1 = "Comparing strings";
		        String cs2 = "Comparing strings";

		    
		        boolean e = cs1.equals(cs2);
		        System.out.println("Equal : " + e);

		   
		        boolean eic = cs1.equalsIgnoreCase(cs2);
		        System.out.println("Equal(ignore case) : " + eic);

		        boolean sw = cs1.startsWith("Comp");
		        System.out.println("Starts with : " + sw);

		   
		        boolean ew = cs1.endsWith("ings");
		        System.out.println("Ends with : " + ew);

		     
		        int ct = cs1.compareTo(cs2);
		        System.out.println("Compared : " + ct);


		// 9. 
		        String ts = "   niranjan mogare  ";
		      
		        String trm = ts.trim();
		        System.out.println("Trimmed : " + trm);


		// 10. 
		        String rs = "niranjan mogare";
		       
		        String rpl = rs.replace("r", "n");
		        System.out.println("Replaced : " + rpl);


		// 11.
		        String ss = "niranjan mogare";
		       
		        String[] spl = ss.split(" ");

		        for (String i : spl) {
		            System.out.println("Splitted : " + i);
		        }


		// 12. 
		        int nu = 67;
		       
		        String nTs = String.valueOf(nu);
		        System.out.println("Converted Num to Str : " + nTs + 67);


		// 13.
		        int in = 134;
		     
		        String iTs = Integer.toString(in);
		        System.out.println("Converted int to str : " + iTs + 134);


		// 14. 
		        String a = "niranjan mogare";
		        String b = "NIRANJAN MOGATRE";
		        
		        String c = a.toUpperCase();
		 
		        String d = b.toLowerCase();
		        System.out.println("Converted to upper case : " + c);
		        System.out.println("Converted yo lower case : " + d);
		    }
}
