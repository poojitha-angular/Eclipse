package com.prowess.bms.action;

import java.util.Comparator;

import com.prowess.bms.vo.BookVO;

public class PriceComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		BookVO bvo1=(BookVO)o1;
		BookVO bvo2=(BookVO)o2;
		if(bvo1.bookPrice== bvo2.bookPrice)
		return 0;
		else if(bvo1.bookPrice>bvo2.bookPrice) {
		 return 1;
	
		}
		else return -1;
		
	}

}
