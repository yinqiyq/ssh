package com.how2java.action;

import java.util.List;

import com.how2java.pojo.Product;
import com.how2java.service.ProductService;
import org.apache.struts2.convention.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@Namespace("/")
@ParentPackage("struts-default")
@Results({@Result(name="listJsp", location="/list.jsp")})
public class ProductAction {

	@Autowired
	ProductService productService;
	List<Product> products;

	@Action("listProduct")
	public String list() {
		products = productService.list();
		return "listJsp";
	}


	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
