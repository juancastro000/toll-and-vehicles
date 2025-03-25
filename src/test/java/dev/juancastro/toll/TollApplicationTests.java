package dev.juancastro.toll;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TollApplicationTests {

	@Test
    void main_execution_shouldPrintCorrectReport() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        try {
            TollApplication.main(new String[0]);
            String output = bos.toString();
            assertThat(output, stringContainsInOrder(
                "=== REPORTE DE PEAJE ===",
                "Estación: PEAJE VIVA",
                "Ubicación: Medellín",
                "Vehículos procesados:",
                "ABC123 - $100",
                "XYZ789 - $50",
                "TRK456 - $150",
                "DEF456 - $100",
                "CAM123 - $250",
                "Total recolectado: $650"
            ));
        } finally {
            System.setOut(originalOut);
        }
    }

}
