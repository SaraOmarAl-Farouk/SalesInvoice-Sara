
package sales.model;
/**
 * 
 * @Sara Gharieb
*/

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LinesTable_Class extends AbstractTableModel {

    private ArrayList<Line_Class> linesObj;
    private String[] columns = {"No.", "Item Name", "Item Price", "Count", "Item Total"};

    public LinesTable_Class(ArrayList<Line_Class> lines) {
        this.linesObj = lines;
    }
    public ArrayList<Line_Class> getLines() {
        return linesObj;
    }
    
    @Override
    public int getRowCount() {
        return linesObj.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int x) {
        return columns[x];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Line_Class X = linesObj.get(rowIndex);
        
        switch(columnIndex) {
            case 0: return X.getInvoice().getIdNumber();
            case 1: return X.getLineItem();
            case 2: return X.getLinePrice();
            case 3: return X.getLineCount();
            case 4: return X.getLineTotal();
            default : return "";
        }
    }
    
}