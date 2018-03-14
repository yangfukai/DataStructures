package com.james.data.structures.queue;

public class QueueEmptyException extends RuntimeException {

	private static final long serialVersionUID = -4539234243759453142L;

	public QueueEmptyException(String err) {
		super(err);
	}	
}
