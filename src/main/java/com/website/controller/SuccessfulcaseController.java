package com.website.controller;

import com.website.domain.Product;
import com.website.domain.Successfulcase;
import com.website.service.SuccessfulCaseService;
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
@RequestMapping("/successfulcase")
public class SuccessfulcaseController {

    @Autowired
    private SuccessfulCaseService successfulCaseService;

    @ResponseBody
    @RequestMapping(value = "/getSuccessfulcaseList/{page}", method = RequestMethod.GET)
    public List<Successfulcase> getSuccessfulcaseList(@PathVariable("page") int pageNo){
        List<Successfulcase> successfulcaseList = successfulCaseService.findSuccessfulcaseList(pageNo);
        return successfulcaseList;
    }

    @ResponseBody
    @RequestMapping(value = "/getSuccessfulcaseById/{id}", method = RequestMethod.GET)
    public Successfulcase getSuccessfulcaseById(@PathVariable("id") long id){
        return successfulCaseService.findSuccessfulcaseById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/addSuccessfulcase", method = RequestMethod.POST)
    public Successfulcase addSuccessfulcase(Successfulcase successfulcase){
        return successfulCaseService.addSuccessfulcase(successfulcase);
    }

    @ResponseBody
    @RequestMapping(value = "/updateSuccessfulcase", method = RequestMethod.POST)
    public Successfulcase updateSuccessfulcase(Successfulcase successfulcase){
        return successfulCaseService.updateSuccessfulcase(successfulcase);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteSuccessfulcase", method = RequestMethod.GET)
    public Successfulcase updateSuccessfulcase(@PathVariable("id") long id){
        return successfulCaseService.deleteSuccessfulcase(id);
    }
}
