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
   private ArrayList<InvoiceHeader> invoicesArray;

    public InvoiceHeaderTableModel(ArrayList<InvoiceHeader> invoicesArray) {
        this.invoicesArray = invoicesArray;
    }

    public ArrayList<InvoiceHeader> getInvoicesArray() {
        return invoicesArray;
    }

   

    @Override
    public int getRowCount() {
       return  invoicesArray.size();
    }

    @Override
    public int getColumnCount() {
         return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         InvoiceHeader row = invoicesArray.get(rowIndex);
         switch (columnIndex) {
            case 0:
              return  row.getNum();
            case 1:
              return  row.getCustomerName();
              case 2:
              return  row.getInvoiceDate();
              case 3: 
              return   row.getLineTotal();
              
            default:
                return "null";
        }
         
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
              return   "Invoice total";
              
            default:
                return "null";
        }
      }
    
}
