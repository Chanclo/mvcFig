package model;

public class model_cuadrado implements interface_factory{
    @Override
    public String area(double dato1, double dato2, double dato3) {
        double resultado = 0;
        if(dato1 != dato2){
            resultado = dato1 * dato2;
            return "El area de tu rectangulo es: " + resultado;
        }else{
            resultado = dato1 * dato1;
            return "El area de tu cuadrado es: " + resultado;
        }
    }

    @Override
    public String perimetro(double dato1, double dato2, double dato3) {
        double resultado = 0;
        if(dato1 != dato2){
            resultado = (dato1 * 2) + (dato2 * 2);
            return "El perimetro de tu rectangulo es: " + resultado;
        }else{
            resultado = dato1 * 4;
            return "El perimetro de tu cuadrado es: " + resultado;
        }
    }

    @Override
    public String descripcion() {
        return "Esto es un cuadrilatero";
    }
}
