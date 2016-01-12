package com.website.controller;

import com.website.domain.CompanyIntroduce;
import com.website.domain.CompanyNews;
import com.website.domain.Product;
import com.website.service.CompanyIntroduceService;
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
@RequestMapping("/companyIntroduce")
public class CompanyIntroduceController {

    @Autowired
    private CompanyIntroduceService companyNewsService;

    @ResponseBody
    @RequestMapping(value = "/getCompanyIntroduceList/{page}", method = RequestMethod.GET)
    public List<CompanyIntroduce> getCompanyIntroduceList(@PathVariable("page") int pageNo){
        List<CompanyIntroduce> companyNewsList = companyNewsService.findCompanyIntroduceList(pageNo);
        return companyNewsList;
    }

    @ResponseBody
    @RequestMapping(value = "/getCompanyIntroduceList/{id}", method = RequestMethod.GET)
    public CompanyIntroduce getCompanyIntroduceById(@PathVariable("id") long id){
        return companyNewsService.findCompanyIntroduceById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/addCompanyIntroduce", method = RequestMethod.POST)
    public CompanyIntroduce addCompanyIntroduce(CompanyIntroduce companyNews){
        return companyNewsService.addCI(companyNews);
    }

    @ResponseBody
    @RequestMapping(value = "/updateCompanyIntroduce", method = RequestMethod.POST)
    public CompanyIntroduce updateCompanyIntroduce(CompanyIntroduce companyNews){
        return companyNewsService.updateCI(companyNews);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteCompanyIntroduce/{id}", method = RequestMethod.GET)
    public CompanyIntroduce deleteCompanyIntroduce(long id){
        return companyNewsService.deleteCI(id);
    }
}
