/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CartaoController;
import Controller.InterfaceController;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import Model.BandeiraCartao;
import Model.Cartao;
import Model.Livro;
import Model.TipoVendaCartao;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author priscylla
 */
public class MostrarCartao extends javax.swing.JFrame {

    /**
     * Creates new form MostrarCartao
     */
    
    private CartaoController cc;
    private double valorCompra;
    private String cpf;
  
   
    private ArrayList<Livro> lista;
    
    public MostrarCartao() throws Exception {
        initComponents();
        valorCompra = 0;
        lista = new ArrayList<Livro>();
        cc = new CartaoController();
        cpf = "";
       
        
        ano.removeAllItems();
        dia.removeAllItems();
        mes.removeAllItems();
       
        adicionaBandeiras();
        adicionaDias();
        adicionaMeses();
        adicionaAnos();
        
        
        
    }
    
    
   
    
    
    
    public void adicionaBandeiras(){
    
        bandeiras.addItem("Visa");
        bandeiras.addItem("MasterCard");
        bandeiras.addItem("Elo");
        bandeiras.addItem("American Express");
    
    }
    
    public void trocaInformacao(ArrayList<Livro> array, String cpf1, double valorC) throws Exception {
        lista = array;
        cpf = cpf1;
        valorCompra = valorC;
        
        
        
    }
    public void setInter(InterfaceController f){
        cc.setInter(f);
    }
    
    
    
    public void adicionaDias(){
    
        for (int i = 1; i < 32; i++) {
            dia.addItem(Integer.toString(i));
        }
    
    
    }
    
    public void adicionaMeses(){
        
      for (int i = 1; i < 13; i++) {
            mes.addItem(Integer.toString(i));
        }
    
    }
    
    public void adicionaAnos(){
        
      for (int i = 2018; i < 2029; i++) {
            ano.addItem(Integer.toString(i));
        }
    
    }
    
    public BandeiraCartao escolheBandeira(int i){
    
        if(i == 0){ return BandeiraCartao.VISA;}
        if(i == 1){ return BandeiraCartao.MASTERCARD;}
        if(i == 2){ return BandeiraCartao.ELO;}
        if(i == 3){ return BandeiraCartao.AMERICANEXPRESS;}
        
    
    
    
    return null;
    }
    
    public TipoVendaCartao escolherTipoV(){
    
        if(debito.isSelected()){return TipoVendaCartao.DÉBITO;}
        if(credito.isSelected()){return TipoVendaCartao.CRÉDITO;}
        
       
    
    return null;
    
    }
    
   
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotoes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        dia = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mes = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        ano = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        debito = new javax.swing.JRadioButton();
        credito = new javax.swing.JRadioButton();
        bandeiras = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Livraria Cultura - Cartão");
        setResizable(false);

        jLabel3.setText("Número");

        jLabel4.setText("Nome");

        jLabel5.setText("Data Vencimento");

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Dia");

        jLabel7.setText("Mês");

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("Ano");

        ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        grupoBotoes.add(debito);
        debito.setText("Débito");
        debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                debitoActionPerformed(evt);
            }
        });

        grupoBotoes.add(credito);
        credito.setText("Crédito");

        jLabel9.setText("Bandeira");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome)
                                    .addComponent(numero)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(8, 8, 8)
                                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(bandeiras, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(debito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(credito)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bandeiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(debito)
                    .addComponent(credito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/01(1).png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        jLabel2.setText("Cartão");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            try{
                
                if (!(credito.isSelected() || debito.isSelected())){
                    throw new Exception ("Marcar Débito ou Crédito");
                }
           
                Date data = new Date ( Integer.parseInt(ano.getSelectedItem().toString())-1900,
                       mes.getSelectedIndex(),
                        dia.getSelectedIndex()+1);
              
        //Date data = new Date();
        
             
        BandeiraCartao band = escolheBandeira(bandeiras.getSelectedIndex());
        TipoVendaCartao tvc = escolherTipoV();
        
      
       
        Long number = Long.parseLong(numero.getText());
        Cartao card = new Cartao(number, nome.getText(), data, band, 
                tvc);
         
        JOptionPane.showMessageDialog(null, "Cartão Processado.");
        
        setVisible(Boolean.FALSE);
        InterVendaCartao vc = new InterVendaCartao();
        //aqui
        vc.setCartaoCadastrado(true);
        vc.setInter(cc.getInter());
        vc.setCartao(card);
        vc.trocaInformacao(lista, cpf, valorCompra);
        
        
        vc.setVisible(Boolean.TRUE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Erro: "+ e.getMessage());
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void debitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_debitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_debitoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MostrarCartao().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(MostrarCartao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ano;
    private javax.swing.JComboBox<String> bandeiras;
    private javax.swing.JRadioButton credito;
    private javax.swing.JRadioButton debito;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.ButtonGroup grupoBotoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    // End of variables declaration//GEN-END:variables
}