package dna.com;

public class converter {

	public static String complementWC(String dna){
		String builder = new String();
		for( int i=0;i<dna.length();i++){		        
	        if(dna.charAt(i) == 'T')  {builder=builder.concat("A"); }
	        if(dna.charAt(i) == 'A'){ builder=builder.concat("T"); }		            
	        if(dna.charAt(i) == 'C')  { builder=builder.concat("G");  }
	        if(dna.charAt(i) == 'G'){builder=builder.concat("C");}  	  
		}
	    return builder;
	    
	}


}
