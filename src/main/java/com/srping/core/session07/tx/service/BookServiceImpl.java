package com.srping.core.session07.tx.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.srping.core.session07.tx.dao.BookDao;
import com.srping.core.session07.tx.exception.InsufficientAmount;
import com.srping.core.session07.tx.exception.InsufficientQuantity;

public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;

	@Override
	public void buyOne(Integer wid, Integer bid) throws InsufficientAmount, InsufficientQuantity {
		// 減去一本庫存
		bookDao.updateStock(bid, 1);
		// 取得書籍價格
		Integer price = bookDao.getPrice(bid);
		// 減去錢包裡的錢
		bookDao.updateWallet(wid, price);
	}

	@Override
	public void buyMany(Integer wid, Integer... bids) throws InsufficientAmount, InsufficientQuantity {
		for (Integer bid : bids)
			buyOne(wid, bid);
	}

}
