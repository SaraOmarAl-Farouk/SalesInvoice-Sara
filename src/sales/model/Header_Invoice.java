package sales.model;

/**
 * 
 *  @Sara Gharieb
*/

import java.util.ArrayList;

public class Header_Invoice {
    private int idNumber;
    private String invoiceDate;
    private String invoiceCustomerName;
    private ArrayList<Line_Class> lines;
    
    public Header_Invoice() {
    }

    public Header_Invoice(int num, String date, String customer) {
        this.idNumber = num;
        this.invoiceDate = date;
        this.invoiceCustomerName = customer;
    }

    public double getInvoiceTotal() {
        double total = 0.0;
        for (Line_Class line : getLines()) {
            total += line.getLineTotal();
        }
        return total;
    }
    
    public ArrayList<Line_Class> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public String getCustomerName() {
        return invoiceCustomerName;
    }

    public void setCustomerName(String customer) {
        this.invoiceCustomerName = customer;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int num) {
        this.idNumber = num;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String date) {
        this.invoiceDate = date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "num=" + idNumber + ", date=" + invoiceDate + ", customer=" + invoiceCustomerName + '}';
    }
        
        public String getAsCSV() {
        return idNumber + "," + invoiceDate + "," + invoiceCustomerName;
    }
    }
    
   