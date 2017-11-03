package com.nikita;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    JPanel panelCalc;
    JPanel panelFunc;
    JPanel panelDeriv;
    JPanel panelEq;

    Window() {
        setSize(1200, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mathematics");
        Container c = getContentPane();
        setLocationRelativeTo(c);
        c.setLayout(new GridLayout(1,4));

        panelCalc = new JPanel();
        panelCalc.setBorder(BorderFactory.createEtchedBorder());
        panelCalc.setBorder(BorderFactory.createTitledBorder("Калькулятор"));
        panelFunc = new JPanel();
        panelFunc.setBorder(BorderFactory.createEtchedBorder());
        panelFunc.setBorder(BorderFactory.createTitledBorder("Значения функций"));
        panelDeriv = new JPanel();
        panelDeriv.setBorder(BorderFactory.createEtchedBorder());
        panelDeriv.setBorder(BorderFactory.createTitledBorder("Вычисление производной"));
        panelEq = new JPanel();
        panelEq.setBorder(BorderFactory.createEtchedBorder());
        panelEq.setBorder(BorderFactory.createTitledBorder("Решить уравнение"));

        c.add(panelCalc);
        c.add(panelFunc);
        c.add(panelDeriv);
        c.add(panelEq);

        new Calc(panelCalc);
        new Func(panelFunc);

        setVisible(true);
    }

}
