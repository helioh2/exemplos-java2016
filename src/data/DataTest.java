package data;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {

	@Test
	public void testData() {
		
		Data dataHoje = new Data(16, 8, 2016);
		Data nMateus = new Data(11, 4, 1994);
		Data nCassiele = new Data(9,9,1996);
		
		//;dataHoje.getDataFormatada();  // --> "16/08/2016"
		assertEquals("16/08/2016", dataHoje.getDataFormatada());
		assertEquals("11/04/1994", nMateus.getDataFormatada());
		assertEquals("09/09/1996", nCassiele.getDataFormatada());
		
	}

}
