package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validaciones {
	public static boolean validarOpcion6(String opcion){
		String regex = "^[1-6]$";
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
	
	public static boolean validarOpcion7(String opcion){
		String regex = "^[1-7]$";
		Pattern pat = Pattern.compile(regex);
		Matcher mat = pat.matcher(opcion);
		if(mat.find()) {
			return true;
		}else {
			return false;
		}
	}
	    public boolean validarClave (String clave_aux){
	        String regex ="^(?=.[0-9])"+"(?=.[a-z])(?=.*[A-Z])";
	        Pattern patron = Pattern.compile(regex);
	        if (clave_aux == null){
	            return false;
	        }
	        Matcher m = patron.matcher(clave_aux);
	        return m.matches();
	    }
	    public boolean validarString(String cadena){
	        String regex ="[a-zA-Z]+\\.?";
	        Pattern patron = Pattern.compile(regex);
	        Matcher m = patron.matcher(cadena);
	        return m.matches();
	    }
	    public boolean validarEnteros(String entero){
	        String regex ="[+-]?[\\d]*[.]?[\\d]+";
	        Pattern patron = Pattern.compile(regex);
	        if (entero == null){
	            return false;
	        }
	        Matcher m = patron.matcher(entero);
	        return m.matches();
	    }
	    public boolean validarDouble(String Decimal){
	        String regex ="^[0-9]+(.[0-9]+)?";
	        Pattern patron = Pattern.compile(regex);
	        if (Decimal == null){
	            return false;
	        }
	        Matcher m = patron.matcher(Decimal);
	        return m.matches();
	    }
	    
	    public boolean validarEmail(String email){
	        String regex = "^[_a-z0-9-]*@" + "[a-z0-9-]+(\\.[a-z]{2,4})$";
	        Pattern patron = Pattern.compile(regex);
	        Matcher m = patron.matcher(email);
	        return m.matches();
	    }
	}
	