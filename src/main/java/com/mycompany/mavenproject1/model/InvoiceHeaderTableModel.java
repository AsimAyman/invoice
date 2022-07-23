/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Assem
 */
public class InvoiceHeaderTableModel extends AbstractTableModel{
   private ArrayList<InvoiceHeader>invoicesArray;

    public InvoiceHeaderTableModel(ArrayList<InvoiceHeader> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

   

    @Override
    public int getRowCount() {
       return 3;
    }

    @Override
    public int getColumnCount() {
         return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         return "test";
    }
    @Override
      public String getColumnName(int colum){
          switch (colum) {
            case 0:
              return  "Invoice Num";
            case 1:
              return  "Invoice Date";
              case 2:
              return  "Customer Name";
              case 3:
             
            default:
                return "null";
        }
      }
    
}
