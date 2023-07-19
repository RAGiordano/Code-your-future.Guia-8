/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Entities.TemperatureConverter;

/**
 *
 * @author Usuario
 */
public class TemperatureConverterService {
    private TemperatureConverter tConvert = new TemperatureConverter();
    
    public double convert (String tipo1, String tipo2, double valor){
        double result = Double.NaN;
        if (tipo1.toLowerCase().equals("celsius")){
            if(tipo2.toLowerCase().equals("fahrenheit")){ //celsius a fahrenheit
                result = valor * 9 / 5 + 32;
            } else if (tipo2.toLowerCase().equals("kelvin")){ //celsius a kelvin
                result = valor + 273.15;
            }
        } else if (tipo1.toLowerCase().equals("fahrenheit")){
            if(tipo2.toLowerCase().equals("celsius")){ //fahrenheit a celsius
                result = (valor - 32) * 5 / 9;
            } else if (tipo2.toLowerCase().equals("kelvin")){ //fahrenheit a kelvin
                result = (valor + 459.67) * 5/9;
            }
        } else if (tipo1.toLowerCase().equals("kelvin")){
            if(tipo2.toLowerCase().equals("celsius")){ //kelvin a celsius
                result = valor -273.15;
            } else if (tipo2.toLowerCase().equals("fahrenheit")){ //kelvin a fahrenheit
                result = valor * 9 / 5 - 459.67;
            }
        }
        return result;
    }
}
