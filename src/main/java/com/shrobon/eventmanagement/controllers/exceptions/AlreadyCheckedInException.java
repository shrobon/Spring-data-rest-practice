package com.shrobon.eventmanagement.controllers.exceptions;

import java.util.function.Supplier;

public class AlreadyCheckedInException extends RuntimeException implements Supplier {

	@Override
	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}

}
