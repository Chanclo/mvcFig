package view;
public class triangulo extends javax.swing.JFrame {
    public triangulo() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cb_funciones.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cb_funciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Selecciona-", "-Area-", "-Perimetro-", "-Descripcion-", "-Todo-" }));

        lbl_funcion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_funcion.setText("¿Que deseas obtener?");

        btn_Obtener.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_Obtener.setText("Obtener");

        campo_1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campo_2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbl_campo1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_campo1.setText("Lado 1:");

        lbl_campo2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_campo2.setText("Lado 2:");

        txt_resultado.setEditable(false);
        txt_resultado.setColumns(20);
        txt_resultado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_resultado.setRows(5);
        jScrollPane1.setViewportView(txt_resultado);

        campo_3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbl_campo3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_campo3.setText("Lado 3:");

        btn_Cerrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btn_Cerrar.setText("Cerrar");

        lbl_campo4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_campo4.setText("*El lado 1 sera tomado como base y el lado 2 como altura");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(btn_Cerrar))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbl_funcion)
                .addGap(9, 9, 9)
                .addComponent(cb_funciones, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(lbl_campo3)
                .addGap(18, 18, 18)
                .addComponent(campo_3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(btn_Obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_campo1)
                    .addComponent(lbl_campo2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_campo4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_Cerrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_funcion))
                    .addComponent(cb_funciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_campo1))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_campo2)
                    .addComponent(campo_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_campo3))
                    .addComponent(campo_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btn_Obtener)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_campo4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JButton btn_Cerrar = new javax.swing.JButton();
    public static final javax.swing.JButton btn_Obtener = new javax.swing.JButton();
    public static final javax.swing.JTextField campo_1 = new javax.swing.JTextField();
    public static final javax.swing.JTextField campo_2 = new javax.swing.JTextField();
    public static final javax.swing.JTextField campo_3 = new javax.swing.JTextField();
    public static final javax.swing.JComboBox<String> cb_funciones = new javax.swing.JComboBox<>();
    public static final javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
    public static final javax.swing.JLabel lbl_campo1 = new javax.swing.JLabel();
    public static final javax.swing.JLabel lbl_campo2 = new javax.swing.JLabel();
    public static final javax.swing.JLabel lbl_campo3 = new javax.swing.JLabel();
    public static final javax.swing.JLabel lbl_campo4 = new javax.swing.JLabel();
    public static final javax.swing.JLabel lbl_funcion = new javax.swing.JLabel();
    public javax.swing.JTextArea txt_resultado;
    // End of variables declaration//GEN-END:variables

}
