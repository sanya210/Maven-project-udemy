package com.bharath.product.bo;
import com.bharath.product.dao.ProductDAO;

import com.bharath.product.dao.ProductDAOImpl;
import com.bharath.product.dto.Product;

public class ProductBOImpl implements ProductBO{
	private static ProductDAO dao = new ProductDAOImpl();


	public void create(Product product) {
		dao.create(product);
		
	}

	
	public Product findProduct(int id) {
		return dao.read(id);
	}
}
