package controller;

import model.factory;

public class controller_cuadrado {
    factory fabrica;
    
    public String Obtener(String campo1, String campo2, int metodo) {
        fabrica = new factory();
        fabrica = fabrica.devolver(2, metodo, Double.parseDouble(campo1), Double.parseDouble(campo2), 0); //Figura, Metodo, Campo 1, Campo 2, Campo 3
        switch (metodo) {
            case 1:
                return fabrica.getArea();
            case 2:
                return fabrica.getPerimetro();
            case 3:
                return fabrica.getDescripcion();
            default:
                return fabrica.getArea() + "\n" + fabrica.getPerimetro() + "\n" + fabrica.getDescripcion();
        }
    }
    
}
