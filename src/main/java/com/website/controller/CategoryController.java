package com.website.controller;

import com.website.domain.Category;
import com.website.domain.Product;
import com.website.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyubao on 15/12/20.
 */
@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @ResponseBody
    @RequestMapping(value = "/getCategoryList/{page}", method = RequestMethod.GET)
    public List<Category> getCategoryList(@PathVariable("page") int pageNo){
        List<Category> categoryList = categoryService.findCategoryList(pageNo);
        return categoryList;
    }

    @ResponseBody
    @RequestMapping(value = "/getCategoryById/{id}", method = RequestMethod.GET)
    public Category getCategoryById(@PathVariable("id") long id){
        return categoryService.findCategoryById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/getCategoryByName/{name}", method = RequestMethod.GET)
    public List<Category> getCategoryById(@PathVariable("name") String name){
        return categoryService.findCategoryByName(name);
    }

    @ResponseBody
    @RequestMapping(value = "/addCategory", method = RequestMethod.POST)
    public Category addCategory(@ModelAttribute Category category){
        return categoryService.addCategory(category);
    }

    @ResponseBody
    @RequestMapping(value = "/updateCategory", method = RequestMethod.POST)
    public Category updateCategory(@ModelAttribute Category category){
        return categoryService.updateCategory(category);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteCategory", method = RequestMethod.GET)
    public Category deleteCategory(@PathVariable("id") long id){
        return categoryService.deleteCategory(id);
    }
}
