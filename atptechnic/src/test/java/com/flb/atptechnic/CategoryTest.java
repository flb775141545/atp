package com.flb.atptechnic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.flb.atptechnic.dao.CategoryDao;
import com.flb.atptechnic.model.Category;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class CategoryTest
{
	@Autowired
	private CategoryDao categoryDao;
	
	@Test
	public void insertCategory(){
		Category category = new Category();
		category.setName("油壶");
		category.setCode("youhu");
		category.setParentId(0L);
		
		categoryDao.insert(category);
	}
	
	@Test
	public void selectCategory(){
		Map<String, Object> params = new HashMap<String, Object>();
		List<Category> categories = categoryDao.query(params);
		
		for(Category category : categories){
			System.out.println(category.getName());
		}
	}
}
