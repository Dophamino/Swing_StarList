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
        }

        public void frmShow(){
            Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();

            frmSett.setVisible(true);
            frmSett.setLocation((int) (scrSize.getWidth()-frmSett.getWidth())/2,
                    (int) (scrSize.getHeight()-frmSett.getHeight())/2);
        }
}
