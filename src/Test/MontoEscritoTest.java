package Test;

import static org.junit.jupiter.api.Assertions.*;
import MontoEscrito.MontoEscrito;
import org.junit.jupiter.api.Test;

class MontoEscritoTest {

	@Test
	void testCuatroDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "NUEVE MIL OCHOCIENTOS SETENTA SEIS";
		String letrasobtenidas = ValorLetras.Letras("9876");
		System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);
		

	}
	
	@Test
	void testTresDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "CIEN";
		String letrasobtenidas = ValorLetras.Letras("100");
		System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}

	@Test
	void testDosDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "NOVENTA NUEVE";
		String letrasobtenidas = ValorLetras.Letras("99");
		System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}
	
	@Test
	void testUnDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "NUEVE";
		String letrasobtenidas = ValorLetras.Letras("9");
		System.out.println(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}
}
