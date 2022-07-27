/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model.view;

import com.mycompany.mavenproject1.MyFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Assem
 */
public class LineDialog extends JDialog{
   private JTextField itemNameField;
   private JTextField itemCountField;
   private JTextField itemPriceField;
   private JLabel itemNameLable;
   private JLabel itemCountLable;
   private JLabel itemPriceLable;
   private JButton okBtn;
   private  JButton cancelBtn;

    public LineDialog(MyFrame myframe) {
itemNameField = new JTextField(20);
itemCountField = new JTextField(20);
itemPriceField = new JTextField(20);
itemNameLable = new JLabel("Item Name") ;
itemCountLable = new   JLabel("Item Count") ;
itemPriceLable = new  JLabel("Item Price") ;


   
           okBtn =new  JButton("OK");
        cancelBtn=new JButton("Cancel");
        cancelBtn.addActionListener(myframe);
        
        
        okBtn.setActionCommand("okCreateline");
        cancelBtn.setActionCommand("cancleCreateline");
        cancelBtn.addActionListener(myframe);
        okBtn.addActionListener(myframe);
        setLayout(new GridLayout(4,2));
        add(itemNameLable);
        add(itemNameField);
        add(itemCountLable);
        add(itemCountField);
        add(itemPriceLable);
        add(itemPriceField);
        add(okBtn);
        add(cancelBtn);
        
              pack();

 
    }

    public JTextField getItemNameField() {
        return itemNameField;
    }

    public JTextField getItemCountField() {
        return itemCountField;
    }

    public JTextField getItemPriceField() {
        return itemPriceField;
    }
}
