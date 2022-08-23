package sales.model;

/**
 * 
 * @author IslamAmin
*/

public class Line_Class {
    private String lineItem;
    private double linePrice;
    private int lineCount;
    private Header_Invoice invoice;

    public Line_Class() {
    }

    public Line_Class(String item, double price, int count, Header_Invoice invoice) {
        this.lineItem = item;
        this.linePrice = price;
        this.lineCount = count;
        this.invoice = invoice;
    }

    public double getLineTotal() {
        return linePrice * lineCount;
    }
    
    public int getLineCount() {
        return lineCount;
    }

    public void setLineCount(int count) {
        this.lineCount = count;
    }

    public String getLineItem() {
        return lineItem;
    }

    public void setLineItem(String item) {
        this.lineItem = item;
    }

    public double getLinePrice() {
        return linePrice;
    }

    public void setLinePrice(double price) {
        this.linePrice = price;
    }

    @Override
    public String toString() {
        return "Line{" + "num=" + invoice.getIdNumber() + ", item=" + lineItem + ", price=" + linePrice + ", count=" + lineCount + '}';
    }

    public Header_Invoice getInvoice() {
        return invoice;
    }
    public String getAsCSV() {
        return invoice.getIdNumber() + "," + lineItem + "," + linePrice + "," + lineCount;
    }
    
    
    
}