package com.prowess.bms.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.prowess.bms.dao.BookDAO;
import com.prowess.bms.interfaces.BookInterface;
import com.prowess.bms.vo.BookVO;

public class SearchAction {

	public void searchDetail() {
		BookVO bvo;
		ArrayList<BookVO> booklist;
		Iterator<BookVO> itr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your search option");
		System.out.println("1.search ByID");
		System.out.println("2.Search your book by Author: ");
		System.out.println("3.Check whether the book is Active or not : ");
		System.out.println("4.Check Whether the book stock available or not :");
		System.out.println("5.Search your book by City: ");
		System.out.println("6.Search your book by Price in between : ");
		System.out.println("7.Search your book by Genre: ");

		int choice = sc.nextInt();
		BookInterface bi = new BookDAO();
		switch (choice)

		{
		case 1:
			System.out.println("Enter Book ID");
			bvo = bi.searchByID(sc.nextInt());
			System.out.println(bvo.getBookId() + " -- " + bvo.getBookName() + " -- " + bvo.getBookAuthor() + " -- "
					+ bvo.getGenere());
			break;
		case 2:
			System.out.println("Enter Book Author name");
			String name = sc.next();

			booklist = bi.searchByAuthor(name);
			itr = booklist.iterator();
			while (itr.hasNext()) {

				bvo = itr.next();
				System.out.println("Available Books: ");
				System.out.println(bvo.getBookName());

			}
			break;
		case 3:
			System.out.println("Enter Active status:(yes/no): ");
			String active_status = sc.next();
			booklist = bi.searchBookByActive(active_status);
			itr = booklist.iterator();
			while (itr.hasNext()) {

				bvo = itr.next();

				System.out.println(bvo.getBookId() + " -- " + bvo.getBookName() + " -- " + bvo.getPublishYear() + " -- "
						+ bvo.getBookAuthor() + " -- " + bvo.getBookPrice());

			}
			break;
		case 4:
			System.out.println("Search for the stock availability :(true/false)");
			Boolean in_stock = sc.nextBoolean();
			booklist = bi.searchBookByItsStock(in_stock);
			itr = booklist.iterator();
			while (itr.hasNext()) {
				bvo = itr.next();
				System.out.println(bvo.getBookId() + " -- " + bvo.getBookName() + " -- " + bvo.getPublishYear() + " -- "
						+ bvo.getBookAuthor() + " -- " +  bvo.getBookPrice());
			}
			break;
		case 5:
			System.out.println("Search books based on city:");
			String city = sc.next();
			booklist = bi.searchBookByCity(city);
			itr = booklist.iterator();
			while (itr.hasNext()) {
				bvo = itr.next();
				System.out.println(bvo.getBookId() + " -- " + bvo.getBookName() + " -- " + bvo.getPublishYear() + " -- "
						+ bvo.getBookAuthor() + " -- " + bvo.getBookPrice());
			}
			break;
		case 6:
			System.out.println("Search books based on price:");
			float start_price = sc.nextFloat();
			float end_price=sc.nextFloat();
			booklist = bi.searchBookByPriceInBetween(start_price,end_price);
			Collections.sort(booklist, new PriceComparator());
			itr = booklist.iterator();
			while (itr.hasNext()) {
				bvo = itr.next();
				System.out.println(bvo.getBookId() + " -- " + bvo.getBookName() + " -- " + bvo.getPublishYear() + " -- "
						+ bvo.getBookAuthor() + " -- " +  bvo.getBookPrice());
			}
			break;
		case 7:
			System.out.println("Search books based on Genre:");
			String genre = sc.next();
			booklist = bi.searchBookByGenere(genre);
			itr = booklist.iterator();
			while (itr.hasNext()) {
				bvo = itr.next();
				System.out.println(bvo.getBookId() + " -- " + bvo.getBookName() + " -- " + bvo.getPublishYear() + " -- "
						+ bvo.getBookAuthor() + " -- " + + bvo.getBookPrice());
			}
		}

	}
}
