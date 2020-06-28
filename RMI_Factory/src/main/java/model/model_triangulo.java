package model;

public class model_triangulo implements interface_factory{
    @Override
    public String area(double dato1, double dato2, double dato3){
        double resultado = 0;
        resultado = (dato1 * dato2)/2;
        return "El area de tu triangulo es: " + resultado;
    }

    @Override
    public String perimetro(double dato1, double dato2, double dato3) {
        double resultado = 0;
        if(equals(dato3)){
            resultado = dato1 * 3;
        } else {
            resultado = dato1 + dato2 + dato3;
        }
        
        return "El perimetro de tu traingulo es: " + resultado; 
    }

    @Override
    public String descripcion() {
        return "Esto es un triangulo";
    }
}
