package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.test.dto.Employee;


public class GenerateExcel {
	
	 private static final String FILE_NAME = "D://app//static_content//activity_documents//test.xls";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         ExcelOperationUtil.generateExcel(FILE_NAME, getEmployeeDList());
         ExcelOperationUtil.readDataFromExcel(FILE_NAME);
	}
	public static List<Employee> getEmployeeDList() {
   	 List<Employee> empList = new ArrayList<>();
   	 empList.add(new Employee(101l, 7416308674l, "Santosh Kumar Verma","20-05-1993"));
   	 empList.add(new Employee(102l, 7416308624l, "Sumit Kumar Verma","20-05-1993"));
   	 empList.add(new Employee(103l, 7416308664l, "Ganesh Kumar Verma","20-05-1993"));
   	 empList.add(new Employee(104l, 7416308694l, "Sunil Kumar Verma","20-05-1993"));
   	 empList.add(new Employee(105l, 7416308654l, "Ranjeet Kumar","20-05-1993"));
   	 empList.add(new Employee(106l, 7416308678l, "Bhim Kumar Verma","20-05-1993"));
   	 empList.add(new Employee(107l, 7416308675l, "OP Verma","20-05-1993"));
   	 empList.add(new Employee(108l, 7416308679l, "Sanoj Kumar","20-05-1993"));
   	 empList.add(new Employee(109l, 7416308671l, "Lalan Kumar Verma","20-05-1993"));
   	 empList.add(new Employee(1010l, 7416318674l, "Rajiv Kumar Verma","20-05-1993"));
   	 empList.add(new Employee(108l, 7416308679l, "Sanoj Kumar","20-05-1993"));
   	 empList.add(new Employee(109l, 7416308671l, "Lalan Kumar Verma","20-05-1993"));
   	 empList.add(new Employee(1010l, 7416318674l, "Rajiv Kumar Verma","20-05-1993"));
   	 return empList;
    }
}
