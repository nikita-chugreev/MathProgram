package com.nikita;

import javax.swing.*;
import java.awt.*;

public class Calc extends JFrame {

    private int num = 1;
    private String keyCode;

    private JPanel panelEx;
    private JPanel panelBtn;
    private JTextField numOne, numTwo;
    private JTextField sign;
    private JTextField ans;
    private JLabel eql;
    private JButton btnOne, btnTwo, btnThree, btnFour, btnFive;
    private JButton btnSix, btnSeven, btnEight, btnNine, btnZero;
    private JButton btnPlus, btnMinus, btnMult, btnDiv, btnEq, btnPoint;
    private JButton btnDel;

    private String stringOne = "", stringTwo = "";

    public Calc(JPanel panelCalc) {
        decl();
        add(panelCalc);
        listeners();
    }

    public void decl() {
        numOne = new JTextField(5);
        numOne.setEnabled(false);
        numTwo = new JTextField(5);
        numTwo.setEnabled(false);
        sign = new JTextField("+");
        sign.setEnabled(false);
        ans = new JTextField(5);
        ans.setEnabled(false);
        eql = new JLabel(" = ");
        panelEx = new JPanel();
        panelBtn = new JPanel();
        panelBtn.setLayout(new GridLayout(5,4, 20, 20));
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btnZero = new JButton("0");
        btnPlus = new JButton("+");
        btnMinus = new JButton("-");
        btnMult = new JButton("*");
        btnDiv = new JButton("/");
        btnEq = new JButton("=");
        btnPoint = new JButton(".");
        btnDel = new JButton("<--");
    }

    public void add(JPanel panelCalc) {
        panelEx.add(numOne);
        panelEx.add(sign);
        panelEx.add(numTwo);
        panelEx.add(eql);
        panelEx.add(ans);

        panelBtn.add(btnSeven);
        panelBtn.add(btnEight);
        panelBtn.add(btnNine);
        panelBtn.add(btnDiv);
        panelBtn.add(btnFour);
        panelBtn.add(btnFive);
        panelBtn.add(btnSix);
        panelBtn.add(btnMult);
        panelBtn.add(btnOne);
        panelBtn.add(btnTwo);
        panelBtn.add(btnThree);
        panelBtn.add(btnMinus);
        panelBtn.add(btnZero);
        panelBtn.add(btnPoint);
        panelBtn.add(btnEq);
        panelBtn.add(btnPlus);
        panelBtn.add(btnDel);


        panelCalc.add(panelEx);
        panelCalc.add(panelBtn);
    }

    public void oper(String keyCode) {
        if (keyCode == "plus") {
                int intOne = Integer.parseInt(stringOne);
                int intTwo = Integer.parseInt(stringTwo);
                int intSum = intOne + intTwo;
                String stringSum = String.valueOf(intSum);
                ans.setText(stringSum);
        }
        if (keyCode == "minus") {
            int intOne = Integer.parseInt(stringOne);
            int intTwo = Integer.parseInt(stringTwo);
            int intSum = intOne - intTwo;
            String stringSum = String.valueOf(intSum);
            ans.setText(stringSum);
        }
        if (keyCode == "mult") {
            int intOne = Integer.parseInt(stringOne);
            int intTwo = Integer.parseInt(stringTwo);
            int intSum = intOne * intTwo;
            String stringSum = String.valueOf(intSum);
            ans.setText(stringSum);
        }
        if (keyCode == "div") {
            int intOne = Integer.parseInt(stringOne);
            int intTwo = Integer.parseInt(stringTwo);
            int intSum = intOne / intTwo;
            String stringSum = String.valueOf(intSum);
            ans.setText(stringSum);
        }

    }

    public void listeners() {

        btnPlus.addActionListener(e -> {
            sign.setText("+");
            num = 2;
            keyCode = "plus";
        });

        btnMinus.addActionListener(e -> {
            sign.setText("-");
            num = 2;
            keyCode = "minus";
        });

        btnMult.addActionListener(e -> {
            sign.setText("*");
            num = 2;
            keyCode = "mult";
        });

        btnDiv.addActionListener(e -> {
            sign.setText("/");
            num = 2;
            keyCode = "div";
        });

        //----------------------------------

        btnOne.addActionListener(e -> {
        if (num == 1) {
            stringOne += "1";
            numOne.setText(stringOne);
        } else {
            stringTwo += 1;
            numTwo.setText(stringTwo);
        }
        });

        btnTwo.addActionListener(e -> {
            if (num == 1) {
                stringOne += "2";
                numOne.setText(stringOne);
            } else {
                stringTwo += "2";
                numTwo.setText(stringTwo);
            }
        });

        btnThree.addActionListener(e -> {
            if (num == 1) {
                stringOne += "3";
                numOne.setText(stringOne);
            } else {
                stringTwo += "3";
                numTwo.setText(stringTwo);
            }
        });

        btnFour.addActionListener(e -> {
            if (num == 1) {
                stringOne += "4";
                numOne.setText(stringOne);
            } else {
                stringTwo += "4";
                numTwo.setText(stringTwo);
            }
        });

        btnFive.addActionListener(e -> {
            if (num == 1) {
                stringOne += "5";
                numOne.setText(stringOne);
            } else {
                stringTwo += "5";
                numTwo.setText(stringTwo);
            }
        });

        btnSix.addActionListener(e -> {
            if (num == 1) {
                stringOne += "6";
                numOne.setText(stringOne);
            } else {
                stringTwo += "6";
                numTwo.setText(stringTwo);
            }
        });

        btnSeven.addActionListener(e -> {
            if (num == 1) {
                stringOne += "7";
                numOne.setText(stringOne);
            } else {
                stringTwo += "7";
                numTwo.setText(stringTwo);
            }
        });

        btnEight.addActionListener(e -> {
            if (num == 1) {
                stringOne += "8";
                numOne.setText(stringOne);
            } else {
                stringTwo += "8";
                numTwo.setText(stringTwo);
            }
        });

        btnNine.addActionListener(e -> {
            if (num == 1) {
                stringOne += "9";
                numOne.setText(stringOne);
            } else {
                stringTwo += "9";
                numTwo.setText(stringTwo);
            }
        });

        btnZero.addActionListener(e -> {
            if (num == 1) {
                stringOne += "0";
                numOne.setText(stringOne);
            } else {
                stringTwo += "0";
                numTwo.setText(stringTwo);
            }
        });

        btnDel.addActionListener(e -> {
            if (num == 1) {
                if (stringOne.length() > 0) {
                    String string = stringOne.substring(0, stringOne.length() - 1);
                    stringOne = string;
                    numOne.setText(stringOne);
                } else {
                    JOptionPane.showMessageDialog(null, "Ошибка");
                }
            } else {
                if (stringTwo.length() > 0) {
                    String string = stringTwo.substring(0, stringTwo.length() - 1);
                    stringTwo = string;
                    numTwo.setText(stringTwo);
                } else {
                    JOptionPane.showMessageDialog(null, "Ошибка");
                }
            }
        });

        btnEq.addActionListener(e -> oper(keyCode));
    }


}
