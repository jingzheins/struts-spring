package com.iscc.action;

import java.util.List;

import com.iscc.bean.Category;

public class CategoryAction {
	private Category category;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	public String show(){
		category = new Category();
		category.setName("iphone7");
		System.out.println("已经跳到action");
		return "show";
	}

}
