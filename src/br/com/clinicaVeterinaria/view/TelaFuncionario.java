/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.clinicaVeterinaria.view;

import Controle.ControleAnimal;
import Controle.ControleCliente;
import Modelo.ModeloAnimal;
import Modelo.ModeloCliente;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alessandro
 */
public class TelaFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionario
     */
    public TelaFuncionario() {
        initComponents();
        //setSize(800, 800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jbCadastrarCliente = new javax.swing.JButton();
        jbCadastrarAnimal = new javax.swing.JButton();
        jbMarcarConsulta = new javax.swing.JButton();
        jbGerenciarEstoque = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jbPesquisarCliente = new javax.swing.JButton();
        jbPesquisarAnimal = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmCliente = new javax.swing.JMenu();
        jmClienteCadastrar = new javax.swing.JMenuItem();
        jmClienteAlterar = new javax.swing.JMenuItem();
        jmClienteExcluir = new javax.swing.JMenuItem();
        jmClientePesquisar = new javax.swing.JMenuItem();
        jmAnimal = new javax.swing.JMenu();
        jmAnimalCadastrar = new javax.swing.JMenuItem();
        jmAnimalAlterar = new javax.swing.JMenuItem();
        jmAnimalExcluir = new javax.swing.JMenuItem();
        jmAnimalPesquisar = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        jmConsultaMarcar = new javax.swing.JMenuItem();
        jmConsultaAlterar = new javax.swing.JMenuItem();
        jmConsultaExcluir = new javax.swing.JMenuItem();
        jmConsultaVisualizar = new javax.swing.JMenuItem();
        jmSobre = new javax.swing.JMenu();
        jmAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Funcionário");
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jbCadastrarCliente.setText("Cadastrar Cliente");
        jbCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarClienteActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbCadastrarCliente);
        jbCadastrarCliente.setBounds(10, 53, 190, 40);

        jbCadastrarAnimal.setText("Cadastrar Animal");
        jbCadastrarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarAnimalActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbCadastrarAnimal);
        jbCadastrarAnimal.setBounds(10, 112, 190, 40);

        jbMarcarConsulta.setText("Marcar Consulta");
        jbMarcarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMarcarConsultaActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbMarcarConsulta);
        jbMarcarConsulta.setBounds(10, 174, 190, 40);

        jbGerenciarEstoque.setText("Gerenciar Estoque");
        jbGerenciarEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerenciarEstoqueActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbGerenciarEstoque);
        jbGerenciarEstoque.setBounds(10, 231, 190, 40);
        jDesktopPane1.add(jSeparator1);
        jSeparator1.setBounds(0, 302, 650, 10);

        jButton5.setText("Logar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jButton5);
        jButton5.setBounds(539, 363, 70, 30);

        jbPesquisarCliente.setText("Pesquisar Cliente");
        jbPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarClienteActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbPesquisarCliente);
        jbPesquisarCliente.setBounds(410, 60, 190, 40);

        jbPesquisarAnimal.setText("Pesquisar Animal");
        jbPesquisarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarAnimalActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbPesquisarAnimal);
        jbPesquisarAnimal.setBounds(410, 120, 190, 40);

        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbSair);
        jbSair.setBounds(30, 360, 73, 30);

        jmCliente.setText("Cliente");

        jmClienteCadastrar.setText("Cadastrar");
        jmClienteCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClienteCadastrarActionPerformed(evt);
            }
        });
        jmCliente.add(jmClienteCadastrar);

        jmClienteAlterar.setText("Alterar");
        jmClienteAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClienteAlterarActionPerformed(evt);
            }
        });
        jmCliente.add(jmClienteAlterar);

        jmClienteExcluir.setText("Excluir");
        jmClienteExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClienteExcluirActionPerformed(evt);
            }
        });
        jmCliente.add(jmClienteExcluir);

        jmClientePesquisar.setText("Pesquisar");
        jmClientePesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClientePesquisarActionPerformed(evt);
            }
        });
        jmCliente.add(jmClientePesquisar);

        jMenuBar1.add(jmCliente);

        jmAnimal.setText("Animal");

        jmAnimalCadastrar.setText("Cadastrar");
        jmAnimalCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAnimalCadastrarActionPerformed(evt);
            }
        });
        jmAnimal.add(jmAnimalCadastrar);

        jmAnimalAlterar.setText("Alterar");
        jmAnimalAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAnimalAlterarActionPerformed(evt);
            }
        });
        jmAnimal.add(jmAnimalAlterar);

        jmAnimalExcluir.setText("Excluir");
        jmAnimalExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAnimalExcluirActionPerformed(evt);
            }
        });
        jmAnimal.add(jmAnimalExcluir);

        jmAnimalPesquisar.setText("Pesquisar");
        jmAnimalPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAnimalPesquisarActionPerformed(evt);
            }
        });
        jmAnimal.add(jmAnimalPesquisar);

        jMenuBar1.add(jmAnimal);

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
        jmSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSobre);

        jmAjuda.setText("Ajuda");
        jmAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAjudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbMarcarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMarcarConsultaActionPerformed
        // TODO add your handling code here:
        TelaConsulta tc = new TelaConsulta();
        tc.setVisible(true);
    }//GEN-LAST:event_jbMarcarConsultaActionPerformed

    private void jbGerenciarEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerenciarEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGerenciarEstoqueActionPerformed

    private void jbCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarClienteActionPerformed
        // TODO add your handling code here:
        TelaCadastroCliente tcc = new TelaCadastroCliente();
        tcc.setVisible(true);;
        
    }//GEN-LAST:event_jbCadastrarClienteActionPerformed

    private void jmClienteCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClienteCadastrarActionPerformed
        // TODO add your handling code here:
        TelaCadastroCliente tcc = new TelaCadastroCliente();
        tcc.setVisible(true);
    }//GEN-LAST:event_jmClienteCadastrarActionPerformed

    private void jmAnimalCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAnimalCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ControleCliente control = new ControleCliente();
            ModeloCliente cliente = new ModeloCliente();
            //ModeloAnimalDomestico animal = new ModeloAnimalDomestico();
            String cpf;
            cpf = JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            cliente = control.consultarCliente(cpf);
            if (control.verificarCPF(cpf)) {
                //animal.setIdDono(cliente.getIdCliente());
                TelaCadastroAnimal tca = new TelaCadastroAnimal();
                tca.inserirDados(cliente);
                tca.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Cliente não está cadastrado");
            }    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmAnimalCadastrarActionPerformed

    private void jbCadastrarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarAnimalActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ControleCliente control = new ControleCliente();
            ModeloCliente cliente = new ModeloCliente();
            //ModeloAnimalDomestico animal = new ModeloAnimalDomestico();
            String cpf;
            cpf = JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            cliente = control.consultarCliente(cpf);
            if (control.verificarCPF(cpf)) {
                //animal.setIdDono(cliente.getIdCliente());
                TelaCadastroAnimal tca = new TelaCadastroAnimal();
                tca.inserirDados(cliente);
                tca.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Cliente não está cadastrado");
            }    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbCadastrarAnimalActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jmClienteAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClienteAlterarActionPerformed
        // TODO add your handling code here:
        ModeloCliente cliente = new ModeloCliente();
        Controle.ControleCliente control = new ControleCliente();
        String cpf;
        TelaAlteracaoCliente telaAlteracaoCliente = new TelaAlteracaoCliente();
        
        try {
            cpf=JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            if(control.verificarCPF(cpf)){
            cliente = control.consultarCliente(cpf);
            telaAlteracaoCliente.insertDados(cliente);
            telaAlteracaoCliente.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Cliente não cadastrado");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmClienteAlterarActionPerformed

    private void jmAnimalPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAnimalPesquisarActionPerformed
        // TODO add your handling code here:
        try {
        ModeloAnimal animal = new ModeloAnimal();
        ModeloCliente cliente = new ModeloCliente();
        Controle.ControleAnimal control = new ControleAnimal();
        Controle.ControleCliente controlC = new ControleCliente();
        String cpf, nomeAnimal;
            cpf=JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            if(controlC.verificarCPF(cpf)){
            nomeAnimal=JOptionPane.showInputDialog(null, "Digite o nome do Animal");
            if(control.verificarNome(nomeAnimal)){
            cliente = controlC.consultarCliente(cpf);
            animal = control.consultarAnimal(cliente.getCpf(), nomeAnimal);
            TelaAlteracaoAnimal telaAlteracaoAnimal = new TelaAlteracaoAnimal();
            telaAlteracaoAnimal.inserirDados(cliente, animal);
            telaAlteracaoAnimal.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Animal não cadastrado");
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmAnimalPesquisarActionPerformed

    private void jbPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarClienteActionPerformed
        // TODO add your handling code here:
        ModeloCliente cliente = new ModeloCliente();
        Controle.ControleCliente control = new ControleCliente();
        String cpf;
        TelaAlteracaoCliente telaAlteracaoCliente = new TelaAlteracaoCliente();
        
        try {
            cpf=JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            if(control.verificarCPF(cpf)){
            cliente = control.consultarCliente(cpf);
            telaAlteracaoCliente.insertDados(cliente);
            telaAlteracaoCliente.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Cliente não cadastrado");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbPesquisarClienteActionPerformed

    private void jmClienteExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClienteExcluirActionPerformed
        // TODO add your handling code here:
        ModeloCliente cliente = new ModeloCliente();
        Controle.ControleCliente control = new ControleCliente();
        String cpf;
        TelaAlteracaoCliente telaAlteracaoCliente = new TelaAlteracaoCliente();
        
        try {
            cpf=JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            if(control.verificarCPF(cpf)){
            cliente = control.consultarCliente(cpf);
            telaAlteracaoCliente.insertDados(cliente);
            telaAlteracaoCliente.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Cliente não cadastrado");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmClienteExcluirActionPerformed

    private void jmClientePesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientePesquisarActionPerformed
        // TODO add your handling code here:
        ModeloCliente cliente = new ModeloCliente();
        Controle.ControleCliente control = new ControleCliente();
        String cpf;
        TelaAlteracaoCliente telaAlteracaoCliente = new TelaAlteracaoCliente();
        
        try {
            cpf=JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            if(control.verificarCPF(cpf)){
            cliente = control.consultarCliente(cpf);
            telaAlteracaoCliente.insertDados(cliente);
            telaAlteracaoCliente.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "Cliente não cadastrado");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmClientePesquisarActionPerformed

    private void jmAnimalAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAnimalAlterarActionPerformed
        // TODO add your handling code here:
        try {
        ModeloAnimal animal = new ModeloAnimal();
        ModeloCliente cliente = new ModeloCliente();
        Controle.ControleAnimal control = new ControleAnimal();
        Controle.ControleCliente controlC = new ControleCliente();
        String cpf, nomeAnimal;
            cpf=JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            if(controlC.verificarCPF(cpf)){
            nomeAnimal=JOptionPane.showInputDialog(null, "Digite o nome do Animal");
            if(control.verificarNome(nomeAnimal)){
            cliente = controlC.consultarCliente(cpf);
            animal = control.consultarAnimal(cliente.getCpf(), nomeAnimal);
            TelaAlteracaoAnimal telaAlteracaoAnimal = new TelaAlteracaoAnimal();
            telaAlteracaoAnimal.inserirDados(cliente, animal);
            telaAlteracaoAnimal.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Animal não cadastrado");
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmAnimalAlterarActionPerformed

    private void jmAnimalExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAnimalExcluirActionPerformed
        // TODO add your handling code here:
        try {
        ModeloAnimal animal = new ModeloAnimal();
        ModeloCliente cliente = new ModeloCliente();
        Controle.ControleAnimal control = new ControleAnimal();
        Controle.ControleCliente controlC = new ControleCliente();
        String cpf, nomeAnimal;
            cpf=JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            if(controlC.verificarCPF(cpf)){
            nomeAnimal=JOptionPane.showInputDialog(null, "Digite o nome do Animal");
            if(control.verificarNome(nomeAnimal)){
            cliente = controlC.consultarCliente(cpf);
            animal = control.consultarAnimal(cliente.getCpf(), nomeAnimal);
            TelaAlteracaoAnimal telaAlteracaoAnimal = new TelaAlteracaoAnimal();
            telaAlteracaoAnimal.inserirDados(cliente, animal);
            telaAlteracaoAnimal.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Animal não cadastrado");
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmAnimalExcluirActionPerformed

    private void jmSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSobreMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "SISTEMA DE GERENCIAMENTO DE UMA CLÍNICA VETERINÁRIA \n\n"
                + "Sistema criado para gerenciamento de funcionário,veterinário, cliente e animal\n"
                + "de uma clinica, tem como principais funções insersão, exclusão, alteração e pequisa\n"
                + "sobre funcionário, cliente e animal. O Sistemas também possibilita marcar consulta\n"
                + "e gerenciar o estoque da clínica.\n");
    }//GEN-LAST:event_jmSobreMouseClicked

    private void jmAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAjudaMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"CADASTRAR CLIENTE - Cadastra um novo cliente no sistema.\n"
                + "CADASTRAR ANIMAL - Cadastra um novo animal no sistema.\n"              
                + "PESQUISAR CLIENTE - Pesquisa por um cliente no sistema.\n"
                + "PESQUISAR ANIMAL - Pesquisa por um animal no sistema.\n"
                + "GERENCIAR ESTOQUE - Pesquisa informações sobre o estoque.\n"
                + "MARCAR CONSULTA - Gerencia as consultas no sistema.");
    }//GEN-LAST:event_jmAjudaMouseClicked

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbPesquisarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarAnimalActionPerformed
        // TODO add your handling code here:
        try {
        ModeloAnimal animal = new ModeloAnimal();
        ModeloCliente cliente = new ModeloCliente();
        Controle.ControleAnimal control = new ControleAnimal();
        Controle.ControleCliente controlC = new ControleCliente();
        String cpf, nomeAnimal;
            cpf=JOptionPane.showInputDialog(null, "Digite o CPF do cliente");
            if(controlC.verificarCPF(cpf)){
            nomeAnimal=JOptionPane.showInputDialog(null, "Digite o nome do Animal");
            if(control.verificarNome(nomeAnimal)){
            cliente = controlC.consultarCliente(cpf);
            animal = control.consultarAnimal(cliente.getCpf(), nomeAnimal);
            TelaAlteracaoAnimal telaAlteracaoAnimal = new TelaAlteracaoAnimal();
            telaAlteracaoAnimal.inserirDados(cliente, animal);
            telaAlteracaoAnimal.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Animal não cadastrado");
            }
            }
            else{
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado");
            }
        } catch (Exception ex) {
            Logger.getLogger(TelaGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbCadastrarAnimal;
    private javax.swing.JButton jbCadastrarCliente;
    private javax.swing.JButton jbGerenciarEstoque;
    private javax.swing.JButton jbMarcarConsulta;
    private javax.swing.JButton jbPesquisarAnimal;
    private javax.swing.JButton jbPesquisarCliente;
    private javax.swing.JButton jbSair;
    private javax.swing.JMenu jmAjuda;
    private javax.swing.JMenu jmAnimal;
    private javax.swing.JMenuItem jmAnimalAlterar;
    private javax.swing.JMenuItem jmAnimalCadastrar;
    private javax.swing.JMenuItem jmAnimalExcluir;
    private javax.swing.JMenuItem jmAnimalPesquisar;
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
    private javax.swing.JMenu jmSobre;
    // End of variables declaration//GEN-END:variables
}
