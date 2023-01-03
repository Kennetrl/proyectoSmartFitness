package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
	public static boolean validarOpcion4(String opcion){
		String regex = "^[1-4]$";
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(opcion);
		if(mat.find()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean validarOpcion9(String opcion){
		String regex = "^[1-9]$";
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(opcion);
		if(mat.find()) {
			return true;
		}else {
			return false;
		}
	}
}

