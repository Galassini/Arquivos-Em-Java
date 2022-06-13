package qintess.academiajava.aplicacao.datas;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class AppDatas05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		//Formatando a data 
		DateFormat df1 = DateFormat.getDateInstance();
		System.out.println("Data 1 " + df1.format(data));
		
		df1 = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("Data FULL " + df1.format(data));
		
		df1 = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println("Data MEDIUM " + df1.format(data));
		
		df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println("Data SHORT " + df1.format(data));
		
		DateFormat df2 = DateFormat.getTimeInstance();
		System.out.println("Hora: " + df2.format(data));
		
		DateFormat df3 = DateFormat.getDateTimeInstance();
		System.out.println("Hora: " + df3.format(data));
		
		
	}

}
