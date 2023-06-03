package tela.cadastro.principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame {
    private JTextField textFieldUsuario;
    private JPasswordField passwordFieldLogin;
    private JLabel senhaLabel;
    private JButton btnLogin;
    public JPanel formLogin;

    public TelaLogin() {

    Administrador adm = new Administrador("user123","admin123");
    btnLogin.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String user = textFieldUsuario.getText();
            String senha = String.valueOf(passwordFieldLogin.getPassword());

            if(user.equals(adm.getUser()) && senha.equals(adm.getSenha())) {



                TelaNovoCadastro form = new TelaNovoCadastro();
                form.setContentPane(form.formCadastroNovo);
                form.setVisible(true);
                form.setSize(500,500);
                form.setTitle("Cadastro");

            }else{JOptionPane.showMessageDialog( null, "Usuario ou senha invalido");

            }

        }

    });
}


}
