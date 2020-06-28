package model;
public class model_circulo implements interface_factory{
    @Override
    public String area(double dato1, double dato2, double dato3) {
        double resultado = 3.1416 * (dato1 * dato1);
        return "El area de tu circulo es: " + resultado;
    }

    @Override
    public String perimetro(double dato1, double dato2, double dato3) {
        double resultado = 3.1416 * dato1 * 2;
        return "El perimetro de tu circulo es: " + resultado;
    }

    @Override
    public String descripcion() {
        return "Esto es un circulo";
    }
}
