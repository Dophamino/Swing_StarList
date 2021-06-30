package com.starList;

import  javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class frmMain {
    JFrame frmMain;

    frmMain(){
        //layout для расположения форм
        SpringLayout spLA = new SpringLayout();
        //layout для расположения внутри "полей кнопок"
        SpringLayout spLA2 = new SpringLayout();

        //
        // ЧАСТЬ ОПРЕДЕЛЕНИЯ ГРАФИКИ
        //
        //фиксированный размер "полей кнопок"
        final Dimension BTS_PANELS_SIZE = new Dimension(120,120);

        frmMain = new JFrame("Менеджер коллекций");
        frmMain.setMinimumSize(new Dimension(640,480));
        frmMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frmMain.setLayout(spLA);
        Container frmMainFrame = frmMain.getContentPane();

        JPanel pnBtnUp = new JPanel();
        pnBtnUp.setMinimumSize(BTS_PANELS_SIZE);
        pnBtnUp.setPreferredSize(BTS_PANELS_SIZE);
        pnBtnUp.setLayout(spLA2);

        JPanel pnBtnMid = new JPanel();
        pnBtnMid.setMinimumSize(BTS_PANELS_SIZE);
        pnBtnMid.setPreferredSize(BTS_PANELS_SIZE);
        pnBtnMid.setLayout(spLA2);

        JPanel pnBtnBtm = new JPanel();
        pnBtnBtm.setMinimumSize(BTS_PANELS_SIZE);
        pnBtnBtm.setPreferredSize(BTS_PANELS_SIZE);
        pnBtnBtm.setLayout(spLA2);

        JPanel pnLeft = new JPanel();
        pnLeft.setMinimumSize(new Dimension(160,400));
        pnLeft.setPreferredSize(pnLeft.getMinimumSize());
        pnLeft.setLayout(new BorderLayout());

        JPanel pnRight = new JPanel();
        pnRight.setMinimumSize(new Dimension(160,400));
        pnRight.setPreferredSize(pnRight.getMinimumSize());
        pnRight.setLayout(new BorderLayout());

        frmMain.add(pnLeft);
        frmMain.add(pnBtnUp);
        frmMain.add(pnBtnMid);
        frmMain.add(pnBtnBtm);
        frmMain.add(pnRight);

        //ограничения для полей внутри окна
        spLA.putConstraint(SpringLayout.HORIZONTAL_CENTER,pnBtnUp,0,
                SpringLayout.HORIZONTAL_CENTER,frmMainFrame);
        spLA.putConstraint(SpringLayout.NORTH,pnBtnUp,16,
                SpringLayout.NORTH,frmMainFrame);

        spLA.putConstraint(SpringLayout.HORIZONTAL_CENTER,pnBtnMid,0,
                SpringLayout.HORIZONTAL_CENTER,frmMainFrame);
        spLA.putConstraint(SpringLayout.VERTICAL_CENTER,pnBtnMid,0,
                SpringLayout.VERTICAL_CENTER,frmMainFrame);

        spLA.putConstraint(SpringLayout.HORIZONTAL_CENTER,pnBtnBtm,0,
                SpringLayout.HORIZONTAL_CENTER,frmMainFrame);
        spLA.putConstraint(SpringLayout.SOUTH,pnBtnBtm,-16,
                SpringLayout.SOUTH,frmMainFrame);

        spLA.putConstraint(SpringLayout.NORTH,pnLeft,16,
                SpringLayout.NORTH,frmMainFrame);
        spLA.putConstraint(SpringLayout.WEST,pnLeft,16,
                SpringLayout.WEST,frmMainFrame);
        spLA.putConstraint(SpringLayout.SOUTH,pnLeft,-16,
                SpringLayout.SOUTH,frmMainFrame);
        spLA.putConstraint(SpringLayout.EAST,pnLeft,-16,
                SpringLayout.WEST,pnBtnMid);

        spLA.putConstraint(SpringLayout.NORTH,pnRight,16,
                SpringLayout.NORTH,frmMainFrame);
        spLA.putConstraint(SpringLayout.EAST,pnRight,-16,
                SpringLayout.EAST,frmMainFrame);
        spLA.putConstraint(SpringLayout.SOUTH,pnRight,-16,
                SpringLayout.SOUTH,frmMainFrame);
        spLA.putConstraint(SpringLayout.WEST,pnRight,16,
                SpringLayout.EAST,pnBtnMid);

        //графика верхнего поля кнопок
        final Dimension BTN_OTHER_SIZE = new Dimension(120,32);
        JButton btnAdd = new JButton("Добавить");
            btnAdd.setPreferredSize(BTN_OTHER_SIZE);
        JButton btnRen = new JButton("Переименовать");
            btnRen.setPreferredSize(BTN_OTHER_SIZE);
        JButton btnDel = new JButton("Удалить");
            btnDel.setPreferredSize(BTN_OTHER_SIZE);

        pnBtnUp.add(btnAdd);
        pnBtnUp.add(btnRen);
        pnBtnUp.add(btnDel);

        spLA2.putConstraint(SpringLayout.NORTH,btnAdd,0,
                SpringLayout.NORTH,pnBtnUp);
        spLA2.putConstraint(SpringLayout.HORIZONTAL_CENTER,btnAdd,0,
                SpringLayout.HORIZONTAL_CENTER,pnBtnUp);
        spLA2.putConstraint(SpringLayout.VERTICAL_CENTER,btnRen,0,
                SpringLayout.VERTICAL_CENTER,pnBtnUp);
        spLA2.putConstraint(SpringLayout.HORIZONTAL_CENTER,btnRen,0,
                SpringLayout.HORIZONTAL_CENTER,pnBtnUp);
        spLA2.putConstraint(SpringLayout.SOUTH,btnDel,0,
                SpringLayout.SOUTH,pnBtnUp);
        spLA2.putConstraint(SpringLayout.HORIZONTAL_CENTER,btnDel,0,
                SpringLayout.HORIZONTAL_CENTER,pnBtnUp);

        //графика среднего поля кнопок
        final Dimension BTN_ARROW_SIZE = new Dimension(40,40);
        JButton btnUp = new JButton(String.valueOf('\u2191'));
            btnUp.setPreferredSize(BTN_ARROW_SIZE);
        JButton btnDn = new JButton(String.valueOf('\u2193'));
            btnDn.setPreferredSize(BTN_ARROW_SIZE);
        JButton btnLeft = new JButton(String.valueOf('\u2190'));
            btnLeft.setPreferredSize(BTN_ARROW_SIZE);
        JButton btnRight = new JButton(String.valueOf('\u2192'));
            btnRight.setPreferredSize(BTN_ARROW_SIZE);

        pnBtnMid.add(btnUp);
        pnBtnMid.add(btnDn);
        pnBtnMid.add(btnLeft);
        pnBtnMid.add(btnRight);

        spLA2.putConstraint(SpringLayout.NORTH,btnUp,0,
                SpringLayout.NORTH,pnBtnMid);
        spLA2.putConstraint(SpringLayout.HORIZONTAL_CENTER,btnUp,0,
                SpringLayout.HORIZONTAL_CENTER,pnBtnMid);
        spLA2.putConstraint(SpringLayout.SOUTH,btnDn,0,
                SpringLayout.SOUTH,pnBtnMid);
        spLA2.putConstraint(SpringLayout.HORIZONTAL_CENTER,btnDn,0,
                SpringLayout.HORIZONTAL_CENTER,pnBtnMid);
        spLA2.putConstraint(SpringLayout.WEST,btnLeft,0,
                SpringLayout.WEST,pnBtnMid);
        spLA2.putConstraint(SpringLayout.VERTICAL_CENTER,btnLeft,0,
                SpringLayout.VERTICAL_CENTER,pnBtnMid);
        spLA2.putConstraint(SpringLayout.EAST,btnRight,0,
                SpringLayout.EAST,pnBtnMid);
        spLA2.putConstraint(SpringLayout.VERTICAL_CENTER,btnRight,0,
                SpringLayout.VERTICAL_CENTER,pnBtnMid);

        //графика нижнего поля кнопок
        JButton btnSave = new JButton("Сохранить");
        btnSave.setPreferredSize(BTN_OTHER_SIZE);
        JButton btnLoad = new JButton("Загрузить");
        btnLoad.setPreferredSize(BTN_OTHER_SIZE);
        JButton btnSett = new JButton("Настройки");
        btnSett.setPreferredSize(BTN_OTHER_SIZE);

        pnBtnBtm.add(btnSave);
        pnBtnBtm.add(btnLoad);
        pnBtnBtm.add(btnSett);

        spLA2.putConstraint(SpringLayout.NORTH,btnSave,0,
                SpringLayout.NORTH,pnBtnBtm);
        spLA2.putConstraint(SpringLayout.HORIZONTAL_CENTER,btnSave,0,
                SpringLayout.HORIZONTAL_CENTER,pnBtnBtm);
        spLA2.putConstraint(SpringLayout.VERTICAL_CENTER,btnLoad,0,
                SpringLayout.VERTICAL_CENTER,pnBtnBtm);
        spLA2.putConstraint(SpringLayout.HORIZONTAL_CENTER,btnLoad,0,
                SpringLayout.HORIZONTAL_CENTER,pnBtnBtm);
        spLA2.putConstraint(SpringLayout.SOUTH,btnSett,0,
                SpringLayout.SOUTH,pnBtnBtm);
        spLA2.putConstraint(SpringLayout.HORIZONTAL_CENTER,btnSett,0,
                SpringLayout.HORIZONTAL_CENTER,pnBtnBtm);

        //Графика левого списка
        DefaultListModel<String> lmLeft = new DefaultListModel<>();
            for (int i=0; i<=15; i++){
                lmLeft.addElement("element"+i);
            }
        JList<String> listLeft = new JList<>(lmLeft);
        listLeft.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane spLeft = new JScrollPane(listLeft);
        pnLeft.add(spLeft);

        //Графика правого списка
        DefaultListModel<String> lmRight = new DefaultListModel<>();
        for (int i=15; i<=30; i++){
            lmRight.addElement("element"+i);
        }
        JList<String> listRight = new JList<>(lmRight);
        listRight.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        JScrollPane spRight = new JScrollPane(listRight);
        pnRight.add(spRight);

        //
        // ФУНКЦИОНАЛЬНАЯ ЧАСТЬ
        //
        //отключаем кнопки заранее
        btnUp.setEnabled(false);
        btnDn.setEnabled(false);
        btnLeft.setEnabled(false);
        btnRight.setEnabled(false);
        btnRen.setEnabled(false);
        btnDel.setEnabled(false);

        //позволяет выбор только в одном из списков одновременно, включает кнопки
        listLeft.addListSelectionListener(e -> {
            int currInd = listLeft.getSelectedIndex();
            if ((listRight.getSelectedIndex()>=0)&&(currInd>=0)) {listRight.clearSelection();}
            btnLeft.setEnabled(false);
            if (currInd>=0) {
                btnRight.setEnabled(true);
                btnDel.setEnabled(true);
                btnRen.setEnabled(true);
                btnUp.setEnabled(currInd > 0);
                btnDn.setEnabled(currInd < (lmLeft.getSize() - 1));
            } else {
                    btnRight.setEnabled(false);
                    btnDel.setEnabled(false);
                    btnRen.setEnabled(false);
                    btnUp.setEnabled(false);
                    btnDn.setEnabled(false);
                }
        });
        listRight.addListSelectionListener(e ->{
            int currInd = listRight.getSelectedIndex();
            if ((listLeft.getSelectedIndex()>=0)&&(currInd>=0)) {listLeft.clearSelection();}
            btnRight.setEnabled(false);
            if (currInd>=0) {
                btnLeft.setEnabled(true);
                btnDel.setEnabled(true);
                btnRen.setEnabled(true);
                btnUp.setEnabled(currInd > 0);
                btnDn.setEnabled(currInd < (lmRight.getSize() - 1));
            } else {
                btnLeft.setEnabled(false);
                btnDel.setEnabled(false);
                btnRen.setEnabled(false);
                btnUp.setEnabled(false);
                btnDn.setEnabled(false);
            }
        });

        //функционал кнопок со стрелками
        //кнопка "влево"
        btnLeft.addActionListener(e ->{
            if (listRight.getSelectedIndex()>=0){
                int index = listRight.getSelectedIndex();
                String moveVal = listRight.getSelectedValue();
                lmLeft.addElement(moveVal);
                lmRight.remove(index);
                listRight.setSelectedIndex(index);
            }
        });
        //кнопка "вправо"
        btnRight.addActionListener(e ->{
            if (listLeft.getSelectedIndex()>=0){
                int index = listLeft.getSelectedIndex();
                String moveVal = listLeft.getSelectedValue();
                lmRight.addElement(moveVal);
                lmLeft.remove(index);
                listLeft.setSelectedIndex(index);
            }
        });
        //кнопка "вверх"
        btnUp.addActionListener(e -> {
            String currValue;
            int indLeft = listLeft.getSelectedIndex();
            int indRight = listRight.getSelectedIndex();
            if (indLeft>0) {
                currValue=listLeft.getSelectedValue();
                lmLeft.remove(indLeft);
                lmLeft.add(indLeft-1,currValue);
                listLeft.setSelectedIndex(indLeft-1);
            } else if (indRight>0) {
                currValue=listRight.getSelectedValue();
                lmRight.remove(indRight);
                lmRight.add(indRight-1,currValue);
                listRight.setSelectedIndex(indRight-1);
            }
        });
        //кнопка "вниз"
        btnDn.addActionListener(e -> {
            String currValue;
            int indLeft = listLeft.getSelectedIndex();
            int indRight = listRight.getSelectedIndex();
            if ((indLeft>=0)&&(indLeft<(lmLeft.getSize()-1))) {
                currValue=listLeft.getSelectedValue();
                lmLeft.remove(indLeft);
                lmLeft.add(indLeft+1,currValue);
                listLeft.setSelectedIndex(indLeft+1);
            } else if ((indRight>=0)&&(indRight<(lmRight.getSize()-1))) {
                currValue=listRight.getSelectedValue();
                lmRight.remove(indRight);
                lmRight.add(indRight+1,currValue);
                listRight.setSelectedIndex(indRight+1);
            }
        });

        //функционал кнопок текущего элемента
        //кнопка "добавить"
        btnAdd.addActionListener(e ->{
            String buffText=getClipBoard();
            if (buffText.length()>50) {buffText="";}
            String newValue = JOptionPane.showInputDialog(frmMain,"Введи имя нового элемента:",buffText);
            if ((newValue!=null)&&(!newValue.equals(""))) {
                if (lmLeft.contains(newValue)) {
                    JOptionPane.showMessageDialog(frmMain,
                            "Такой элемент уже есть в ЛЕВОМ списке",
                            "Не добавлень", JOptionPane.WARNING_MESSAGE);
                } else if (lmRight.contains(newValue)) {
                    JOptionPane.showMessageDialog(frmMain,
                            "Такой элемент уже есть в ПРАВОМ списке",
                            "Не добавлень", JOptionPane.WARNING_MESSAGE);
                } else {
                    lmLeft.addElement(newValue);
                }
            }
        });
        //кнопка "переименовать"
        btnRen.addActionListener(e ->{
            String currValue;
            String newValue;
            int indLeft = listLeft.getSelectedIndex();
            int indRight = listRight.getSelectedIndex();
            if (indLeft>=0) {
                currValue=listLeft.getSelectedValue();
                newValue = JOptionPane.showInputDialog("Введи новое имя:",currValue);
                if ((newValue!=null)&&(!newValue.equals(""))) {
                    lmLeft.remove(indLeft);
                    lmLeft.add(indLeft,newValue);
                    listLeft.setSelectedIndex(indLeft);
                }

            } else if (indRight>=0) {
                currValue=listRight.getSelectedValue();
                newValue = JOptionPane.showInputDialog("Введи новое имя:",currValue);
                if ((newValue!=null)&&(!newValue.equals(""))) {
                    lmRight.remove(indRight);
                    lmRight.add(indRight,newValue);
                    listRight.setSelectedIndex(indRight);
                }
            }
        });
        //кнопка "удалить"
        btnDel.addActionListener(e ->{
            int indLeft = listLeft.getSelectedIndex();
            int indRight = listRight.getSelectedIndex();
            if (indLeft>=0) {
                lmLeft.remove(indLeft);
                listLeft.setSelectedIndex(indLeft);
            } else if (indRight>=0) {
                    lmRight.remove(indRight);
                    listRight.setSelectedIndex(indRight);
            }
        });
    }

    public void frmShow(){
        Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();

        frmMain.setVisible(true);
        frmMain.setLocation((int) (scrSize.getWidth()-frmMain.getWidth())/2,
                (int) (scrSize.getHeight()-frmMain.getHeight())/2);
    }

    public String getClipBoard(){
        try {
            return (String)Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
        } catch (HeadlessException e) {
            return "";
        } catch (UnsupportedFlavorException e) {
            return "";
        } catch (IOException e) {
            return "";
        }
    }
}
