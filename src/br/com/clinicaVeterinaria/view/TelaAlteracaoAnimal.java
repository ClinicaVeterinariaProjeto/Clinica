/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaVeterinaria.view;

import Controle.ControleTeclasPermitidasLetras;
import Controle.ControleTeclasPermitidasNumeros;

/**
 *
 * @author Alessandro
 */
public class TelaAlteracaoAnimal extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlteracaoAnimal
     */
    public TelaAlteracaoAnimal() {
        initComponents();
        jlCampoObrigatorioDataNascimentoAnimal.setVisible(false);
        jlCampoObrigatorioNomeAnimal.setVisible(false);
        jlCampoObrigatorioPesoAnimal.setVisible(false);
        jlCampoObrigatorioRacaAnimal.setVisible(false);
        jlCampoObrigatorioTipoAnimal.setVisible(false);
        jlCampoObrigatorioUltimaVacinacaoAnimal.setVisible(false);
        jtNome.setDocument(new ControleTeclasPermitidasLetras(30));
        jtAnoVacinacao.setDocument(new ControleTeclasPermitidasNumeros(4));
        jtMesVacinacao.setDocument(new ControleTeclasPermitidasNumeros(2));
        jtDiaVacinacao.setDocument(new ControleTeclasPermitidasNumeros(2));
        jtDataAno.setDocument(new ControleTeclasPermitidasNumeros(4));
        jtDataMes.setDocument(new ControleTeclasPermitidasNumeros(2));
        jtDataDia.setDocument(new ControleTeclasPermitidasNumeros(2));
        jtPeso.setDocument(new ControleTeclasPermitidasNumeros(2));
        jtRaca.setDocument(new ControleTeclasPermitidasLetras(20));
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
        jlRaca = new javax.swing.JLabel();
        jlPeso = new javax.swing.JLabel();
        jlDataNascimento = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtNome = new javax.swing.JTextField();
        jtRaca = new javax.swing.JTextField();
        jtPeso = new javax.swing.JTextField();
        jtDataDia = new javax.swing.JTextField();
        jtDataMes = new javax.swing.JTextField();
        jtDataAno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcTipo1 = new javax.swing.JCheckBox();
        jcTipo2 = new javax.swing.JCheckBox();
        jlUltimaVacinacao = new javax.swing.JLabel();
        jtDiaVacinacao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtMesVacinacao = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtAnoVacinacao = new javax.swing.JTextField();
        jbAlterarCliente = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlNomeCliente = new javax.swing.JLabel();
        jlCpfCliente = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jtNomeCliente = new javax.swing.JTextField();
        jtCpfCliente = new javax.swing.JTextField();
        jtEnderecoCliente = new javax.swing.JTextField();
        jlIdCliente = new javax.swing.JLabel();
        jtIdCliente = new javax.swing.JTextField();
        jlIdAnimal = new javax.swing.JLabel();
        jtIdAnimal = new javax.swing.JTextField();
        jlCampoObrigatorioNomeAnimal = new javax.swing.JLabel();
        jlCampoObrigatorioRacaAnimal = new javax.swing.JLabel();
        jlCampoObrigatorioTipoAnimal = new javax.swing.JLabel();
        jlCampoObrigatorioPesoAnimal = new javax.swing.JLabel();
        jlCampoObrigatorioDataNascimentoAnimal = new javax.swing.JLabel();
        jlCampoObrigatorioUltimaVacinacaoAnimal = new javax.swing.JLabel();
        jbExcluirAnimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alteração Animal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jlNome.setText("Nome");

        jlRaca.setText("Raça");

        jlPeso.setText("Peso");

        jlDataNascimento.setText("Data de nascimento");

        jlTipo.setText("Tipo");

        jtDataDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDataDiaActionPerformed(evt);
            }
        });

        jLabel8.setText("/");

        jLabel9.setText("/");

        jcTipo1.setText("tipo1");

        jcTipo2.setText("tipo2");
        jcTipo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcTipo2ActionPerformed(evt);
            }
        });

        jlUltimaVacinacao.setText("Ultima Vacinação");

        jLabel1.setText("/");

        jLabel2.setText("/");

        jtAnoVacinacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtAnoVacinacaoActionPerformed(evt);
            }
        });

        jbAlterarCliente.setText("Alterar Animal");
        jbAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarClienteActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlNomeCliente.setText("Nome Cliente");

        jlCpfCliente.setText("CPF");

        jlEndereco.setText("Endereço");

        jlIdCliente.setText("ID");

        jlIdAnimal.setText("ID");

        jlCampoObrigatorioNomeAnimal.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioNomeAnimal.setText("Campo Obrigatório *");

        jlCampoObrigatorioRacaAnimal.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioRacaAnimal.setText("Campo Obrigatório *");

        jlCampoObrigatorioTipoAnimal.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioTipoAnimal.setText("Campo Obrigatório *");

        jlCampoObrigatorioPesoAnimal.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioPesoAnimal.setText("Campo Obrigatório *");

        jlCampoObrigatorioDataNascimentoAnimal.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioDataNascimentoAnimal.setText("Campo Obrigatório *");

        jlCampoObrigatorioUltimaVacinacaoAnimal.setForeground(new java.awt.Color(255, 0, 0));
        jlCampoObrigatorioUltimaVacinacaoAnimal.setText("Campo Obrigatório *");

        jbExcluirAnimal.setText("Excluir Animal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbExcluirAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbCancelar)
                .addGap(18, 18, 18)
                .addComponent(jbAlterarCliente)
                .addGap(88, 88, 88))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlUltimaVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtDataDia)
                            .addComponent(jtDiaVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDataMes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtMesVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDataAno, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtAnoVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCampoObrigatorioDataNascimentoAnimal)
                            .addComponent(jlCampoObrigatorioUltimaVacinacaoAnimal))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlNomeCliente)
                                    .addComponent(jlCpfCliente)
                                    .addComponent(jlEndereco))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtCpfCliente)
                                    .addComponent(jtNomeCliente)
                                    .addComponent(jtEnderecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlIdCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlPeso)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jlRaca)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(50, 50, 50)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jcTipo1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jcTipo2)
                                                .addGap(19, 19, 19)
                                                .addComponent(jlCampoObrigatorioTipoAnimal))
                                            .addComponent(jtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jlCampoObrigatorioNomeAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlCampoObrigatorioRacaAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jtIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlCampoObrigatorioPesoAnimal)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNomeCliente)
                            .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlIdCliente)
                            .addComponent(jtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCpfCliente)
                    .addComponent(jtCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEndereco)
                    .addComponent(jtEnderecoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlIdAnimal)
                    .addComponent(jtIdAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioNomeAnimal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioRacaAnimal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcTipo1)
                    .addComponent(jcTipo2)
                    .addComponent(jlCampoObrigatorioTipoAnimal))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioPesoAnimal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDataDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jtDataMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jtDataAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioDataNascimentoAnimal))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlUltimaVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDiaVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jtMesVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jtAnoVacinacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCampoObrigatorioUltimaVacinacaoAnimal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbExcluirAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar)
                    .addComponent(jbAlterarCliente))
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

    private void jcTipo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcTipo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcTipo2ActionPerformed

    private void jtAnoVacinacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtAnoVacinacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtAnoVacinacaoActionPerformed

    private void jbAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarClienteActionPerformed
        // TODO add your handling code here:
        int correto=0;
        if (jtNome.getText().length() > 0 ) {
            jlCampoObrigatorioNomeAnimal.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioNomeAnimal.setVisible(true);
            //correto = false;
        }
        if (jtRaca.getText().length() > 0 ) {
            jlCampoObrigatorioRacaAnimal.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioRacaAnimal.setVisible(true);
            //correto = false;
        }
        if (jtPeso.getText().length() > 0 ) {
            jlCampoObrigatorioPesoAnimal.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioPesoAnimal.setVisible(true);
            //correto = false;
        }
        if (jtDataDia.getText().length() > 0 ) {
            jlCampoObrigatorioDataNascimentoAnimal.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioDataNascimentoAnimal.setVisible(true);
            //correto = false;
        }
        if (jtDataMes.getText().length() > 0 ) {
            jlCampoObrigatorioDataNascimentoAnimal.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioDataNascimentoAnimal.setVisible(true);
            //correto = false;
        }
        if (jtDataAno.getText().length() > 0 ) {
            jlCampoObrigatorioDataNascimentoAnimal.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioDataNascimentoAnimal.setVisible(true);
            //correto = false;
        }
        if (jtAnoVacinacao.getText().length() > 0 ) {
            jlCampoObrigatorioUltimaVacinacaoAnimal.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioUltimaVacinacaoAnimal.setVisible(true);
            //correto = false;
        }
        if (jtMesVacinacao.getText().length() > 0 ) {
            jlCampoObrigatorioUltimaVacinacaoAnimal.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioUltimaVacinacaoAnimal.setVisible(true);
            //correto = false;
        }
        if (jtDiaVacinacao.getText().length() > 0 ) {
            jlCampoObrigatorioUltimaVacinacaoAnimal.setVisible(false);
            correto++;
        } else {
            jlCampoObrigatorioUltimaVacinacaoAnimal.setVisible(true);
            //correto = false;
        }
    }//GEN-LAST:event_jbAlterarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlteracaoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlteracaoAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlteracaoAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAlterarCliente;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluirAnimal;
    private javax.swing.JCheckBox jcTipo1;
    private javax.swing.JCheckBox jcTipo2;
    private javax.swing.JLabel jlCampoObrigatorioDataNascimentoAnimal;
    private javax.swing.JLabel jlCampoObrigatorioNomeAnimal;
    private javax.swing.JLabel jlCampoObrigatorioPesoAnimal;
    private javax.swing.JLabel jlCampoObrigatorioRacaAnimal;
    private javax.swing.JLabel jlCampoObrigatorioTipoAnimal;
    private javax.swing.JLabel jlCampoObrigatorioUltimaVacinacaoAnimal;
    private javax.swing.JLabel jlCpfCliente;
    private javax.swing.JLabel jlDataNascimento;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlIdAnimal;
    private javax.swing.JLabel jlIdCliente;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNomeCliente;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JLabel jlRaca;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlUltimaVacinacao;
    private javax.swing.JTextField jtAnoVacinacao;
    private javax.swing.JTextField jtCpfCliente;
    private javax.swing.JTextField jtDataAno;
    private javax.swing.JTextField jtDataDia;
    private javax.swing.JTextField jtDataMes;
    private javax.swing.JTextField jtDiaVacinacao;
    private javax.swing.JTextField jtEnderecoCliente;
    private javax.swing.JTextField jtIdAnimal;
    private javax.swing.JTextField jtIdCliente;
    private javax.swing.JTextField jtMesVacinacao;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtNomeCliente;
    private javax.swing.JTextField jtPeso;
    private javax.swing.JTextField jtRaca;
    // End of variables declaration//GEN-END:variables
}
