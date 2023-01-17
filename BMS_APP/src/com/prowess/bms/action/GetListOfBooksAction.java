package com.prowess.bms.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.prowess.bms.dao.BookDAO;
import com.prowess.bms.interfaces.BookInterface;
import com.prowess.bms.vo.BookVO;

public class GetListOfBooksAction {

	public void getListOfBooks() {
		List<BookVO> listOfBooks = new ArrayList<>();
		BookInterface bi = new BookDAO();
		listOfBooks = bi.getAllBookDetails();
		
		Iterator<BookVO> itr = listOfBooks.iterator();
		System.out.println("Available Books: ");
		while (itr.hasNext()) {

			BookVO bookVO = itr.next();

			System.out.println(bookVO.getBookId() + " -- " + bookVO.getBookName() + " -- " + bookVO.getPublishYear()

					+ " -- " + bookVO.getBookAuthor() + " -- " + bookVO.getBookPrice() + " -- " + bookVO.getCity()

					+ " -- " + bookVO.getGenere() + " -- " + bookVO.getInStock() + " -- " + bookVO.getIsActive() + " -- "

					+ bookVO.getCreated() + " -- " + bookVO.getCreatedBy());

		}

	}
}
