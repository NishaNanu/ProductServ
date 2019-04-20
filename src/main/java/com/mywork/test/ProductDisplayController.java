package com.mywork.test;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class ProductDisplayController {
	
	@RequestMapping("/getProducts")
	public List<Products> getProductDisplay(){
		
		return Collections.singletonList(new Products("P01","Threeseater-sofa","Brown","This is a three seatersofa for a family"));

	}
	
	/*public List<Rating> getRatingForProduct(){
		
	}*/

}
