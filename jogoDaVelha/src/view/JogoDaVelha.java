package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogoDaVelha {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JPanel jpanel1;
    private JButton button7;
    private JButton button8;
    private JButton button9;

    String ulimaMarcacao = "O";

    public JogoDaVelha() {

        this.button1.setPreferredSize(new Dimension(10, 120));
        this.button2.setPreferredSize(new Dimension(10, 120));
        this.button3.setPreferredSize(new Dimension(10, 120));
        this.button4.setPreferredSize(new Dimension(10, 120));
        this.button5.setPreferredSize(new Dimension(10, 120));
        this.button6.setPreferredSize(new Dimension(10, 120));
        this.button7.setPreferredSize(new Dimension(10, 120));
        this.button8.setPreferredSize(new Dimension(10, 120));
        this.button9.setPreferredSize(new Dimension(10, 120));


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ulimaMarcacao.equals("X")) {
                    button1.setText("O");
                    ulimaMarcacao = "O";

                }
                else {
                    button1.setText("X");
                    ulimaMarcacao = "X";
                }
                validaJogo();
                validaVelha();

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ulimaMarcacao.equals("X")) {
                    button2.setText("O");
                    ulimaMarcacao = "O";
                }
                else {
                    button2.setText("X");
                    ulimaMarcacao = "X";
                }
                validaJogo();
                validaVelha();

            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ulimaMarcacao.equals("X")) {
                    button7.setText("O");
                    ulimaMarcacao = "O";
                }
                else {
                    button7.setText("X");
                    ulimaMarcacao = "X";
                }
                validaJogo();
                validaVelha();

            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ulimaMarcacao.equals("X")) {
                    button5.setText("O");
                    ulimaMarcacao = "O";
                }
                else {
                    button5.setText("X");
                    ulimaMarcacao = "X";
                }
                validaJogo();
                validaVelha();

            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ulimaMarcacao.equals("X")) {
                    button6.setText("O");
                    ulimaMarcacao = "O";
                }
                else {
                    button6.setText("X");
                    ulimaMarcacao = "X";
                }
                validaJogo();
                validaVelha();

            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ulimaMarcacao.equals("X")) {
                    button8.setText("O");
                    ulimaMarcacao = "O";
                }
                else {
                    button8.setText("X");
                    ulimaMarcacao = "X";
                }
                validaJogo();
                validaVelha();

            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ulimaMarcacao.equals("X")) {
                    button3.setText("O");
                    ulimaMarcacao = "O";
                }
                else {
                    button3.setText("X");
                    ulimaMarcacao = "X";
                }
                validaJogo();
                validaVelha();

            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ulimaMarcacao.equals("X")) {
                    button4.setText("O");
                    ulimaMarcacao = "O";
                }
                else {
                    button4.setText("X");
                    ulimaMarcacao = "X";
                }
                validaJogo();
                validaVelha();

            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (ulimaMarcacao.equals("X")) {
                    button9.setText("O");
                    ulimaMarcacao = "O";
                }
                else {
                    button9.setText("X");
                    ulimaMarcacao = "X";
                }
                validaJogo();
                validaVelha();

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Jogo da Velha - Desenvolvido por: Clênio Silva");
        frame.setContentPane(new JogoDaVelha().jpanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public void validaJogo(){
//        valida primiera linha
        validaLinhaDiagonal(this.button1, this.button2, this.button7);
//        valida segunda linha
        validaLinhaDiagonal(this.button5, this.button6, this.button8);
//        valida terceira linha
        validaLinhaDiagonal(this.button3, this.button4, this.button9);

//        valida primeira coluna
        validaLinhaDiagonal(this.button1, this.button5, this.button3);

//        valida segunda coluna

        validaLinhaDiagonal(this.button2, this.button6, this.button4);

//        valida terceira coluna
        validaLinhaDiagonal(this.button7, this.button8, this.button9);

//        valida diagonal principal
        validaLinhaDiagonal(this.button1, this.button6, this.button9);

//        valida diagonal secundaria
        validaLinhaDiagonal(this.button7, this.button6, this.button3);
    }

    public void validaLinhaDiagonal(JButton btn1, JButton btn2, JButton btn3){
        if(btn1.getText().equals("X") && btn2.getText().equals("X") && btn3.getText().equals("X")){

            JOptionPane.showMessageDialog(null, "Jogo encerrado com ganhador!");
            limparBotoes();
        }
        else if(btn1.getText().equals("O") && btn2.getText().equals("O") && btn3.getText().equals("O")) {
            JOptionPane.showMessageDialog(null, "Jogo encerrado com ganhador!");
            limparBotoes();
        }
    }

    public void validaVelha(){
        if(
                !this.button1.getText().equals("") &&
                !this.button2.getText().equals("") &&
                !this.button3.getText().equals("") &&
                !this.button4.getText().equals("") &&
                !this.button5.getText().equals("") &&
                !this.button6.getText().equals("") &&
                !this.button7.getText().equals("") &&
                !this.button8.getText().equals("") &&
                !this.button9.getText().equals("")
        ){
            JOptionPane.showMessageDialog(null, "Ichi... Deu velha!!!");
            limparBotoes();
        }

    }

    public void limparBotoes(){
        this.button1.setText("");
        this.button2.setText("");
        this.button3.setText("");
        this.button4.setText("");
        this.button5.setText("");
        this.button6.setText("");
        this.button7.setText("");
        this.button8.setText("");
        this.button9.setText("");

    }


}
