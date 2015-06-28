/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaVeterinaria.view;

import Controle.ControleCliente;
import Controle.ControleFuncionario;
import Controle.ControleVeterinario;
import DAO.ClienteDAO;
import Modelo.ModeloAnimal;
import Modelo.ModeloAnimalDomestico;
import Modelo.ModeloCliente;
import Modelo.ModeloFuncionario;
import Modelo.ModeloVeterinario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alessandro
 */
public class TelaGerente extends javax.swing.JFrame {

    /**
     * Creates new form TelaGerente
     */
    public TelaGerente() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jbCadastrarCliente = new javax.swing.JButton();
        jbCadastrarAnimal = new javax.swing.JButton();
        jbMarcarConsulta = new javax.swing.JButton();
        jbGerenciarEstoque = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jbPesquisarCliente = new javax.swing.JButton();
        jbPesquisarAnimal = new javax.swing.JButton();
        jbCadastrarFuncionario = new javax.swing.JButton();
        jbCadastrarVeterinario = new javax.swing.JButton();
        jbPesquisarFuncionario = new javax.swing.JButton();
        jbPesquisarVeterinario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCliente = new javax.swing.JMenu();
        jmClienteCadastrar = new javax.swing.JMenuItem();
        jmClienteAlterar = new javax.swing.JMenuItem();
        jmClienteExcluir = new javax.swing.JMenuItem();
        jmClientePesquisar = new javax.swing.JMenuItem();
        jmFuncionario = new javax.swing.JMenu();
        jmFuncionarioCadastrar = new javax.swing.JMenuItem();
        jmFuncionarioAlterar = new javax.swing.JMenuItem();
        jmFuncionarioExcluir = new javax.swing.JMenuItem();
        jmFuncionarioPesquisar = new javax.swing.JMenuItem();
        jmVeterinario = new javax.swing.JMenu();
        jmVeterinarioCadastrar = new javax.swing.JMenuItem();
        jmVeterinarioAlterar = new javax.swing.JMenuItem();
        jmVeterinarioExcluir = new javax.swing.JMenuItem();
        jmVeterinarioPesquisar = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        jmConsultaMarcar = new javax.swing.JMenuItem();
        jmConsultaAlterar = new javax.swing.JMenuItem();
        jmConsultaExcluir = new javax.swing.JMenuItem();
        jmConsultaVisualizar = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();
        jmAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Gerente");
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jbCadastrarCliente.setText("Cadastrar Cliente");
        jbCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarClienteActionPerformed(evt);
            }
        });

        jbCadastrarAnimal.setText("Cadastrar Animal");
        jbCadastrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarAnimalActionPerformed(evt);
            }
        });

        jbMarcarConsulta.setText("Marcar Consulta");
        jbMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMarcarConsultaActionPerformed(evt);
            }
        });

        jbGerenciarEstoque.setText("Gerenciar Estoque");
        jbGerenciarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerenciarEstoqueActionPerformed(evt);
            }
        });

        jButton5.setText("Logar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jbPesquisarCliente.setText("Pesquisar Cliente");
        jbPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarClienteActionPerformed(evt);
            }
        });

        jbPesquisarAnimal.setText("Pesquisar Animal");
        jbPesquisarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarAnimalActionPerformed(evt);
            }
        });

        jbCadastrarFuncionario.setText("Cadastrar Funcionário");
        jbCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarFuncionarioActionPerformed(evt);
            }
        });

        jbCadastrarVeterinario.setText("Cadastrar Veterinário");
        jbCadastrarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarVeterinarioActionPerformed(evt);
            }
        });

        jbPesquisarFuncionario.setText("Pesquisar Funcionário");
        jbPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarFuncionarioActionPerformed(evt);
            }
        });

        jbPesquisarVeterinario.setText("Pesquisar Veterinário");
        jbPesquisarVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarVeterinarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(jbPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbCadastrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(jbPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(jbPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbCadastrarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(jbGerenciarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(jbMarcarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrarVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbGerenciarEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPesquisarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbMarcarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1.setLayer(jbCadastrarCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbCadastrarAnimal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbMarcarConsulta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbGerenciarEstoque, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbPesquisarCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbPesquisarAnimal, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbCadastrarFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbCadastrarVeterinario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbPesquisarFuncionario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbPesquisarVeterinario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jmCliente.setText("Cliente");

        jmClienteCadastrar.setText("Cadastrar");
        jmClienteCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmClienteCadastrarMouseClicked(evt);
            }
        });
        jmClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClienteCadastrarActionPerformed(evt);
            }
        });
        jmCliente.add(jmClienteCadastrar);

        jmClienteAlterar.setText("Alterar");
        jmClienteAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmClienteAlterarMouseClicked(evt);
            }
        });
        jmClienteAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClienteAlterarActionPerformed(evt);
            }
        });
        jmCliente.add(jmClienteAlterar);

        jmClienteExcluir.setText("Excluir");
        jmClienteExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmClienteExcluirMouseClicked(evt);
            }
        });
        jmCliente.add(jmClienteExcluir);

        jmClientePesquisar.setText("Pesquisar");
        jmCliente.add(jmClientePesquisar);

        jMenuBar1.add(jmCliente);

        jmFuncionario.setText("Funcionário");

        jmFuncionarioCadastrar.setText("Cadastrar");
        jmFuncionarioCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFuncionarioCadastrarActionPerformed(evt);
            }
        });
        jmFuncionario.add(jmFuncionarioCadastrar);

        jmFuncionarioAlterar.setText("Alterar");
        jmFuncionario.add(jmFuncionarioAlterar);

        jmFuncionarioExcluir.setText("Excluir");
        jmFuncionario.add(jmFuncionarioExcluir);

        jmFuncionarioPesquisar.setText("Pesquisar");
        jmFuncionarioPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFuncionarioPesquisarActionPerformed(evt);
            }
        });
        jmFuncionario.add(jmFuncionarioPesquisar);

        jMenuBar1.add(jmFuncionario);

        jmVeterinario.setText("Veterinário");

        jmVeterinarioCadastrar.setText("Cadastrar");
        jmVeterinarioCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVeterinarioCadastrarActionPerformed(evt);
            }
        });
        jmVeterinario.add(jmVeterinarioCadastrar);

        jmVeterinarioAlterar.setText("Alterar");
        jmVeterinarioAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVeterinarioAlterarActionPerformed(evt);
            }
        });
        jmVeterinario.add(jmVeterinarioAlterar);

        jmVeterinarioExcluir.setText("Excluir");
        jmVeterinario.add(jmVeterinarioExcluir);

        jmVeterinarioPesquisar.setText("Pesquisar");
        jmVeterinarioPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVeterinarioPesquisarActionPerformed(evt);
            }
        });
        jmVeterinario.add(jmVeterinarioPesquisar);

        jMenuBar1.add(jmVeterinario);

        jmConsulta.setText("Consulta");

        jmConsultaMarcar.setText("Marcar");
        jmConsulta.add(jmConsultaMarcar);

        jmConsultaAlterar.setText("Alterar");
        jmConsulta.add(jmConsultaAlterar);

        jmConsultaExcluir.setText("Excluir");
        jmConsulta.add(jmConsultaExcluir);

        jmConsultaVisualizar.setText("Visualizar");
        jmConsulta.add(jmConsultaVisualizar);

        jMenuBar1.add(jmConsulta);

        jmSobre.setText("Sobre");
        jMenuBar1.add(jmSobre);

        jmAjuda.setText("Ajuda");
        jMenuBar1.add(jmAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClienteCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmClienteCadastrarActionPerformed

    private void jmClienteAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClienteAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmClienteAlterarActionPerformed

    private void jmFuncionarioCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFuncionarioCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmFuncionarioCadastrarActionPerformed

    private void jmFuncionarioPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFuncionarioPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmFuncionarioPesquisarActionPerformed

    private void jbCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarClienteActionPerformed
        // TODO add your handling code here:
        TelaCadastroCliente tcc = new TelaCadastroCliente();
        tcc.setVisible(true);

    }//GEN-LAST:event_jbCadastrarClienteActionPerformed

    private void jbCadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarAnimalActionPerformed
        try {
            // TODO add your handling code here:
            ControleCliente control = new ControleCliente();
            ModeloCliente cliente = new ModeloCliente();
            //ModeloAnimalDomestico animal = new ModeloAnimalDomestico();
            String cpf;
            cpf = JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            cliente = control.consultarCliente(cpf);
            if (cliente != null) {
                //animal.setIdDono(cliente.getIdCliente());
                TelaCadastroAnimal tca = new TelaCadastroAnimal();
                tca.inserirDados(cliente);
                tca.setVisible(true);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbCadastrarAnimalActionPerformed

    private void jbMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMarcarConsultaActionPerformed
        // TODO add your handling code here:
        TelaConsulta tc = new TelaConsulta();
        tc.setVisible(true);
    }//GEN-LAST:event_jbMarcarConsultaActionPerformed

    private void jbGerenciarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerenciarEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGerenciarEstoqueActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jbPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarClienteActionPerformed
        // TODO add your handling code here:
        ModeloCliente cliente = new ModeloCliente();
        Controle.ControleCliente control = new ControleCliente();
        String cpf;
        TelaAlteracaoCliente telaAlteracaoCliente = new TelaAlteracaoCliente();
        
        try {
            cpf=JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            cliente = control.consultarCliente(cpf);
            telaAlteracaoCliente.insertDados(cliente);
            telaAlteracaoCliente.setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jbPesquisarClienteActionPerformed

    private void jmVeterinarioCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVeterinarioCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmVeterinarioCadastrarActionPerformed

    private void jmVeterinarioAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVeterinarioAlterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmVeterinarioAlterarActionPerformed

    private void jmVeterinarioPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVeterinarioPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmVeterinarioPesquisarActionPerformed

    private void jbPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarFuncionarioActionPerformed
        ModeloFuncionario funcionario = new ModeloFuncionario();
        Controle.ControleFuncionario controlF = new ControleFuncionario();
        String cpfF;
        TelaDeAlteracaoFuncionario telaFunc = new TelaDeAlteracaoFuncionario();
        cpfF=JOptionPane.showInputDialog(this, "Digite o CPF do funcionário");
        try {
            funcionario = controlF.consultarFuncionario(cpfF);
            telaFunc.inserirDados(funcionario);
            telaFunc.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
                
    }//GEN-LAST:event_jbPesquisarFuncionarioActionPerformed
    }
    
    private void jbPesquisarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarVeterinarioActionPerformed
        // TODO add your handling code here:
        ModeloVeterinario veterinario = new ModeloVeterinario();
        Controle.ControleVeterinario controlV = new ControleVeterinario();
        String cpf;
        TelaDeAlteracaoVeterinario telaFunc = new TelaDeAlteracaoVeterinario();
        cpf=JOptionPane.showInputDialog(this, "Digite o CPF do funcionário");
        try {
            veterinario = controlV.consultarVeterinario(cpf);
            telaFunc.inserirDadosV(veterinario);
            telaFunc.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
                
    }  
    }//GEN-LAST:event_jbPesquisarVeterinarioActionPerformed

    private void jbCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        TelaCadastroFuncionario func = new TelaCadastroFuncionario();
        func.setVisible(true);
    }//GEN-LAST:event_jbCadastrarFuncionarioActionPerformed

    private void jbCadastrarVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarVeterinarioActionPerformed
        // TODO add your handling code here:
        TelaCadastroVeterinario vet = new TelaCadastroVeterinario();
        vet.setVisible(true);
    }//GEN-LAST:event_jbCadastrarVeterinarioActionPerformed

    private void jmClienteCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmClienteCadastrarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmClienteCadastrarMouseClicked

    private void jmClienteAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmClienteAlterarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmClienteAlterarMouseClicked

    private void jmClienteExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmClienteExcluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmClienteExcluirMouseClicked

    private void jbPesquisarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarAnimalActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jbPesquisarAnimalActionPerformed

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
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGerente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGerente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbCadastrarAnimal;
    private javax.swing.JButton jbCadastrarCliente;
    private javax.swing.JButton jbCadastrarFuncionario;
    private javax.swing.JButton jbCadastrarVeterinario;
    private javax.swing.JButton jbGerenciarEstoque;
    private javax.swing.JButton jbMarcarConsulta;
    private javax.swing.JButton jbPesquisarAnimal;
    private javax.swing.JButton jbPesquisarCliente;
    private javax.swing.JButton jbPesquisarFuncionario;
    private javax.swing.JButton jbPesquisarVeterinario;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmCliente;
    private javax.swing.JMenuItem jmClienteAlterar;
    private javax.swing.JMenuItem jmClienteCadastrar;
    private javax.swing.JMenuItem jmClienteExcluir;
    private javax.swing.JMenuItem jmClientePesquisar;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenuItem jmConsultaAlterar;
    private javax.swing.JMenuItem jmConsultaExcluir;
    private javax.swing.JMenuItem jmConsultaMarcar;
    private javax.swing.JMenuItem jmConsultaVisualizar;
    private javax.swing.JMenu jmFuncionario;
    private javax.swing.JMenuItem jmFuncionarioAlterar;
    private javax.swing.JMenuItem jmFuncionarioCadastrar;
    private javax.swing.JMenuItem jmFuncionarioExcluir;
    private javax.swing.JMenuItem jmFuncionarioPesquisar;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenu jmVeterinario;
    private javax.swing.JMenuItem jmVeterinarioAlterar;
    private javax.swing.JMenuItem jmVeterinarioCadastrar;
    private javax.swing.JMenuItem jmVeterinarioExcluir;
    private javax.swing.JMenuItem jmVeterinarioPesquisar;
    // End of variables declaration//GEN-END:variables
}
