package org.condeis.parsers;

public class ParserMain {

	public static void main(String[] args) throws Exception {
long start =0;
long end=0;
//		    start= System.currentTimeMillis();
//		  DOMParserDemo.main(null);
//		    end= System.currentTimeMillis();
//		  System.out.println("Time elapsed for DOM Parser: "+(end-start));  
		  start= System.currentTimeMillis();
		  SAXParserDemo.main(null);
		    end= System.currentTimeMillis();
		  System.out.println("Time elapsed for SAX Parser: "+(end-start));  
		  StaxParserDemo.main(null);
		    end= System.currentTimeMillis();
		  System.out.println("Time elapsed for Stax Parser: "+(end-start));
//System.out.println("--------------------------------------------------------------------");
//start= System.currentTimeMillis();
//	  DOMParserDemo.main(null);
//	    end= System.currentTimeMillis();
//	  System.out.println("Time elapsed for DOM Parser: "+(end-start));  
//	  start= System.currentTimeMillis();
//	  SAXParserDemo.main(null);
//	    end= System.currentTimeMillis();
//	  System.out.println("Time elapsed for SAX Parser: "+(end-start));  
//	  StaxParserDemo.main(null);
//	    end= System.currentTimeMillis();
//	  System.out.println("Time elapsed for Stax Parser: "+(end-start));
//	   
	}

}
