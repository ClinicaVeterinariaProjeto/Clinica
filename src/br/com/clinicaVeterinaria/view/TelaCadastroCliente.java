/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaVeterinaria.view;

import Controle.ControleTeclasPermitidasLetras;
import Controle.ControleTeclasPermitidasNumeros;
import javax.swing.JOptionPane;
import Modelo.ModeloCliente;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alessandro
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroCliente
     */
    public TelaCadastroCliente() {
        initComponents();
        jlCampoObrigatorioNome.setVisible(false);
        jlCampoObrigatorioCPF.setVisible(false);
        jlCampoObrigatorioCidade.setVisible(false);
        jlCampoObrigatorioDataNascimento.setVisible(false);
        jlCampoObrigatorioEmail.setVisible(false);
        jlCampoObrigatorioEstado.setVisible(false);
        jlCampoObrigatorioNumeroCasa.setVisible(false);
        jlCampoObrigatorioRua.setVisible(false);
        jlCampoObrigatorioSexo.setVisible(false);
        jlCampoObrigatorioTelefone.setVisible(false);
        jlCampoObrigatorioBairro.setVisible(false);
        jtNome.setDocument(new ControleTeclasPermitidasLetras(50));
        jtCpf.setDocument(new ControleTeclasPermitidasNumeros(11));
        jtDataAno.setDocument(new ControleTeclasPermitidasNumeros(4));
        jtDataMes.setDocument(new ControleTeclasPermitidasNumeros(2));
        jtDataDia.setDocument(new ControleTeclasPermitidasNumeros(2));
        jtTelefone.setDocument(new ControleTeclasPermitidasNumeros(10));
        jtCidade.setDocument(new ControleTeclasPermitidasLetras(20));
        jtEstado.setDocument(new ControleTeclasPermitidasLetras(20));
        jtRua.setDocument(new ControleTeclasPermitidasLetras(30));
        jtNumeroCasa.setDocument(new ControleTeclasPermitidasNumeros(4));
        jtSexo.setDocument(new ControleTeclasPermitidasLetras(10));
        jtBairro.setDocument(new ControleTeclasPermitidasLetras(20));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jlNome = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlDataNascimento = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtNome = new javax.swing.JTextField();
        jtEstado = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jtDataDia = new javax.swing.JTextField();
        jtDataMes = new javax.swing.JTextField();
        jtDataAno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jbCadastrar = new javax.swing.JToggleButton();
        jbCancelar = new javax.swing.JButton();
        jbCadastrarAnimal = new javax.swing.JButton();
        jlCampoObrigatorioNome = new javax.swing.JLabel();
        jtRua = new javax.swing.JTextField();
        jlRua = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jtCidade = new javax.swing.JTextField();
        jlNumeroCasa = new javax.swing.JLabel();
        jtNumeroCasa = new javax.swing.JTextField();
        jlCampoObrigatorioRua = new javax.swing.JLabel();
        jlCampoObrigatorioCidade = new javax.swing.JLabel();
        jlCampoObrigatorioEstado = new javax.swing.JLabel();
        jlCampoObrigatorioCPF = new javax.swing.JLabel();
        jlCampoObrigatorioTelefone = new javax.swing.JLabel();
        jlCampoObrigatorioDataNascimento = new javax.swing.JLabel();
        jlCampoObrigatorioSexo = new javax.swing.JLabel();
        jlCampoObrigatorioEmail = new javax.swing.JLabel();
        jlCampoObrigatorioNumeroCasa = new javax.swing.JLabel();
        jtSexo = new javax.swing.JTextField();
        jlBairro = new javax.swing.JLabel();
        jtBairro = new javax.swing.JTextField();
        jlCampoObrigatorioBairro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro Cliente");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jlNome.setText("Nome");

        jlEstado.setText("Estado");

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

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbCadastrarAnimal.setText("Cadastrar Animal");

        jlCampoObrigatorioNome.setForeground(new java.awt.Color(255, 51, 51));
        jlCampoObrigatorioNome.setText("Campo Obrigatório *");

        jlRua.setText("Rua");

        jlCidade.setText("Cidade");

        jtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCidadeActionPerformed(evt);
            }
        });

        jlNumeroCasa.setText("Nº");

        jlCampoObrigatorioRua.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioRua.setText("Campo Obrigatório *");

        jlCampoObrigatorioCidade.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioCidade.setText("Campo Obrigatório *");

        jlCampoObrigatorioEstado.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioEstado.setText("Campo Obrigatório *");

        jlCampoObrigatorioCPF.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioCPF.setText("Campo Obrigatório *");

        jlCampoObrigatorioTelefone.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioTelefone.setText("Campo Obrigatório *");

        jlCampoObrigatorioDataNascimento.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioDataNascimento.setText("Campo Obrigatório *");

        jlCampoObrigatorioSexo.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioSexo.setText("Campo Obrigatório *");

        jlCampoObrigatorioEmail.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioEmail.setText("Campo Obrigatório *");

        jlCampoObrigatorioNumeroCasa.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioNumeroCasa.setText("Campo Obrigatório *");

        jlBairro.setText("Bairro");

        jlCampoObrigatorioBairro.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioBairro.setText("Campo Obrigatório *");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtDataDia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDataMes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDataAno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCampoObrigatorioDataNascimento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jlCampoObrigatorioSexo))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlRua, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtRua, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(jtNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCampoObrigatorioNome, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlCampoObrigatorioRua, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlNumeroCasa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlCampoObrigatorioNumeroCasa))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlEmail)
                                    .addComponent(jlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlCampoObrigatorioEmail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlBairro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlEstado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtTelefone)
                                            .addComponent(jtCpf, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtBairro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jlCampoObrigatorioCidade)
                                                    .addComponent(jlCampoObrigatorioTelefone)
                                                    .addComponent(jlCampoObrigatorioCPF))
                                                .addGap(1, 1, 1))
                                            .addComponent(jlCampoObrigatorioBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jlCampoObrigatorioEstado)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jbCadastrarAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar)
                .addGap(31, 31, 31)
                .addComponent(jbCadastrar)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioNome))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioRua)
                    .addComponent(jlNumeroCasa)
                    .addComponent(jtNumeroCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioNumeroCasa)
                    .addComponent(jlRua, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCidade)
                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioCidade))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCampoObrigatorioEstado)
                            .addComponent(jtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jlEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jlCampoObrigatorioBairro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCampoObrigatorioCPF))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jlCampoObrigatorioDataNascimento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioSexo)
                    .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioEmail))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbCancelar)
                    .addComponent(jbCadastrarAnimal))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtDataDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDataDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDataDiaActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        int correto = 0;
        int dia, mes, ano;

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
        if (jtNumeroCasa.getText().length() > 0) {
            jlCampoObrigatorioNumeroCasa.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioNumeroCasa.setVisible(true);
            //correto = false;
        }
        if (jtCidade.getText().length() > 0) {
            jlCampoObrigatorioCidade.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioCidade.setVisible(true);
            //correto = false;
        }
        if (jtEstado.getText().length() > 0) {
            jlCampoObrigatorioEstado.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioEstado.setVisible(true);
            //correto = false;
        }

        if (jtBairro.getText().length() > 0) {
            jlCampoObrigatorioBairro.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioBairro.setVisible(true);
            //correto = false;
        }
        if (jtCpf.getText().length() > 0 && jtCpf.getText().length() == 11) {
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

        if (correto == 11) {
            try {
                ModeloCliente cliente = new ModeloCliente();
                cliente.setNome(jtNome.getText());
                cliente.setBairro(jtBairro.getText());
                cliente.setCidade(jtCidade.getText());
                cliente.setCpf(jtCpf.getText());
                cliente.setEmail(jtEmail.getText());
                cliente.setNumeroCasa(Integer.parseInt(jtNumeroCasa.getText()));
                cliente.setRua(jtRua.getText());
                cliente.setSexo(jtSexo.getText());
                cliente.setTelefone(jtTelefone.getText());

            } catch (Exception ex) {
                Logger.getLogger(TelaCadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "informaçoes corretas");
        } else {
            JOptionPane.showMessageDialog(this, "informações invalidas");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCidadeActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jbCadastrar;
    private javax.swing.JButton jbCadastrarAnimal;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCampoObrigatorioBairro;
    private javax.swing.JLabel jlCampoObrigatorioCPF;
    private javax.swing.JLabel jlCampoObrigatorioCidade;
    private javax.swing.JLabel jlCampoObrigatorioDataNascimento;
    private javax.swing.JLabel jlCampoObrigatorioEmail;
    private javax.swing.JLabel jlCampoObrigatorioEstado;
    private javax.swing.JLabel jlCampoObrigatorioNome;
    private javax.swing.JLabel jlCampoObrigatorioNumeroCasa;
    private javax.swing.JLabel jlCampoObrigatorioRua;
    private javax.swing.JLabel jlCampoObrigatorioSexo;
    private javax.swing.JLabel jlCampoObrigatorioTelefone;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumeroCasa;
    private javax.swing.JLabel jlRua;
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
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNumeroCasa;
    private javax.swing.JTextField jtRua;
    private javax.swing.JTextField jtSexo;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}
