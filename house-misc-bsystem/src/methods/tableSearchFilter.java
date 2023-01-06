package methods;

import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class tableSearchFilter {
	public void searchAndFilter(JTable tblName, String Query)
	{
		DefaultTableModel dm = (DefaultTableModel)tblName.getModel();
		TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dm);
		tblName.setRowSorter(tr);
			
		tr.setRowFilter(RowFilter.regexFilter(Query));
		
	}
}
