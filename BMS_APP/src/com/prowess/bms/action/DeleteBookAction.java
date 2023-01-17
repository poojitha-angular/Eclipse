package com.prowess.bms.action;

import com.prowess.bms.dao.BookDAO;
import com.prowess.bms.interfaces.BookInterface;

public class DeleteBookAction {

	public void actionDelete(int i) {
	BookInterface bi=new BookDAO();
	bi.recordsDeletion(i);
	if(i==0) {
		System.out.println("Record does not existed for deletion");
	}
	else
		System.out.println("Record deleted Successfully");
		
	}

}
