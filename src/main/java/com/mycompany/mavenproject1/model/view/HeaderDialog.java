
package com.mycompany.mavenproject1.model.view;

import com.mycompany.mavenproject1.MyFrame;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HeaderDialog  extends JDialog  {
      private JTextField custmorNameFiled;
      private JTextField invoDateFiled;
      private JLabel invoDateLable;
      private  JLabel custmorNameTable;
      private JButton okBtn;
      private  JButton cancelBtn;

    public HeaderDialog(MyFrame myframe) {
        
        custmorNameTable = new  JLabel("Customer Name: ");
        custmorNameFiled    =  new JTextField(20);
        invoDateFiled  =  new JTextField(20);
        invoDateLable=   new   JLabel("Invoice Date: ");   
        custmorNameFiled =new JTextField(20);
        okBtn =new  JButton("OK");
        cancelBtn=new JButton("Cancel");
        cancelBtn.addActionListener(myframe);
        
        
        okBtn.setActionCommand("okCreateIvoice");
        cancelBtn.setActionCommand("cancleCreateInvoice");
        cancelBtn.addActionListener(myframe);
        okBtn.addActionListener(myframe);
        setLayout(new GridLayout(3,2));
        
        add(invoDateLable);
         add( invoDateFiled);
          add(custmorNameTable);
           add(custmorNameFiled);
            add(okBtn);
             add(cancelBtn);
              pack();
             
       
    }

    public JTextField getCustmorNameFiled() {
        return custmorNameFiled;
    }

    public JTextField getInvoDateFiled() {
        return invoDateFiled;
    }
    
    
}
