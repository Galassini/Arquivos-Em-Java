package qintess.academiajava.aplicacao.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class AppDatas01 {
	public static void main(String[] args) {

		Date data = new Date();
		System.out.println(data);

		// formatar datas e horas
		DateFormat df = new SimpleDateFormat("dd/MM/yy");
		System.out.println(df.format(data));

		df = new SimpleDateFormat("dd/MM/yy - HH:mm:ss");
		System.out.println(df.format(data));

		df = new SimpleDateFormat("ddd");
		System.out.println(df.format(data));

		df = new SimpleDateFormat("MMM");
		System.out.println(df.format(data));

		df = new SimpleDateFormat("MMMM");
		System.out.println(df.format(data));

		df = new SimpleDateFormat("EEEE");
		System.out.println(df.format(data));
		
		df = new SimpleDateFormat("EEEE", Locale.ENGLISH);
		System.out.println(df.format(data));
		
		df = new SimpleDateFormat("EEEE", new Locale("es", "ES"));
		System.out.println(df.format(data));
		
		
	}

}
