package com.srping.core.session07.tx.service;

import com.srping.core.session07.tx.exception.InsufficientAmount;
import com.srping.core.session07.tx.exception.InsufficientQuantity;

public interface BookService {

	void buyOne(Integer wid, Integer bid) throws InsufficientAmount, InsufficientQuantity;

	void buyMany(Integer wid, Integer... bids) throws InsufficientAmount, InsufficientQuantity;

}
