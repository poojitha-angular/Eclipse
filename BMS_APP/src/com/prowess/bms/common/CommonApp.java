package com.prowess.bms.common;

import java.util.Scanner;

import com.prowess.bms.action.DeleteBookAction;
import com.prowess.bms.action.GetListOfBooksAction;
import com.prowess.bms.action.RegisterBookAction;
import com.prowess.bms.action.SearchAction;
import com.prowess.bms.action.UpdateBookAction;

public class CommonApp {

	public void getInputDetails() {
		UpdateBookAction ua=new UpdateBookAction();
		RegisterBookAction rba = new RegisterBookAction();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please select the Menu :");
		System.out.println("1.Registration");
		System.out.println("2.List of books");
		System.out.println("3.Search");
		System.out.println("4.Delete");
		System.out.println("5.Update");
		System.out.println("6.Bulk Insert");

		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			
			rba.getRegistration();
			break;
		case 2:
			GetListOfBooksAction glb = new GetListOfBooksAction();
			glb.getListOfBooks();
			break;
		case 3:
			SearchAction sa = new SearchAction();
			sa.searchDetail();
			break;
		case 4:
			DeleteBookAction db = new DeleteBookAction();
			System.out.println("Please enter the BookID");
			
			db.actionDelete(sc.nextInt());
			break;
		case 5:
			System.out.println("Choose update options");
			System.out.println("1.Update city based on book_id");
			System.out.println("2.Update the price with discount");
			int i=sc.nextInt();
			switch(i) {
			case 1:
		    
			System.out.println("Enter your BOOK_ID");
			ua.updateRecord(sc.nextInt());
			break;
			case 2:
			ua. updateBookPriceWithDiscount();
			}
		

		}
	}

	public static void main(String[] args) {
		CommonApp ca=new CommonApp();
		ca.getInputDetails();
	}
}
