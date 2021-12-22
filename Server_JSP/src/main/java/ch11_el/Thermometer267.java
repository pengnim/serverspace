package ch11_el;

import java.util.HashMap;
import java.util.Map;

public class Thermometer267 {
	private Map<String, Double> locationCelsius = new HashMap<>();
	
	
	//Instance Method() 사용하기(EL)
	public void setCelsius(String location, double value) {
		locationCelsius.put(location, value);
	}
	public Double getCelsius(String location) {
		return locationCelsius.get(location);
	}
	public Double getFahrenheit(String location) {
		Double celsius = getCelsius(location);
		if(celsius == null)return null;
		return celsius.doubleValue()*1.8+32.0;
	}
	public String getInfo() {
		return "온도변환 1.1";
	}
}
