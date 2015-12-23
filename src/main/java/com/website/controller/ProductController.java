package com.website.controller;

import com.website.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyubao on 15/12/20.
 */
@Controller
public class ProductController {
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
