package com.prowess.bms.action;

import java.util.Scanner;

import com.prowess.bms.dao.BookDAO;
import com.prowess.bms.interfaces.BookInterface;

public class UpdateBookAction {
	BookInterface bi = new BookDAO();
	Scanner sc = new Scanner(System.in);

	public void updateRecord(int book_id) {

		if (bi.isIDexistsOrNot(book_id)) {
			System.out.println("Record exists enter the city to be updated");
			String city = sc.next();
			int i = bi.updateCity(city, book_id);
			if (i == 1) {
				System.out.println("Record was updated with " + city + " for Book: " + book_id);
			} else
				System.out.println("NO record found to update");

		}
	}

	public void updateBookPriceWithDiscount() {
		System.out.println("Enter Book Id: ");
		int book_id=sc.nextInt();
		System.out.println("Enter Book discount: ");
		int discount=sc.nextInt();

		float new_price=bi.updatePriceByDiscount(book_id, discount);
		
		System.out.println("New_price: " +new_price);

	}

}
