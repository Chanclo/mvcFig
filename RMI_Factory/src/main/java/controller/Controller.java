package controller;

import java.awt.event.*;
import view.circulo;
import view.cuadrado;
import view.principal;
import view.triangulo;

public class Controller implements ActionListener {

    //Principal
    private principal vista_form;
    private controller_principal ctrlPrincipal;
    //Circulo
    private circulo vista_circulo;
    private controller_circulo ctrlCirculo;
    //Cuadrado
    private cuadrado vista_cuadrado;
    private controller_cuadrado ctrlCuadrado;
    //Triangulo
    private triangulo vista_triangulo;
    private controller_triangulo ctrlTriangulo;

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        principal p = new principal();
        circulo ci = new circulo();
        cuadrado cu = new cuadrado();
        triangulo t = new triangulo();
        Controller ctrl = new Controller(p, ci, cu, t);

        p.setTitle("Calculadora de figuras");
        p.setLocationRelativeTo(null);
        p.setVisible(true);
    }

    public Controller(principal vista_form, circulo vista_circulo, cuadrado vista_cuadrado, triangulo vista_triangulo) {
        //Principal
        ctrlPrincipal = new controller_principal();
        this.vista_form = vista_form;
        this.vista_form.btn_Circulo.addActionListener(this);
        this.vista_form.btn_Cuadrado.addActionListener(this);
        this.vista_form.btn_Triangulo.addActionListener(this);
        //Circulo
        ctrlCirculo = new controller_circulo();
        this.vista_circulo = vista_circulo;
        this.vista_circulo.btn_Obtener.addActionListener(this);
        this.vista_circulo.btn_Cerrar.addActionListener(this);
        //Cuadrado
        ctrlCuadrado = new controller_cuadrado();
        this.vista_cuadrado = vista_cuadrado;
        this.vista_cuadrado.btn_Obtener.addActionListener(this);
        this.vista_cuadrado.btn_Cerrar.addActionListener(this);
        //Triangulo
        ctrlTriangulo = new controller_triangulo();
        this.vista_triangulo = vista_triangulo;
        this.vista_triangulo.btn_Obtener.addActionListener(this);
        this.vista_triangulo.btn_Cerrar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String resultado;
        if (e.getSource() == vista_form.btn_Circulo) {
            abrirCirculo();
        }

        if (e.getSource() == vista_form.btn_Cuadrado) {
            abrirCuadrado();
        }

        if (e.getSource() == vista_form.btn_Triangulo) {
            abrirTriangulo();
        }

        if (e.getSource() == vista_circulo.btn_Obtener) {
            resultado = ctrlCirculo.Obtener(vista_circulo.campo_1.getText(), vista_circulo.cb_funciones.getSelectedIndex());
            vista_circulo.txt_resultado.setText(resultado);
        }

        if (e.getSource() == vista_circulo.btn_Cerrar) {
            vista_circulo.dispose();
        }

        if (e.getSource() == vista_cuadrado.btn_Obtener) {
            resultado = ctrlCuadrado.Obtener(vista_cuadrado.campo_1.getText(), vista_cuadrado.campo_2.getText(), vista_cuadrado.cb_funciones.getSelectedIndex());
            vista_cuadrado.txt_resultado.setText(resultado);
        }

        if (e.getSource() == vista_cuadrado.btn_Cerrar) {
            vista_cuadrado.dispose();
        }

        if (e.getSource() == vista_triangulo.btn_Obtener) {
            resultado = ctrlTriangulo.Obtener(vista_triangulo.campo_1.getText(), vista_triangulo.campo_2.getText(), vista_triangulo.campo_3.getText(), vista_triangulo.cb_funciones.getSelectedIndex());
            vista_triangulo.txt_resultado.setText(resultado);
        }

        if (e.getSource() == vista_triangulo.btn_Cerrar) {
            vista_triangulo.dispose();
        } 
    }

    private void abrirCirculo() {
        limpiar("circulo");
        vista_circulo = new circulo();
        vista_circulo.setLocationRelativeTo(null);
        vista_circulo.setVisible(true);
    }

    private void abrirCuadrado() {
        limpiar("cuadrado");
        vista_cuadrado = new cuadrado();
        vista_cuadrado.setLocationRelativeTo(null);
        vista_cuadrado.setVisible(true);
    }

    private void abrirTriangulo() {
        limpiar("triangulo");
        vista_triangulo = new triangulo();
        vista_triangulo.setLocationRelativeTo(null);
        vista_triangulo.setVisible(true);
    }

    private void limpiar(String figura){
        switch(figura){
            case "circulo":
                vista_circulo.txt_resultado.setText("");
                vista_circulo.campo_1.setText("");
                break;
                
            case "cuadrado":
                vista_cuadrado.txt_resultado.setText("");
                vista_cuadrado.campo_1.setText("");
                vista_cuadrado.campo_2.setText("");
                break;
                
            case "triangulo":
                vista_triangulo.txt_resultado.setText("");
                vista_triangulo.campo_1.setText("");
                vista_triangulo.campo_2.setText("");
                vista_triangulo.campo_3.setText("");
                break;
        }
    }
}
