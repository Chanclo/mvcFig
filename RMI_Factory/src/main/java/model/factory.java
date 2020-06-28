package model;

public class factory {
    String area, perimetro;
    String descripcion;

    public void setArea(String area) {
        this.area = area;
    }

    public void setPerimetro(String perimetro) {
        this.perimetro = perimetro;
    }
   
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getArea() {
        return area;
    }

    public String getPerimetro() {
        return perimetro;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    

    public factory devolver(int fig, int met, double dato1, double dato2, double dato3) {
        factory datos = new factory();

        switch (fig) {
            case 1: //Circulo
                model_circulo circulo = new model_circulo();
                switch (met) {
                    case 1://Area
                        datos.setArea(circulo.area(dato1, dato2, dato3));
                        break;
                    case 2://Perimetro
                        datos.setPerimetro(circulo.perimetro(dato1, dato2, dato3));
                        break;
                    case 3://Descripcion
                        datos.setDescripcion(circulo.descripcion());
                        break;
                    default://Todo
                        datos.setArea(circulo.area(dato1, dato2, dato3));
                        datos.setPerimetro(circulo.perimetro(dato1, dato2, dato3));
                        datos.setDescripcion(circulo.descripcion());
                        break;
                }
                break;

            case 2: //Cuadrado
                model_cuadrado cuadrado = new model_cuadrado();
                switch (met) {
                    case 1://Area
                        datos.setArea(cuadrado.area(dato1, dato2, dato3));
                        break;
                    case 2://Perimetro
                        datos.setPerimetro(cuadrado.perimetro(dato1, dato2, dato3));
                        break;
                    case 3://Descripcion
                        datos.setDescripcion(cuadrado.descripcion());
                        break;
                    default://Todo
                        datos.setArea(cuadrado.area(dato1, dato2, dato3));
                        datos.setPerimetro(cuadrado.perimetro(dato1, dato2, dato3));
                        datos.setDescripcion(cuadrado.descripcion());
                        break;
                }
                break;

            case 3: //Triangulo
                model_triangulo triangulo = new model_triangulo();
                switch (met) {
                    case 1://Area
                        datos.setArea(triangulo.area(dato1, dato2, dato3));
                        break;
                    case 2://Perimetro
                        datos.setPerimetro(triangulo.perimetro(dato1, dato2, dato3));
                        break;
                    case 3://Descripcion
                        datos.setDescripcion(triangulo.descripcion());
                        break;
                    default://Todo
                        datos.setArea(triangulo.area(dato1, dato2, dato3));
                        datos.setPerimetro(triangulo.perimetro(dato1, dato2, dato3));
                        datos.setDescripcion(triangulo.descripcion());
                        break;
                }
                break;

            default: //Ninguno

                break;
        }

        return datos;
    }
}
