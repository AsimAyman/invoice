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
public class InvoiceLineTableModel extends AbstractTableModel{
       private ArrayList<InvoiceLine> invoicesLines;

    public InvoiceLineTableModel(ArrayList<InvoiceLine> invoicesLines) {
        this.invoicesLines = invoicesLines;
    }

    public  ArrayList<InvoiceLine> getinvoicesLines() {
        return invoicesLines;
    }

   

    @Override
    public int getRowCount() {
       return  invoicesLines.size();
    }

    @Override
    public int getColumnCount() {
         return  4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         InvoiceLine row = invoicesLines.get(rowIndex);
         switch (columnIndex) {
            case 0:
              return  row.getItemName();
            case 1:
              return  row.getItemPrice();
              case 2:
              return  row.getItemcount();
              case 3: 
              return   row.getItemcount();
              
            default:
                return "null";
        }
         
    }
    @Override
      public String getColumnName(int colum){
          switch (colum) {
            case 0:
              return  "Item Name";
            case 1:
              return  "Item price";
              case 2:
              return  "Item Count";
              case 3: 
              return   "Item Total";
              
            default:
                return "null";
        }
      }
   
    
}
