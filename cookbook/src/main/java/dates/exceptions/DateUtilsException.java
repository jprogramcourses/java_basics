package dates.exceptions;

public class DateUtilsException extends Exception {

    private int lineNumber;

    DateUtilsException() {
	super();
	this.lineNumber = -1;
    }

    DateUtilsException(String desc, int lineNumber) {
	super(desc);
	this.lineNumber = lineNumber;
    }

    public int getLineNumber() {
	return lineNumber;
    }

}
