package methods;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class mgamethod {
	//global variable
	static String name;
	static String username;
	static String mobile;
	static String password;
	
	public mgamethod(String name, String mobile, String username, String password)
	{
		this.name = name;
		this.username = username;
		this.mobile = mobile;
		this.password = password;
	}
	
	public mgamethod()
	{
		//for connection purposes
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getUser()
	{
		return username;
	}
	
	public String getMobile()
	{
		return mobile;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void loadTable2(JTable tbl)
	{
		 String filePath = "./src/database/clientssign.txt";
	        File file = new File(filePath);
	        
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(file));
	            // get the first line
	            // get the columns name from the first line
	            // set columns name to the jtable model
	
	            DefaultTableModel model = (DefaultTableModel)tbl.getModel();

	            // get lines from txt file
	            Object[] tableLines = br.lines().toArray();
	            
	            // extratct data from lines
	            // set data to jtable model
	            for(int i = 0; i < tableLines.length; i++)
	            {
	                String line = tableLines[i].toString().trim();
	                String[] dataRow = line.split(",");
	                model.addRow(dataRow);
	            }
	            
	            
	        } catch (Exception ex) {
//	            Logger.getLogger(TextFileDataToJTable.class.getName()).log(Level.SEVERE, null, ex);
	        	JOptionPane.showMessageDialog(null, ex.toString(), "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
	        }
	}
	
	
 

}
	

