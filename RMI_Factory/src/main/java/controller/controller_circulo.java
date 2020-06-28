package controller;

import model.factory;

public class controller_circulo {

    factory fabrica;

    public String Obtener(String campo1, int metodo) {
        fabrica = new factory();
        fabrica = fabrica.devolver(1, metodo, Double.parseDouble(campo1), 0, 0); //Figura, Metodo, Campo 1, Campo 2, Campo 3
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
