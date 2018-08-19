package Test;

import static org.junit.jupiter.api.Assertions.*;
import MontoEscrito.MontoEscrito;
import org.junit.jupiter.api.Test;

class MontoEscritoTest {

	@Test
	void testCuatroDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "NUEVE MIL";
		String letrasobtenidas = ValorLetras.Letras("9000");
		System.out.print(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}
	
	@Test
	void testTresDigitos() {
		MontoEscrito ValorLetras = new MontoEscrito();
		String letrasesperadas = "QUINIENTOS";
		String letrasobtenidas = ValorLetras.Letras("0511");
		System.out.print(letrasobtenidas);
		assertEquals(letrasesperadas, letrasobtenidas);

	}

}
