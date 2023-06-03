package tela.cadastro.principal;
import javax.swing.*;
public class Run {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TelaLogin log = new TelaLogin();
        log.setContentPane(log.formLogin);
        log.setVisible(true);
        log.setSize(500,500);
        log.setTitle("login");


    }


}
