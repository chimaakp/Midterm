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
	public void test() {
	
	Staff Stan = new Staff("Stan" , "Greg", "Johnson", Calendar(1997, 7,21), "Delaware", "1234567890", "jerome@udel.edu",
			"MWF", 3, 50500, Calendar(2015, 3, 21), eTitle.MR);
	

	ArrayList<Staff> ST = new ArrayList<Staff>();
	ST.add(Stan);
	ST.add(Bernard);
	ST.add(Shaquan);
	ST.add(Shaquisha);
	ST.add(Dave);
	}	




}