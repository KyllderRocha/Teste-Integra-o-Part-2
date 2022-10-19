/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerUsuario;
import Modelo.Usuarios;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**Classe para a criação da tela que mostra os os usuarios devedores.
 * @author Kyllder
 * @author Thiago
 * @author Pedro
 * @version 1.0
 */
public class TelaDevedores extends javax.swing.JFrame {
    /**Um objeto do Controller de Usuario.
     *@see ControllerUsuario*/
    private ControllerUsuario cobre = new ControllerUsuario();
     /**Um ArrayList que armazenas todos os Usuarios*/
    private ArrayList<Usuarios> array =null;
    /**Um objeto do default table model, relacionado a tabela.
     *@see DefaultTableModel*/
    private DefaultTableModel dtm =null;
    /**
     * Construtor da classe, onde são inicializados todos os componentes da tela
     * e onde são adicionados os dados da tabela 
     */
    public TelaDevedores() {
        array=cobre.Listar();
        initComponents();
        DecimalFormat df = new DecimalFormat("0.00");
        dtm = (DefaultTableModel)Tabela.getModel();
        array=cobre.Listar();
        if (!array.isEmpty()) {           
            for (Usuarios aux: array) {
                if (aux.getDivida()>0) {
                    String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),"R$ "+df.format(aux.getDivida())};
                    dtm.addRow(a);
                }
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

        Pagar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Pagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/money_delete.png"))); // NOI18N
        Pagar.setText("Pagar");
        Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarActionPerformed(evt);
            }
        });

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

        Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/magnifier.png"))); // NOI18N
        jLabel1.setText("Procurar");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "RG", "Telefone", "Endereço", "Divida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pagar)
                    .addComponent(Cancelar)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     * Método que paga a divida de um usuario.
     * @param evt ActionEvent, Ação do botão sendo clicado
     */
    private void PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarActionPerformed
        if (Tabela.getSelectedRow()>=0) {
            String cpf = (String) Tabela.getValueAt(Tabela.getSelectedRow(),1);
            for (Usuarios aux : array) {
                if(aux.getCPF().equals(cpf)){
                    aux.setDivida(0);
                    cobre.Editar(aux,aux.getCPF());
                    array.remove(aux);
                    dtm.removeRow(Tabela.getSelectedRow());
                    break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null,"Selecione um Usuario","Aviso",JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_PagarActionPerformed
/**
     *  Método Não faz nada foi, gerado sem querer
     * 
     */
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed
/**
     * Método que atualiza a tabela de Usuarios devedores a cada vez que o campo de texto é alterado
     * @param evt KeyEvent, Ação do Campo de texto ao ser digitado ou apagado algo
     */
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        dtm =  (DefaultTableModel)Tabela.getModel();
        if (!txtBuscar.getText().equals("")) {
            dtm.setNumRows(0);
            ArrayList<Usuarios> array1=cobre.Buscar(txtBuscar.getText());
            for (Usuarios aux : array1) {
                if (aux.getDivida()>0) {
                String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),""+aux.getDivida()};
                dtm.addRow(a);
            }
            }

        }else{
            dtm.setNumRows(0);
            for (Usuarios aux : array) {
                String a[]={aux.getNome(),aux.getCPF(),aux.getRG(),aux.getTelefone(),aux.getEndereco(),""+aux.getDivida()};
                dtm.addRow(a);
            }
        }
    }//GEN-LAST:event_txtBuscarKeyReleased
/**
     * Método que cancela a operação e fecha a fecha a tela 
     * @param evt ActionEvent, Ação do botão sendo clicado
     */

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        dispose();
    }//GEN-LAST:event_CancelarActionPerformed
/**
     *  Método Não faz nada foi, gerado sem querer
     * 
     */
    private void TabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaMouseClicked

    }//GEN-LAST:event_TabelaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancelar;
    private javax.swing.JButton Pagar;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}