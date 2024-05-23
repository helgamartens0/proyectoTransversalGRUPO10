/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

/**
 *
 * @author busto
 */
public class FormularioInscripcionesView extends javax.swing.JInternalFrame {

    /**
     * Creates new form InscripcionesView
     */
    public FormularioInscripcionesView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlFormulario = new javax.swing.JLabel();
        jlAlumno = new javax.swing.JLabel();
        lbListadoMaterias = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jrbMInscriptas = new javax.swing.JRadioButton();
        jrbNoInscriptas = new javax.swing.JRadioButton();

        setTitle("Formulario de Inscripcion");

        jlFormulario.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        jlFormulario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlFormulario.setText("Formulario de Inscripcion");

        jlAlumno.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jlAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAlumno.setText("Seleccione el Alumno");

        lbListadoMaterias.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lbListadoMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbListadoMaterias.setText("Listado de Materias");

        jcbAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jbInscribir.setText("Inscribir");

        jbBorrar.setText("Borrar Inscripcion");

        jbSalir.setText("Salir");

        jrbMInscriptas.setText("Materias Inscriptas");

        jrbNoInscriptas.setText("Materias NO Inscriptas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jlAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbListadoMaterias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jrbMInscriptas)
                        .addGap(70, 70, 70)
                        .addComponent(jrbNoInscriptas)
                        .addGap(69, 69, 69)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbListadoMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMInscriptas)
                    .addComponent(jrbNoInscriptas))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbAlumno;
    private javax.swing.JLabel jlAlumno;
    private javax.swing.JLabel jlFormulario;
    private javax.swing.JRadioButton jrbMInscriptas;
    private javax.swing.JRadioButton jrbNoInscriptas;
    private javax.swing.JTable jtTabla;
    private javax.swing.JLabel lbListadoMaterias;
    // End of variables declaration//GEN-END:variables
}
