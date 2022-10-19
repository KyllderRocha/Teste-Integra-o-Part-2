
package View;

import Classes.Administradores;
import Controller.ControllerAdmin;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**Classe para a criação da tela que visualizar Administradores.
 * @author Kyllder
 * @author Thiago
 * @author Pedro
 * @version 1.0
 */
public class TelaVisualizarAdmin extends javax.swing.JFrame {
    /**Um objeto do Controller de Administrador.
     *@see ControllerAdmin*/
        private ControllerAdmin ca =new ControllerAdmin();
        /**Um ArrayList que armazenas todos os Administradores*/
        private ArrayList<Administradores> array= new ArrayList();
        /**Um objeto do default table model, relacionado a tabela.
     *@see DefaultTableModel*/
         private DefaultTableModel dtm;
    /**
     * Construtor da classe, onde são inicializados todos os componentes da tela
     * e onde são adicionados os dados da tabela 
     */
    public TelaVisualizarAdmin() {
        initComponents();
        
        dtm = (DefaultTableModel)Tabela.getModel();
        array=ca.Listar();
        if (!array.isEmpty()) {           
            for (Administradores aux: array) {
            String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),aux.getUser(),aux.getSenha(),aux.getTipo()};
            dtm.addRow(a);
        }
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Telefone", "Endereço", "User", "Senha", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TabelaMouseMoved(evt);
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabela);

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N
        jLabel2.setText("Procurar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     *  Método Não faz nada foi, gerado sem querer
     * 
     */
    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked

    }//GEN-LAST:event_TabelaMouseClicked
/**
     *  Método Não faz nada foi, gerado sem querer
     * 
     */
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed
/**
     * Método que atualiza a tabela de Administradores a cada vez que o campo de texto é alterado
     * @param evt KeyEvent, Ação do Campo de texto ao ser digitado ou apagado algo
     */
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
      dtm =  (DefaultTableModel)Tabela.getModel();
        if (!txtBuscar.getText().equals("")) {
            dtm.setNumRows(0);
            ArrayList<Administradores> array1=ca.Buscar(txtBuscar.getText());
            for (Administradores aux : array1) {
                String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),aux.getTipo()};
                dtm.addRow(a);
            }

        }else{
            dtm.setNumRows(0);
            for (Administradores aux : array) {
                String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),aux.getTipo()};
                dtm.addRow(a);
            }
        }
    }//GEN-LAST:event_txtBuscarKeyReleased
/**
     * Método que cria o comentario dos valores da tabela de Administradores
     * @param evt MouseEvent, ação de mover o mouse pela tabela
     */
    private void TabelaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseMoved
        Point p = evt.getPoint(); 
        int row = Tabela.rowAtPoint(p);
        int column = Tabela.columnAtPoint(p);
        Tabela.setToolTipText(String.valueOf(Tabela.getValueAt(row,column)));
    }//GEN-LAST:event_TabelaMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}