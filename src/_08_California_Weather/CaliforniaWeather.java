package _08_California_Weather;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CaliforniaWeather implements ActionListener {
//OBJECTIVE:
//1. Create a program that allows the user to search for the weather
//conditions of a given city in California. Use the example program below
//and the Utilities class inside this project to get the temperature data
//from a day in December 2020.
//Example: User: Encinitas
//       Program: Encinitas is Overcast with a tempeature of 59.01 �F

//Creating stuff
	JFrame frame = new JFrame();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JLabel label = new JLabel("California Weather");
	JButton WeatherSearch = new JButton("Search for Weather conditions");
	JButton WeatherSpecify = new JButton("Specify Weather conditions");
	JButton WeatherMinMax = new JButton("Minimun or Maximum temeratures in area");

	public void Setup() {
//Random stuff
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
//adding stuff
		frame.add(panel1);
		frame.add(panel2);
		panel1.add(label);
		panel2.add(WeatherSearch);
		panel2.add(WeatherSpecify);
		panel2.add(WeatherMinMax);
		frame.pack();
//Action Listeners
		WeatherSearch.addActionListener(this);
		WeatherSpecify.addActionListener(this);
		WeatherMinMax.addActionListener(this);
	
		

//  2. Create a way for the user to specify the weather condition and then
//  list the cities that have those conditions.
//  Example: User: Mostly Cloudy
//           Program: Long Beach, Pomona, Oceanside, ...

//  3. Create a way for the user to enter a minimum and maximum temperature
//  and then list the cities that have temperatures within that range
//  Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
//           Program: Fortana, Glendale, Escondido, Del Mar, ...

	
	}	
// EXTRA:
//  Feel free to add pictures for specific weather conditions or a thermometer
//  for the temperature. Also If you want your program to get the current day's
//  temperature, you can get a free API key at: https://openweathermap.org/api
	HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == WeatherSearch) {
			String Search = JOptionPane.showInputDialog(null, "Please enter the city for information on the conditions of the city");
			String cityName = Utilities.capitalizeWords(Search);
			WeatherData datum = weatherData.get(cityName);
				if (datum == null) {
JOptionPane.showMessageDialog(null, "Unable to find weather data for: " + cityName);
				} else {
JOptionPane.showMessageDialog(null, cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
				}
	
			}

		if (e.getSource() == WeatherSpecify) {
			String Specify = JOptionPane.showInputDialog(null, "Please specify the weather conditions of the city you are look for(Mostly Cloudy, Clear, Overcast, Possible Drizzle ");
ArrayList<String> cities = new ArrayList<String>();			
for (String WeatherCity : weatherData.keySet()) {
	WeatherData WD = weatherData.get(WeatherCity);
String WeatherSummary = WD.weatherSummary;	 
if (WeatherSummary.contains(Specify)) {
	
cities.add(WeatherCity);
}
}
String main = "The cities that have the condition " + Specify + " are: ";
for (int i = 0; i < cities.size(); i++) {
if(i%10==0) {
main+="\n";
}
main+= ", " + cities.get(i);
}
if(cities.size() == 0) {
	JOptionPane.showMessageDialog(null, "Unable to find a city with the condition " + "'" + Specify + "'. Please make sure you typed it in correctly and try again.");
}
else {
JOptionPane.showMessageDialog(null, main);
}

			
			
			
			
		}
		
		if (e.getSource() == WeatherMinMax) {
			String MinMax = JOptionPane.showInputDialog(null,
					"Please enter the minimum and maximum of the city you are looking for like this x, y");
			
			
			
			
			
			
			
			
			
			
		}

	}
}
