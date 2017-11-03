package com.nikita;

import javax.swing.*;

public class Func extends JFrame {

    private JLabel labelHello;
    private JLabel yeq;
    private JLabel xplus;
    private JTextField k;
    private JTextField b;
    private JButton enter;
    //private JPanel data;

    public Func(JPanel panelFunc) {
        labelHello = new JLabel("Введите функцию: ");
        yeq = new JLabel("y = ");
        xplus = new JLabel("x + ");
        k = new JTextField(2);
        b = new JTextField(2);
        enter = new JButton("Вывести информацию");
        panelFunc.add(labelHello);
        panelFunc.add(yeq);
        panelFunc.add(k);
        panelFunc.add(xplus);
        panelFunc.add(b);
        panelFunc.add(enter);
        //panelFunc.add(data);
        listeners(panelFunc);

    }

    private void listeners(JPanel panelFunc) {
        enter.addActionListener(e -> info(panelFunc));
    }

    private void info(JPanel panelFunc) {
        /*for (int i=-10; i<10; i+=5) {
            JLabel eq = new JLabel(" | ");
            JLabel label1 = new JLabel(String.valueOf(i));
            JLabel label2 = new JLabel(String.valueOf(comp(i)));
            data.add(label1);
            data.add(eq);
            data.add(label2);
        }*/

        JLabel label = new JLabel("График - прямая");
        panelFunc.add(label);
    }

    private int comp(int x) {
        int kint = Integer.parseInt(k.getText());
        int bint = Integer.parseInt(b.getText());
        return kint*x + bint;
    }
}
