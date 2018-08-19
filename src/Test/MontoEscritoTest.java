package Test;

import static org.junit.jupiter.api.Assertions.*;
import MontoEscrito.MontoEscrito;
import org.junit.jupiter.api.Test;

class MontoEscritoTest {

	@Test
	void testCuatroDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "NUEVE MIL";
		String letrasobtenidas = ValorLetras.Letras("9876");
		System.out.print(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}
	
	@Test
	void testTresDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "NOVECIENTOS";
		String letrasobtenidas = ValorLetras.Letras("900");
		System.out.print(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}

	@Test
	void testDosDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "NOVENTA";
		String letrasobtenidas = ValorLetras.Letras("90");
		System.out.print(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}
	
	@Test
	void testUnDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "NUEVE";
		String letrasobtenidas = ValorLetras.Letras("9");
		System.out.print(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}
}
