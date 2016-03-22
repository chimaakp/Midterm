package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.GregorianCalendar;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testSalary() throws PersonException {
		Date dts = new Date(1997,7,21);		
	
		Staff Stan = new Staff("Stan" , "Greg", "Johnson", dts, "Delaware", "1234567890", "jerome@udel.edu",
				"MWF", 3, 50500, dts, eTitle.MR);
		Staff Bernard = new Staff("", "", "", dts, "","", "", "", null, 20010, dts, eTitle.MR );
		Staff Shaquan = new Staff("", "", "", dts, "","", "", "", null, 12673, dts, eTitle.MRS);
		Staff Shaquisha = new Staff("", "", "", dts, "","", "", "", null, 100000, dts, eTitle.MRS );
		Staff Dave = new Staff("", "", "", dts, "","", "", "", null, 200000, dts, eTitle.MR );

		ArrayList<Staff> ST = new ArrayList<Staff>();
		ST.add(Stan);
		ST.add(Bernard);
		ST.add(Shaquan);
		ST.add(Shaquisha);
		ST.add(Dave);
		
		assertEquals((Stan.getSalary() + Bernard.getSalary() + Shaquan.getSalary() + Shaquisha.getSalary() + Dave.getSalary()) / 5 , 66,563.6);
		}
	
	@Test 
	public void testInval(){
		try{
			
		}
		catch(PersonException e){
			
		}
	}
	
	

}