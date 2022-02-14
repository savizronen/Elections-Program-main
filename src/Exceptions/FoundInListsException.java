package Exceptions;

public class FoundInListsException extends Exception {
	
	private static final long serialVersionUID = 5611813232149275794L;
	
	public FoundInListsException(String id) {
		super(id + " already Exists in Lists!");
	}
}
