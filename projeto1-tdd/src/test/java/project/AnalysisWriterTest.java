package test.java.project;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import main.java.project.AnalysisWriter;
import main.java.project.exception.EscritaNaoPermitidaException;


public class AnalysisWriterTest {

	@Test
	 public void testfileNameFail() throws EscritaNaoPermitidaException{
		String[] mockParse = new String[] {";1155;574;",";5478;1478;"};
		assertThrows(EscritaNaoPermitidaException.class, () -> {new AnalysisWriter(mockParse, 1, "failTest", "failTest.out");});
    }

	@Test
	 public void testfileNameSuccess() throws EscritaNaoPermitidaException, IOException{
		String[] mockParse = new String[] {";1155;574;",";5478;1478;", ";5478;1478;"};
		AnalysisWriter writerMock = new AnalysisWriter(mockParse, 1, "/home/rafaella/Documentos", "failTest.out");
		assertEquals(writerMock.isWriteSuccess(), true);
    }
}
