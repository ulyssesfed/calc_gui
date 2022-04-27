package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class calc {
    private JPanel calcultor;
    private JTextArea textArea1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button17;
    String display = "";
    String num = "";
    double result = 0;

    public calc() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "4";
                textArea1.setText(display);
                num = num + "4";

            }
        });

        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "7";
                textArea1.setText(display);
                num = num + "7";
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "8";
                textArea1.setText(display);
                num = num + "8";
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "9";
                textArea1.setText(display);
                num = num + "9";
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "5";
                textArea1.setText(display);
                num = num + "5";
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "6";
                textArea1.setText(display);
                num = num + "6";
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "1";
                textArea1.setText(display);
                num = num + "1";
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "2";
                textArea1.setText(display);
                num = num + "2";
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "3";
                textArea1.setText(display);
                num = num + "3";
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + "0";
                textArea1.setText(display);
                num = num + "0";
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + ".";
                num = num + ".";
                textArea1.setText(display);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + " + ";
                result = result + Double.parseDouble(num);
                num = "";
                textArea1.setText(display);
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + " - ";
                result = result - Double.parseDouble(num);
                num = "";
                textArea1.setText(display);
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + " X ";
                result = result * Double.parseDouble(num);
                num = "";
                textArea1.setText(display);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = display + " / ";
                result = result / Double.parseDouble(num);
                num = "";
                textArea1.setText(display);
            }
        });
        button17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display = String.valueOf(result);
                textArea1.setText(display);
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("calc");
        frame.setContentPane(new calc().calcultor);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }


}
