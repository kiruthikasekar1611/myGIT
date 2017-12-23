package utilpackage;

import org.testng.annotations.DataProvider;

public class GetData {
	
	@DataProvider(name="fetchDataForCreateLead")
	public static Object[][] getDatacreatelead(){
		
		Object [][]data=new Object[2][5];
		
		data[0][0]="Maveric Systems";
		data[0][1]="Aliaaaa";
		data[0][2]="NIL";
		data[0][3]="Cold Call";
		data[0][4]=4;
		
		data[1][0]="CGI LImited";
		data[1][1]="Anjana shree";
		data[1][2]="CBI";
		data[1][3]="Website";
		data[1][4]=2;
		
		return data;		
	}
	
	@DataProvider(name="fetchDataForEditLead")
	public static Object[][] getDataEditLead(){
		
		Object [][]obj=new Object[1][2];		
		obj[0][0]="a";
		obj[0][1]="AGILYSYS Private Limited";
		return obj;
	}
	
	
	@DataProvider(name="fetchDataForDeleteLead")
	public static Object[] getDataDeleteLead(){
		Object [] str=new Object[1];
		str[0]="91";		
		return str;
	}
	
	@DataProvider(name="fetchDataForDuplicateLead")
	public static Object[] getDataDuplicateLead(){
		Object [] maildata=new Object[2];
		maildata[0]="a";
		maildata[1]="b";
		
		return maildata;
	}
	
	@DataProvider(name="fetchDataForMergeLead")
	public static Object[][] getDatamergelead(){
		
		Object [][]id=new Object[2][2];
		
		id[0][0]="10264";
		id[0][1]="10265";

		/*id[1][0]="11900";
		id[1][1]="11901";*/
		
		return id;		
	}
	
	

}
