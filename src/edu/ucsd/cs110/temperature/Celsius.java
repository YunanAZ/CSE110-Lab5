package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return this;
    }

    @Override
    public Temperature toFahrenheit() {
        //(x°C × 9/5) + 32 = 32°F
        value = (value * 9/5) + 32;
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return value + " C";
    }
}