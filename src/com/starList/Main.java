package com.starList;

import javax.swing.*;

public class Main {

    static String PASS;
    static {
        PASS="666";
    }

    public static void main(String[] args) {
        String passInput;

        try{
            UIManager.setLookAndFeel(
                    "javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Критическая ошибка загрузки интерфейса:\n"+ex,
                    "Ошибка запуска",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        passInput = JOptionPane.showInputDialog(null,
                "Введите пароль:",
                "Авторизация",JOptionPane.QUESTION_MESSAGE);
        if (passInput!=null&&passInput.equals(PASS)){
            frmMain frmMain = new frmMain();
            frmMain.frmShow();
        } else {
            JOptionPane.showMessageDialog(null,
                    "Неверный пароль",
                    "Ошибка авторизации",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }

    }
}
