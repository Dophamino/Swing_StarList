package com.starList;

import javax.swing.*;
import java.awt.*;

public class frmSett {

        JFrame frmSett;

        frmSett(){
            //layout для расположения форм
            SpringLayout spLA = new SpringLayout();

            //
            // ЧАСТЬ ОПРЕДЕЛЕНИЯ ГРАФИКИ
            //
            frmSett = new JFrame("Настройки");
            frmSett.setMinimumSize(new Dimension(480,320));
            frmSett.setResizable(false);
            frmSett.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
            frmSett.setLayout(spLA);
            Container frmSettFrame = frmSett.getContentPane();

            JCheckBox cbDefOpen = new JCheckBox("Открывать файл по умолчанию");
            JTextField tfDefOpen = new JTextField();
            JButton btnDefOpen = new JButton("...");
            JCheckBox cbAutosave = new JCheckBox("Сохранять файл каждый раз при изменении");
            JTextField tfPass = new JTextField();
            JButton btnPass = new JButton("Изменить пароль");

            frmSett.add(cbDefOpen);
            frmSett.add(tfDefOpen);
            frmSett.add(btnDefOpen);
            frmSett.add(cbAutosave);
            frmSett.add(tfPass);
            frmSett.add(btnPass);

            spLA.putConstraint(SpringLayout.NORTH,cbDefOpen,16,
                    SpringLayout.NORTH,frmSettFrame);
            spLA.putConstraint(SpringLayout.WEST,cbDefOpen,16,
                    SpringLayout.WEST,frmSettFrame);
            spLA.putConstraint(SpringLayout.NORTH,tfDefOpen,8,
                    SpringLayout.SOUTH,cbDefOpen);
            spLA.putConstraint(SpringLayout.WEST,tfDefOpen,16,
                    SpringLayout.WEST,frmSettFrame);
            spLA.putConstraint(SpringLayout.EAST,tfDefOpen,-8,
                    SpringLayout.WEST,btnDefOpen);
            spLA.putConstraint(SpringLayout.NORTH,btnDefOpen,8,
                    SpringLayout.SOUTH,cbDefOpen);
            spLA.putConstraint(SpringLayout.EAST,btnDefOpen,-16,
                    SpringLayout.EAST,frmSettFrame);
            spLA.putConstraint(SpringLayout.NORTH,cbAutosave,8,
                    SpringLayout.SOUTH,tfDefOpen);
            spLA.putConstraint(SpringLayout.WEST,cbAutosave,16,
                    SpringLayout.WEST,frmSettFrame);
            spLA.putConstraint(SpringLayout.EAST,cbAutosave,-16,
                    SpringLayout.EAST,btnDefOpen);
            spLA.putConstraint(SpringLayout.WEST,tfPass,16,
                    SpringLayout.WEST,frmSettFrame);
            spLA.putConstraint(SpringLayout.NORTH,tfPass,8,
                    SpringLayout.SOUTH,cbAutosave);
            spLA.putConstraint(SpringLayout.EAST,tfPass,-8,
                    SpringLayout.WEST,btnPass);
            spLA.putConstraint(SpringLayout.NORTH,btnPass,8,
                    SpringLayout.SOUTH,cbAutosave);
            spLA.putConstraint(SpringLayout.EAST,btnPass,-16,
                    SpringLayout.EAST,frmSettFrame);
        }

        public void frmShow(){
            Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();

            frmSett.setVisible(true);
            frmSett.setLocation((int) (scrSize.getWidth()-frmSett.getWidth())/2,
                    (int) (scrSize.getHeight()-frmSett.getHeight())/2);
        }
}
