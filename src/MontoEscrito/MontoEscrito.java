package MontoEscrito;

public class MontoEscrito {

	public String Letras(String numero) {

		String letras = "";

		if (numero.length() == 1) {
			numero = "000" + numero;
		}

		if (numero.length() == 2) {
			numero = "00" + numero;
		}

		if (numero.length() == 3) {
			numero = "0" + numero;
		}

		switch (numero.substring(0, 1)) {

		case "1":
			letras = "MIL ";
			break;

		case "2":
			letras = "DOS MIL ";
			break;

		case "3":
			letras = "TRES MIL ";
			break;

		case "4":
			letras = "CUATRO MIL ";
			break;

		case "5":
			letras = "CINCO MIL ";
			break;

		case "6":
			letras = "SEIS MIL ";
			break;

		case "7":
			letras = "SIETE MIL ";
			break;

		case "8":
			letras = "OCHO MIL ";
			break;

		case "9":
			letras = "NUEVE MIL ";
			break;

		default:
			letras = "";
			break;
		}

		switch (numero.substring(1, 2)) {

		case "1":
			letras = letras + "CIEN ";
			break;

		case "2":
			letras = letras + "DOSCIENTOS ";
			break;

		case "3":
			letras = letras + "TRESCIENTOS ";
			break;

		case "4":
			letras = letras + "CUATROCIENTOS ";
			break;

		case "5":
			letras = letras + "QUINIENTOS ";
			break;

		case "6":
			letras = letras + "SEISCIENTOS ";
			break;

		case "7":
			letras = letras + "SIETECIENTOS ";
			break;

		case "8":
			letras = letras + "OCHOCIENTOS ";
			break;

		case "9":
			letras = letras + "NOVECIENTOS ";
			break;

		default:
			letras = "";
			break;
		}

		switch (numero.substring(2, 3)) {

		case "1":
			letras = letras + "DIEZ ";
			break;

		case "2":
			letras = letras + "VEINTE ";
			break;

		case "3":
			letras = letras + "TREINTA ";
			break;

		case "4":
			letras = letras + "CUARENTA ";
			break;

		case "5":
			letras = letras + "CINCUENTA ";
			break;

		case "6":
			letras = letras + "SESENTA ";
			break;

		case "7":
			letras = letras + "SETENTA ";
			break;

		case "8":
			letras = letras + "OCHENTA ";
			break;

		case "9":
			letras = letras + "NOVENTA ";
			break;
			
		case "":
			letras = "";
			break;

		default:
			letras = "";
			break;
		}

		switch (numero.substring(3, 4)) {

		case "1":
			letras = letras + "UNO";
			break;

		case "2":
			letras = letras + "DOS";
			break;

		case "3":
			letras = letras + "TRES";
			break;

		case "4":
			letras = letras + "CUATRO";
			break;

		case "5":
			letras = letras + "CINCO";
			break;

		case "6":
			letras = letras + "SEIS";
			break;

		case "7":
			letras = letras + "SIETE";
			break;

		case "8":
			letras = letras + "OCHO";
			break;

		case "9":
			letras = letras + "NUEVE";
			break;

		case "":
			letras = letras + "";
			break;

		default:
			letras = "";
			break;
		}

		return letras;

	}

}
