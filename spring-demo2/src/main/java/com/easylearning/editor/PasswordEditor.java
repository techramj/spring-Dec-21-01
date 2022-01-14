package com.easylearning.editor;

import java.beans.PropertyEditorSupport;

import com.easylearning.model.Password;

public class PasswordEditor extends PropertyEditorSupport{
	
	@Override
	public String getAsText() {
		return "mysamplevaluee";
	}
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] arr=text.split("-");
		Password p = new Password(Integer.parseInt(arr[0]), arr[1], arr[2]);
		setValue(p);
	}

}
