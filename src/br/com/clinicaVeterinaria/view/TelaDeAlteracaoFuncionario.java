/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaVeterinaria.view;

import Controle.ControleTeclasPermitidasLetras;
import Controle.ControleTeclasPermitidasNumeros;
import javax.swing.JOptionPane;

/**
 *
 * @author Alessandro
 */
public class TelaDeAlteracaoFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeAlteracaoFuncionario
     */
    public TelaDeAlteracaoFuncionario() {
        initComponents();
        jlCampoObrigatorioTelefone.setVisible(false);
        jlCampoObrigatorioSexo.setVisible(false);
        jlCampoObrigatorioSenha.setVisible(false);
        jlCampoObrigatorioRua.setVisible(false);
        jlCampoObrigatorioNovaSenha.setVisible(false);
        jlCampoObrigatorioNome.setVisible(false);
        jlCampoObrigatorioLogin.setVisible(false);
        jlCampoObrigatorioEstado.setVisible(false);
        jlCampoObrigatorioEmail.setVisible(false);
        jlCampoObrigatorioDataNascimento.setVisible(false);
        jlCampoObrigatorioCidade.setVisible(false);
        jlCampoObrigatorioCPF.setVisible(false);
        jlCampoObrigatorioBairro.setVisible(false);
        jtBairro.setDocument(new ControleTeclasPermitidasLetras(30));
        jtCidade.setDocument(new ControleTeclasPermitidasLetras(30));
        jtCpf.setDocument(new ControleTeclasPermitidasNumeros(11));
        jtDataAno.setDocument(new ControleTeclasPermitidasNumeros(4));
        jtDataMes.setDocument(new ControleTeclasPermitidasNumeros(2));
        jtDataDia.setDocument(new ControleTeclasPermitidasNumeros(2));
        jtEstado.setDocument(new ControleTeclasPermitidasLetras(20));
        jtRua.setDocument(new ControleTeclasPermitidasLetras(20));
        jtSexo.setDocument(new ControleTeclasPermitidasLetras(10));
        jtTelefone.setDocument(new ControleTeclasPermitidasNumeros(10));
        jtNome.setDocument(new ControleTeclasPermitidasLetras(30));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jlRua = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlDataNascimento = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtNome = new javax.swing.JTextField();
        jtRua = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jtDataDia = new javax.swing.JTextField();
        jtDataMes = new javax.swing.JTextField();
        jtDataAno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jlLogin = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jlNovaSenha = new javax.swing.JLabel();
        jtNovaSenha = new javax.swing.JPasswordField();
        jtSenha = new javax.swing.JPasswordField();
        jtLogin = new javax.swing.JPasswordField();
        jbAlterar = new javax.swing.JToggleButton();
        jbCancelar = new javax.swing.JButton();
        jlCidade = new javax.swing.JLabel();
        jlBairro = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jtBairro = new javax.swing.JTextField();
        jtEstado = new javax.swing.JTextField();
        jlCampoObrigatorioNome = new javax.swing.JLabel();
        jlCampoObrigatorioRua = new javax.swing.JLabel();
        jlCampoObrigatorioCidade = new javax.swing.JLabel();
        jlCampoObrigatorioBairro = new javax.swing.JLabel();
        jlCampoObrigatorioEstado = new javax.swing.JLabel();
        jlCampoObrigatorioCPF = new javax.swing.JLabel();
        jlCampoObrigatorioTelefone = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtSexo = new javax.swing.JTextField();
        jlCampoObrigatorioDataNascimento = new javax.swing.JLabel();
        jlCampoObrigatorioSexo = new javax.swing.JLabel();
        jlCampoObrigatorioEmail = new javax.swing.JLabel();
        jlCampoObrigatorioLogin = new javax.swing.JLabel();
        jlCampoObrigatorioSenha = new javax.swing.JLabel();
        jlCampoObrigatorioNovaSenha = new javax.swing.JLabel();
        jbExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jlNome.setText("Nome");

        jlRua.setText("Rua");

        jlCpf.setText("CPF");

        jlTelefone.setText("Telefone");

        jlDataNascimento.setText("Data de nascimento");

        jlSexo.setText("Sexo");

        jlEmail.setText("Email");

        jtDataDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDataDiaActionPerformed(evt);
            }
        });

        jLabel8.setText("/");

        jLabel9.setText("/");

        jlLogin.setText("Login");

        jlSenha.setText("Senha");

        jlNovaSenha.setText("Nova Senha");

        jbAlterar.setText("Alterar Funcionário");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlCidade.setText("Cidade");

        jlBairro.setText("Bairro");

        jlEstado.setText("Estado");

        jlCampoObrigatorioNome.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioNome.setText("Campo Obrigatório *");

        jlCampoObrigatorioRua.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioRua.setText("Campo Obrigatório *");

        jlCampoObrigatorioCidade.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioCidade.setText("Campo Obrigatório *");

        jlCampoObrigatorioBairro.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioBairro.setText("Campo Obrigatório *");

        jlCampoObrigatorioEstado.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioEstado.setText("Campo Obrigatório *");

        jlCampoObrigatorioCPF.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioCPF.setText("Campo Obrigatório *");

        jlCampoObrigatorioTelefone.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioTelefone.setText("Campo Obrigatório *");

        jLabel11.setText("jLabel11");

        jlCampoObrigatorioDataNascimento.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioDataNascimento.setText("Campo Obrigatório *");

        jlCampoObrigatorioSexo.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioSexo.setText("Campo Obrigatório *");

        jlCampoObrigatorioEmail.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioEmail.setText("Campo Obrigatório *");

        jlCampoObrigatorioLogin.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioLogin.setText("Campo Obrigatório *");

        jlCampoObrigatorioSenha.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioSenha.setText("Campo Obrigatório *");

        jlCampoObrigatorioNovaSenha.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioNovaSenha.setText("Campo Obrigatório *");

        jbExcluir.setText("Excluir Funcionário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDataDia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDataMes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDataAno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlCampoObrigatorioDataNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlNovaSenha)
                                            .addComponent(jlSenha)
                                            .addComponent(jlLogin))
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtNovaSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                            .addComponent(jtLogin)
                                            .addComponent(jtSenha))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlCampoObrigatorioLogin)
                                            .addComponent(jlCampoObrigatorioSenha)
                                            .addComponent(jlCampoObrigatorioNovaSenha)))
                                    .addComponent(jbExcluir)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlTelefone))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                            .addComponent(jtTelefone)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jlRua)
                                                        .addComponent(jlCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jlBairro)
                                                    .addGap(51, 51, 51)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jlEstado)
                                                .addGap(46, 46, 46)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                                            .addComponent(jtCidade)
                                            .addComponent(jtBairro)
                                            .addComponent(jtEstado))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCampoObrigatorioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlCampoObrigatorioRua)
                                    .addComponent(jlCampoObrigatorioCidade)
                                    .addComponent(jlCampoObrigatorioBairro)
                                    .addComponent(jlCampoObrigatorioEstado)
                                    .addComponent(jlCampoObrigatorioCPF)
                                    .addComponent(jlCampoObrigatorioTelefone)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlEmail))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlCampoObrigatorioSexo))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlCampoObrigatorioEmail)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(159, 159, 159))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbCancelar)
                .addGap(18, 18, 18)
                .addComponent(jbAlterar)
                .addGap(256, 256, 256))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioNome))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRua, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioRua))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioCidade))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlBairro)
                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioBairro))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEstado)
                    .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioEstado))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioCPF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDataDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtDataMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtDataAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jlCampoObrigatorioDataNascimento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioSexo))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioEmail))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlLogin)
                    .addComponent(jtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioLogin))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenha)
                    .addComponent(jtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioSenha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNovaSenha)
                    .addComponent(jtNovaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioNovaSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar)
                    .addComponent(jbCancelar)
                    .addComponent(jbExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtDataDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDataDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDataDiaActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        int correto = 0;
        int mes, ano, dia;
        if (jtNome.getText().length() > 0) {
            jlCampoObrigatorioNome.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioNome.setVisible(true);
            //correto = false;
        }
        if (jtRua.getText().length() > 0) {
            jlCampoObrigatorioRua.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioRua.setVisible(true);
            //correto = false;
        }
        if (jtCidade.getText().length() > 0) {
            jlCampoObrigatorioCidade.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioCidade.setVisible(true);
            //correto = false;
        }
        if (jtBairro.getText().length() > 0) {
            jlCampoObrigatorioBairro.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioBairro.setVisible(true);
            //correto = false;
        }
        if (jtEstado.getText().length() > 0) {
            jlCampoObrigatorioEstado.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioEstado.setVisible(true);
            //correto = false;
        }
        if (jtCpf.getText().length() > 0 && jtCpf.getText().length()== 11) {
            jlCampoObrigatorioCPF.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioCPF.setVisible(true);
            //correto = false;
        }
        if (jtTelefone.getText().length() > 0) {
            jlCampoObrigatorioTelefone.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioTelefone.setVisible(true);
            //correto = false;
        }
        if (jtDataAno.getText().length() > 0 && jtDataMes.getText().length() > 0 && jtDataDia.getText().length() > 0) {
            ano = (Integer.parseInt(jtDataAno.getText()));
            mes = (Integer.parseInt(jtDataMes.getText()));
            dia = (Integer.parseInt(jtDataDia.getText()));
            if (ano <= 2015 && ano > 1965) {
                if (mes > 0 && mes <= 12) {
                    if (dia > 0 && dia <= 30) {
                        jlCampoObrigatorioDataNascimento.setVisible(false);
                        correto++;
                    } else {
                        jlCampoObrigatorioDataNascimento.setVisible(true);
                    }
                } else {
                    jlCampoObrigatorioDataNascimento.setVisible(true);
                }
            } else {
                jlCampoObrigatorioDataNascimento.setVisible(true);
            }
        } else {
            jlCampoObrigatorioDataNascimento.setVisible(true);
        }

        
        if (jtSexo.getText().length() > 0) {
            if(jtSexo.getText().equals("MASCULINO") || jtSexo.getText().equals("FEMININO")){
            jlCampoObrigatorioSexo.setVisible(false);
            correto++;
            }
            else {
            jlCampoObrigatorioSexo.setVisible(true);
        }
        } else {
            jlCampoObrigatorioSexo.setVisible(true);
        }
        
        if (jtEmail.getText().length() > 0) {
            jlCampoObrigatorioEmail.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioEmail.setVisible(true);
            //correto = false;
        }
        if (jtLogin.getText().length() > 0) {
            jlCampoObrigatorioLogin.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioLogin.setVisible(true);
            //correto = false;
        }
        if (jtSenha.getText().length() > 0) {
            jlCampoObrigatorioSenha.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioSenha.setVisible(true);
            //correto = false;
        }
        if (jtNovaSenha.getText().length() > 0 && jtSenha.getText().equals(jtNovaSenha.getText())) {
            jlCampoObrigatorioNovaSenha.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioNovaSenha.setVisible(true);
            JOptionPane.showMessageDialog(this, "As senhas não correspondem!");
            //correto = false;
        }
        if (correto == 13) {
            JOptionPane.showMessageDialog(this, "informaçoes corretas");
        } else {
            JOptionPane.showMessageDialog(this, "informações invalidas");
        }   
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeAlteracaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeAlteracaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeAlteracaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeAlteracaoFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeAlteracaoFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCampoObrigatorioBairro;
    private javax.swing.JLabel jlCampoObrigatorioCPF;
    private javax.swing.JLabel jlCampoObrigatorioCidade;
    private javax.swing.JLabel jlCampoObrigatorioDataNascimento;
    private javax.swing.JLabel jlCampoObrigatorioEmail;
    private javax.swing.JLabel jlCampoObrigatorioEstado;
    private javax.swing.JLabel jlCampoObrigatorioLogin;
    private javax.swing.JLabel jlCampoObrigatorioNome;
    private javax.swing.JLabel jlCampoObrigatorioNovaSenha;
    private javax.swing.JLabel jlCampoObrigatorioRua;
    private javax.swing.JLabel jlCampoObrigatorioSenha;
    private javax.swing.JLabel jlCampoObrigatorioSexo;
    private javax.swing.JLabel jlCampoObrigatorioTelefone;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNovaSenha;
    private javax.swing.JLabel jlRua;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtCpf;
    private javax.swing.JTextField jtDataAno;
    private javax.swing.JTextField jtDataDia;
    private javax.swing.JTextField jtDataMes;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JPasswordField jtLogin;
    private javax.swing.JTextField jtNome;
    private javax.swing.JPasswordField jtNovaSenha;
    private javax.swing.JTextField jtRua;
    private javax.swing.JPasswordField jtSenha;
    private javax.swing.JTextField jtSexo;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}
