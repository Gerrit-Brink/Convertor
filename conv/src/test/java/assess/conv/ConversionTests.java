package assess.conv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import assess.conv.util.ConversionUtil;

@SpringBootTest(classes=ApplicationTests.class)
class ApplicationTests {
	
	@Test
	void KelvinToCelcius(){
		assertEquals(ConversionUtil.KelvinToCelcius(new BigDecimal("1")), new BigDecimal("-272.15"));
	}
	
	@Test
	void CelciusToKelvin(){
		assertEquals(ConversionUtil.CelciusToKelvin(new BigDecimal("1")), new BigDecimal("274.15"));
	}
	
	@Test
	void MilesToKilometers(){
		assertEquals(ConversionUtil.MilesToKilometers(new BigDecimal("1")), new BigDecimal("1.609"));
	}
	
	@Test
	void KilometersToMiles(){
		assertEquals(ConversionUtil.KilometersToMiles(new BigDecimal("1")), new BigDecimal("0.62150"));
	}
}
