public class Temperature {

double fahrenheit;



//constructor
public Temperature(double fahrenheit) {
    this.fahrenheit = fahrenheit;
}

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }
    public double celsius (){
    double celsius= (5.0/9.0)*(fahrenheit - 32 );
        System.out.print("Your value in Celsius is: ");
        return celsius;
    }

    public double kelvin() {
    double kelvin = ((5.0/9.0)*(fahrenheit-32))+273;
    System.out.print("Your value in Kelvin is: ");
    return kelvin;

    }


}

