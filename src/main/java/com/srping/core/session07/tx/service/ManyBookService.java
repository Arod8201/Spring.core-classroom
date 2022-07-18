package com.srping.core.session07.tx.service;

import com.srping.core.session07.tx.exception.InsufficientAmount;
import com.srping.core.session07.tx.exception.InsufficientQuantity;

public interface ManyBookService {

	void buyMany(Integer wid, Integer... bids) throws InsufficientAmount, InsufficientQuantity;

}
