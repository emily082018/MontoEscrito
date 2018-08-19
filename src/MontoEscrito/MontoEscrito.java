package MontoEscrito;

public class MontoEscrito {

	public String Letras(String numero) {

		String letras = "";
		
		switch (numero.substring(0, 1)) {

		case "1":
			letras = "MIL";
			break;
			
		case "2":
			letras = "DOS MIL";
			break;
		
		case "3":
			letras = "TRES MIL";
			break;
			
		case "4":
			letras = "CUATRO MIL";
			break;
			
		case "5":
			letras = "CINCO MIL";
			break;
			
		case "6":
			letras = "SEIS MIL";
			break;
			
		case "7":
			letras = "SIETE MIL";
			break;
			
		case "8":
			letras = "OCHO MIL";
			break;
			
		case "9":
			letras = "NUEVE MIL";
			break;
			
		default:
			letras = "";
			break;
		}
		
		switch (numero.substring(1, 2)) {

		case "1":
			letras = "CIEN";
			break;
			
		case "2":
			letras = "DOSCIENTOS";
			break;
		
		case "3":
			letras = "TRESCIENTOS";
			break;
			
		case "4":
			letras = "CUATROCIENTOS";
			break;
			
		case "5":
			letras = "QUINIENTOS";
			break;
			
		case "6":
			letras = "SEISCIENTOS";
			break;
			
		case "7":
			letras = "SIETECIENTOS";
			break;
			
		case "8":
			letras = "OCHOCIENTOS";
			break;
			
		case "9":
			letras = "NOVECIENTOS";
			break;
			
		default:
			letras = "";
			break;
		}
		
		switch (numero.substring(2, 3)) {

		case "1":
			letras = "DIEZ";
			break;
			
		case "2":
			letras = "VEINTE";
			break;
		
		case "3":
			letras = "TREINTA";
			break;
			
		case "4":
			letras = "CUARENTA";
			break;
			
		case "5":
			letras = "CINCUENTA";
			break;
			
		case "6":
			letras = "SESENTA";
			break;
			
		case "7":
			letras = "SETENTA";
			break;
			
		case "8":
			letras = "OCHENTA";
			break;
			
		case "9":
			letras = "NOVENTA";
			break;
			
		default:
			letras = "";
			break;
		}
		
		switch (numero.substring(3, 43)) {

		case "1":
			letras = "UNO";
			break;
			
		case "2":
			letras = "DOS";
			break;
		
		case "3":
			letras = "TRES";
			break;
			
		case "4":
			letras = "CUATRO";
			break;
			
		case "5":
			letras = "CINCO";
			break;
			
		case "6":
			letras = "SEIS";
			break;
			
		case "7":
			letras = "SIETE";
			break;
			
		case "8":
			letras = "OCHO";
			break;
			
		case "9":
			letras = "NUEVE";
			break;
			
		default:
			letras = "";
			break;
		}

		return letras;

	}
	
	
}
