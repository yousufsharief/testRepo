package com.exception;

public class MYException extends Exception{
	String str;
	MYException(){
		
	}
	public MYException(String msg){
		super();
		this.str=msg;
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MYException"+str;
	}

}
