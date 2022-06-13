package qintess.academiajava.aplicacao.datas;

import java.util.Calendar;

public class AppDatas03 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());   // Retorna a data atual 
		
		
		//Obtendo valores de alguns itens do calendario 
		System.out.println("Ano: " + calendar.get(Calendar.YEAR));
		System.out.println("Mês: " + calendar.get(Calendar.MONTH));
		System.out.println("Dia: " + calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println();
		
		calendar.set(Calendar.YEAR, 2023);
		calendar.set(Calendar.MONTH, Calendar.APRIL);
		calendar.add(Calendar.DAY_OF_MONTH, 15);
		
		System.out.println(calendar.getTime()); 

	}

}
