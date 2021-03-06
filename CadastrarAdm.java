
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NEW COLOR ®
 */
public class CadastrarAdm extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarAdm
     */
    public CadastrarAdm() {
        super ("Adm");
        initComponents();
        setLocationRelativeTo(null);
        
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroAdmPanel = new javax.swing.JPanel();
        nomeTextField = new javax.swing.JTextField();
        senhaTextField = new javax.swing.JTextField();
        cadastrarButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        cadastroAdmPanel.setBackground(new java.awt.Color(204, 255, 255));
        cadastroAdmPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastrar Administradores ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("DialogInput", 1, 50))); // NOI18N

        nomeTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite seu nome:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20))); // NOI18N
        nomeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTextFieldActionPerformed(evt);
            }
        });

        senhaTextField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite sua senha:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 20))); // NOI18N

        cadastrarButton.setText("Cadastrar");
        cadastrarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cadastrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarButtonActionPerformed(evt);
            }
        });

        voltarButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mathe\\Desktop\\@@PROJETO DE MODELAGEM - A3@@\\ImagensProjetos\\icone voltar.png")); // NOI18N
        voltarButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        voltarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadastroAdmPanelLayout = new javax.swing.GroupLayout(cadastroAdmPanel);
        cadastroAdmPanel.setLayout(cadastroAdmPanelLayout);
        cadastroAdmPanelLayout.setHorizontalGroup(
            cadastroAdmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroAdmPanelLayout.createSequentialGroup()
                .addGroup(cadastroAdmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadastroAdmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(cadastroAdmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadastroAdmPanelLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(voltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(cadastroAdmPanelLayout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(cadastroAdmPanelLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(287, Short.MAX_VALUE))
        );
        cadastroAdmPanelLayout.setVerticalGroup(
            cadastroAdmPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadastroAdmPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cadastrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(voltarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastroAdmPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cadastroAdmPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTextFieldActionPerformed

    private void voltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
       new DashBoardTelaAdm().setVisible(true);
    }//GEN-LAST:event_voltarButtonActionPerformed

    private void cadastrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarButtonActionPerformed
        // TODO add your handling code here:
        try {
            // 1º pegar os dados que foram inseridos nos campos;
            String nome = nomeTextField.getText();
            String senha = senhaTextField.getText();
            // Validação
            if (nome.length() == 0 || senha.length() == 0) {
                JOptionPane.showMessageDialog(this, "Preencha o nome e a senha");
                nomeTextField.setBackground(Color.red);
                senhaTextField.setBackground(Color.red);
                return;
            }
            // 2º Criar um objeto do tipo Usuario;
            Administrador administrador = new Administrador(nome,senha);
            
            
            //3º criar um objeto do tipo DAO;
            AdministradorDAO uDAO = new AdministradorDAO();
            int escolha = JOptionPane.showConfirmDialog(this, "Confirma o cadastro desse administrador?");
            if (escolha == JOptionPane.YES_OPTION) {
                uDAO.inserirAdministrador(administrador);
                JOptionPane.showMessageDialog(this, "Administrador cadastrado com sucesso!");
                // Limpar os campos de texto 
              
                // atualizar a lista de cursos da comboBox
           
                
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falha tecnica tente novamente mais tarde! ");
            ex.printStackTrace();
        }


    }//GEN-LAST:event_cadastrarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrarButton;
    private javax.swing.JPanel cadastroAdmPanel;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JTextField senhaTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables



   
}
