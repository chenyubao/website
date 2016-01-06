package com.website.controller;

import com.website.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyubao on 15/12/20.
 */
@Controller
public class CompanyNewsController {
    @ResponseBody
    @RequestMapping(value = "/getProductList/{page}", method = RequestMethod.GET)
    public List<Product> getProductList(@PathVariable("page") int pageNo){
        List<Product> productList = new ArrayList<Product>();
        Product product = new Product();
        product.setName("test");
        product.setCategoryId(12);
        product.setImageUrl("/image/test");
        productList.add(product);
        return productList;
    }
}
