package com.app.junitDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ParameterizedDemoCSVsource {
	
	// CSV => storing data in form of row and colums-> like an excel
	
	
		@ParameterizedTest(name = "CSV source {arguments}")
		@CsvSource({
				"Audi ,  25",  // row and column
				"BMW ,   24",
				"Volvo , 45",
				"Merc ,  50"		
		})
		
		public void datafrom_CSVsource(String car, String quantity)
		{
			System.out.println(car+" : "+quantity);
		}

	}


