package com.starList;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null,
                    "Критическая ошибка загрузки интерфейса:\n"+ex,
                    "Ошибка запуска",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        frmMain frmMain = new frmMain();
        frmMain.frmShow();
    }
}
