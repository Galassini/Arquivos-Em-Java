package qintess.academiajava.aplicacao.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class AppDatas02 {
	public static void main(String[] args) {

		try {
			String sdata = JOptionPane.showInputDialog("Informe uma data: (dd/mm/aaaa): e uma hora (hh:mm): ");
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");
			Date data = df.parse(sdata);
			System.out.println(data);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
