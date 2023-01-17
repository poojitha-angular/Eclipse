package com.prowess.bms.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.prowess.bms.common.CC;
import com.prowess.bms.dao.BookDAO;
import com.prowess.bms.interfaces.BookInterface;
import com.prowess.bms.vo.BookVO;

public class RegisterBookAction {

	public void getRegistration() {

		BookVO bk = new BookVO();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Id");
		int id = sc.nextInt();
		bk.setBookId(id);

		BookInterface bi = new BookDAO();
		if (bi.isIDexistsOrNot(id)) {
			System.out.println("Already Exists");
		} else {
			System.out.println("Enter Book name");
			String bName = sc.next();
			bk.setBookName(bName);

			System.out.println("Enter publish year");
			int year = sc.nextInt();
			bk.setPublishYear(year);
			System.out.println("Enter Author name");
			String aName = sc.next();
			bk.setBookAuthor(aName);

			System.out.println("Enter Book price");
			float price = sc.nextFloat();
			bk.setBookPrice(price);

			System.out.println("Enter City");
			String city = sc.next();
			bk.setCity(city);

			System.out.println("Enter Genre");
			String genre = sc.next();
			bk.setGenere(genre);

			System.out.println("Please check whether the stock available or not:True/False ");
			boolean stock_available = sc.nextBoolean();
			bk.setInStock(stock_available);

			System.out.println("Please check availability of book:");
			String isactive = sc.next();
			bk.setIsActive(isactive);

			bk.setCreatedBy(CC.CREATED_BY);
			
			System.out.println("Enter the image path:");
			String file_path=sc.next();
			bk.setFilePath(file_path);
			
			bi.registerBookintoDB(bk);

		}

	}

	
}
