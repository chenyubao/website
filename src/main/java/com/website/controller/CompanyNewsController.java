package com.website.controller;

import com.website.domain.CompanyNews;
import com.website.domain.Product;
import com.website.service.CompanyNewsService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/companyNews")
public class CompanyNewsController {

    @Autowired
    private CompanyNewsService companyNewsService;

    @ResponseBody
    @RequestMapping(value = "/getCompanyNewsList/{page}", method = RequestMethod.GET)
    public List<CompanyNews> getCompanyNewsList(@PathVariable("page") int pageNo){
        List<CompanyNews> companyNewsList = companyNewsService.findCompanyNewsList(pageNo);
        return companyNewsList;
    }

    @ResponseBody
    @RequestMapping(value = "/getCompanyNewsList/{id}", method = RequestMethod.GET)
    public CompanyNews getCompanyNewsById(@PathVariable("id") long id){
        return companyNewsService.findCompanyNewsById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/addCompanyNews", method = RequestMethod.POST)
    public CompanyNews addCompanyNews(CompanyNews companyNews){
        return companyNewsService.addCN(companyNews);
    }

    @ResponseBody
    @RequestMapping(value = "/updateCompanyNews", method = RequestMethod.POST)
    public CompanyNews updateCompanyNews(CompanyNews companyNews){
        return companyNewsService.updateCN(companyNews);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteCompanyNews/{id}", method = RequestMethod.GET)
    public CompanyNews deleteCompanyNews(long id){
        return companyNewsService.deleteCN(id);
    }
}
