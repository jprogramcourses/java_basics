package com.exceptions.basic.examples.exceptions;

public class EuclidExceptions extends Exception {

    private static final long serialVersionUID = 1L;

    private int lineNumber;

    public EuclidExceptions() {
	super();
	this.lineNumber = -1;
    }

    public EuclidExceptions(String desc, int lineNumber) {
	super(desc);
	this.lineNumber = lineNumber;
    }

    public int getLineNumber() {
	return lineNumber;
    }

}
