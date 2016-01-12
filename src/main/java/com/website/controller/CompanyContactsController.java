package com.website.controller;

import com.website.domain.CompanyContacts;
import com.website.domain.Product;
import com.website.service.CompanyContactsService;
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
@RequestMapping("/companyContacts")
public class CompanyContactsController {

    @Autowired
    private CompanyContactsService companyNewsService;

    @ResponseBody
    @RequestMapping(value = "/getCompanyContactsList/{page}", method = RequestMethod.GET)
    public List<CompanyContacts> getCompanyContactsList(@PathVariable("page") int pageNo){
        List<CompanyContacts> companyNewsList = companyNewsService.findCompanyContactsList(pageNo);
        return companyNewsList;
    }

    @ResponseBody
    @RequestMapping(value = "/getCompanyContactsList/{id}", method = RequestMethod.GET)
    public CompanyContacts getCompanyContactsById(@PathVariable("id") long id){
        return companyNewsService.findCompanyContactsById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/addCompanyContacts", method = RequestMethod.POST)
    public CompanyContacts addCompanyContacts(CompanyContacts companyNews){
        return companyNewsService.addCC(companyNews);
    }

    @ResponseBody
    @RequestMapping(value = "/updateCompanyContacts", method = RequestMethod.POST)
    public CompanyContacts updateCompanyContacts(CompanyContacts companyNews){
        return companyNewsService.updateCC(companyNews);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteCompanyContacts/{id}", method = RequestMethod.GET)
    public CompanyContacts deleteCompanyContacts(long id){
        return companyNewsService.deleteCC(id);
    }
}
