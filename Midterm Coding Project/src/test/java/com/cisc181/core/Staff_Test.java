package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void testSalary() {
	
	Staff Stan = new Staff("Stan" , "Greg", "Johnson", Date., "Delaware", "1234567890", "jerome@udel.edu",
			"MWF", 3, 50500, Date, eTitle.MR);
	Staff Bernard = new Staff("", "", "", null, "","", "", "", null, 20010, null, eTitle.MR );
	Staff Shaquan = new Staff("", "", "", null, "","", "", "", null, 12673, null, eTitle.MRS);
	Staff Shaquisha = new Staff("", "", "", null, "","", "", "", null, 100000, null, eTitle.MRS );
	Staff Dave = new Staff("", "", "", null, "","", "", "", null, 200000, null, eTitle.MR );

	ArrayList<Staff> ST = new ArrayList<Staff>();
	ST.add(Stan);
	ST.add(Bernard);
	ST.add(Shaquan);
	ST.add(Shaquisha);
	ST.add(Dave);
	
	assertEquals((Stan.getSalary() + Bernard.getSalary() + Shaquan.getSalary() + Shaquisha.getSalary() + Dave.getSalary()) / 5 , 66,563.6);
	}	
	
	

}