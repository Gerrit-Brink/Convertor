package assess.conv.web;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import assess.conv.util.ConversionUtil;

@RestController
@RequestMapping(path = "/conversions")
public class Convertor {
	
	   @RequestMapping(path = "/ktoc", method = RequestMethod.POST)
	   @ResponseBody
	   public String KelvinToCelcius(@RequestParam String kelvin){ 
	      return ConversionUtil.KelvinToCelcius(new BigDecimal(kelvin)).toString();
	   }
	   
	   @RequestMapping(path = "/ctok", method = RequestMethod.POST)
	   @ResponseBody
	   public String CelciusToKelvin(@RequestParam String celcius){ 
		   return ConversionUtil.CelciusToKelvin(new BigDecimal(celcius)).toString();
	   }
	   
	   @RequestMapping(path = "/mtok", method = RequestMethod.POST)
	   @ResponseBody
	   public String MilesToKilometers(@RequestParam String miles){ 
		   return ConversionUtil.MilesToKilometers(new BigDecimal(miles)).toString();
	   }
	   
	   @RequestMapping(path = "/ktom", method = RequestMethod.POST)
	   @ResponseBody
	   public String KilometersToMiles(@RequestParam String kilometers){ 
		   return ConversionUtil.KilometersToMiles(new BigDecimal(kilometers)).toString();
	   }
}