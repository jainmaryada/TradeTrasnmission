package tradeTransmission;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @author maryadaj
 *
 */
public class TradeTransmissionMain {

	public static void main(String[] args) throws Exception {
		
		TradeFlow tf=new TradeFlow();
		Date todaysDate=Calendar.getInstance ().getTime ();
		SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy");
		
		
		
//		Adding Trade T1
		Date maturityDate=sd.parse("20/05/2021");
		Trade t1=new Trade("T1",1,"CP-1","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t1);
		
		//Adding Trade T2
		maturityDate=sd.parse("20/05/2021");
		Trade t2=new Trade("T2",2,"CP-2","B1",maturityDate, todaysDate, 'N');
		tf.addTrade(t2);
//		tf.printTrade();	
		
		
		//Changing Trade T2
		try {
			
			Trade t4=new Trade("T2",1,"CP-1","B1",sd.parse("20/05/2021"), sd.parse("14/03/2015"), 'N');
			tf.addTrade(t4);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Adding Trade T3
		maturityDate=sd.parse("20/05/2014");
		Trade t3=new Trade("T3",3,"CP-3","B2",maturityDate, todaysDate, 'Y');
		tf.addTrade(t3);
		
		
		
		//Display all Trade
		System.out.println("\n\n");
		System.out.println("Displaying total number of Trade in the list");
		tf.printTrade();
		System.out.println("\n\n");	
				
	}

}
