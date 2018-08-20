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

		case "0":
			letras = letras + "";
			break;

		default:
			letras = "";
			break;
		}

		switch (numero.substring(1, 2)) {

		case "1":
			if (numero.substring(2, 3).equals("0") & numero.substring(3, 4).equals("0"))
				letras = letras + "CIEN";
			else
				letras = letras + "CIENTO ";
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

		case "0":
			letras = letras + "";
			break;

		default:
			letras = letras + "";
			break;
		}

		switch (numero.substring(2, 3)) {

		case "1":
			if (numero.substring(3, 4).equals("0"))
				letras = letras + "DIEZ";
			else {
				if (numero.substring(3, 4).equals("1"))
					letras = letras + "ONCE";
				else if (numero.substring(3, 4).equals("2"))
					letras = letras + "DOCE";
				else if (numero.substring(3, 4).equals("3"))
					letras = letras + "TRECE";
				else if (numero.substring(3, 4).equals("4"))
					letras = letras + "CATORCE";
				else if (numero.substring(3, 4).equals("5"))
					letras = letras + "QUINCE";
				else
					letras = letras + "DIECI";
			}

			break;

		case "2":
			if (numero.substring(3, 4).equals("0"))
				letras = letras + "VEINTE";
			else
				letras = letras + "VEINTI";
			break;

		case "3":
			if (numero.substring(3, 4).equals("0"))
				letras = letras + "TREINTA";
			else
				letras = letras + "TREINTA Y ";
			break;

		case "4":
			if (numero.substring(3, 4).equals("0"))
				letras = letras + "CUARENTA";
			else
				letras = letras + "CUARENTA Y ";
			break;

		case "5":
			if (numero.substring(3, 4).equals("0"))
				letras = letras + "CINCUENTA";
			else
				letras = letras + "CINCUENTA Y ";
			break;

		case "6":
			if (numero.substring(3, 4).equals("0"))
				letras = letras + "SESENTA";
			else
				letras = letras + "SESENTA Y ";
			break;

		case "7":
			if (numero.substring(3, 4).equals("0"))
				letras = letras + "SETENTA";
			else
				letras = letras + "SETENTA Y ";
			break;

		case "8":
			if (numero.substring(3, 4).equals("0"))
				letras = letras + "OCHENTA";
			else
				letras = letras + "OCHENTA Y ";
			break;

		case "9":
			if (numero.substring(3, 4).equals("0"))
				letras = letras + "NOVENTA";
			else
				letras = letras + "NOVENTA Y ";
			break;

		case "0":
			letras = letras + "";
			break;

		default:
			letras = "";
			break;
		}

		switch (numero.substring(3, 4)) {

		case "1":
			if (!numero.substring(3, 4).equals("1"))
				letras = letras + "UNO";
			break;

		case "2":
			if (!numero.substring(3, 4).equals("2"))
				letras = letras + "DOS";
			break;

		case "3":
			if (!numero.substring(3, 4).equals("3"))
			letras = letras + "TRES";
			break;

		case "4":
			if (!numero.substring(3, 4).equals("4"))
			letras = letras + "CUATRO";
			break;

		case "5":
			if (!numero.substring(3, 4).equals("5"))
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

		case "0":
			letras = letras + "";
			break;

		default:
			letras = "";
			break;
		}

		return letras;

	}

}
