package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }



    public String toString()
    {
        return this.getValue() + " F";
    }

    @Override
    public Temperature toCelsius() {
        float temp = (( this.getValue() - 32 ) * 5 ) / 9;
        return new Celsius( temp );
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

}

