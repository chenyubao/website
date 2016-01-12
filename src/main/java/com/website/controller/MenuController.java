package com.website.controller;

import com.website.domain.Category;
import com.website.domain.Menu;
import com.website.domain.Product;
import com.website.service.CategoryService;
import com.website.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyubao on 15/12/20.
 */
@Controller
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @ResponseBody
    @RequestMapping(value = "/getMenuList/{page}", method = RequestMethod.GET)
    public List<Menu> getMenuList(@PathVariable("page") int pageNo){
        return menuService.findMenuList(pageNo);
    }

    @ResponseBody
    @RequestMapping(value = "/getMenuById/{id}", method = RequestMethod.GET)
    public Menu getMenuById(@PathVariable("id") long id){
        return menuService.findMenuById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/getMenuByName/{name}", method = RequestMethod.GET)
    public List<Menu> getMenuById(@PathVariable("name") String name){
        return menuService.findMenuByName(name);
    }

    @ResponseBody
    @RequestMapping(value = "/addMenu", method = RequestMethod.POST)
    public Menu addMenu(@ModelAttribute Menu menu){
        return menuService.addMenu(menu);
    }

    @ResponseBody
    @RequestMapping(value = "/updateMenu", method = RequestMethod.POST)
    public Menu updateMenu(@ModelAttribute Menu menu){
        return menuService.updateMenu(menu);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteMenu", method = RequestMethod.GET)
    public Menu deleteMenu(@PathVariable("id") long id){
        return menuService.deleteMenu(id);
    }
}
