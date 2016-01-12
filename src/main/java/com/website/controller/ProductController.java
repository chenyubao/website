package com.website.controller;

import com.website.domain.Product;
import com.website.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyubao on 15/12/20.
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @ResponseBody
    @RequestMapping(value = "/getAllProductList/{page}", method = RequestMethod.GET)
    public List<Product> getAllProductList(@PathVariable("page") int pageNo){
        List<Product> productList = productService.findProductListByPage(pageNo);
        return productList;
    }

    @ResponseBody
    @RequestMapping(value = "/getTotalPage", method = RequestMethod.GET)
    public long getTotalPage(){
        return productService.getTotalPage();
    }

    @ResponseBody
    @RequestMapping(value = "/getProductListByCategoryId/{id}/{page}", method = RequestMethod.GET)
    public List<Product> getProductListByCategoryId(@PathVariable("id") long categoryId,
                                                    @PathVariable("page") int pageNo){
        List<Product> productList = productService.findProductListByCategoryId(categoryId, pageNo);
        return productList;
    }

    @ResponseBody
    @RequestMapping(value = "/getProductListByCategoryName/{name}/{page}", method = RequestMethod.GET)
    public List<Product> getProductListByCategoryName(@PathVariable("name") String name,
                                                    @PathVariable("page") int pageNo){
        List<Product> productList = productService.findProductListByCategoryName(name, pageNo);
        return productList;
    }

    @ResponseBody
    @RequestMapping(value = "/getProductById/{id}/{page}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable("id") long id,
                                                    @PathVariable("page") int pageNo){
        Product product = productService.findProductById(id, pageNo);
        return product;
    }

    @ResponseBody
    @RequestMapping(value = "/getProductsByName/{name}/{page}", method = RequestMethod.GET)
    public List<Product> getProductsByName(@PathVariable("name") String name,
                                  @PathVariable("page") int pageNo){
        List<Product> product = productService.findProductsByName(name, pageNo);
        return product;
    }

    @ResponseBody
    @RequestMapping(value = "/getProductsByDescription/{desc}/{page}", method = RequestMethod.GET)
    public List<Product> getProductsByDescription(@PathVariable("desc") String desc,
                                           @PathVariable("page") int pageNo){
        List<Product> product = productService.findProductsByDesc(desc, pageNo);
        return product;
    }

    @ResponseBody
    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public Product addProduct(@ModelAttribute Product product){
        Product pro = productService.addProduct(product);
        return pro;
    }

    @ResponseBody
    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    public Product updateProduct(@ModelAttribute Product product){
        Product pro = productService.updateProduct(product);
        return pro;
    }

    @ResponseBody
    @RequestMapping(value = "/deleteProduct/{id}", method = RequestMethod.GET)
    public Product deleteProduct(@PathVariable("page") long id){
        Product product = productService.deleteProduct(id);
        return product;
    }
}
