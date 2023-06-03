package tela.cadastro.principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaNovoCadastro extends JFrame{
    private JLabel labelBemVindo;
    private JButton novoPacienteButton;
    private JButton novoFisioterapeutaButton;
    private JButton novoFuncionarioButton;
    private JButton jaPossuiCadastroButton;
    public JPanel formCadastroNovo;
public TelaNovoCadastro() {
    novoPacienteButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        NovoPaciente f = new NovoPaciente();
        f.setVisible(true);
        f.setSize(500,500);
        f.setContentPane(f.formPacienteNovo);
        }
    });



    }

}

