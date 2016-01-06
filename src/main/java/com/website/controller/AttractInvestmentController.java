package com.website.controller;

import com.website.domain.AttractInvestment;
import com.website.domain.Product;
import com.website.service.AttractInvestmentService;
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
@RequestMapping("/attractInvestment")
public class AttractInvestmentController {

    @Autowired
    private AttractInvestmentService attractInvestmentService;

    @ResponseBody
    @RequestMapping(value = "/getAttractInvestmentList/{page}", method = RequestMethod.GET)
    public List<AttractInvestment> getAttractInvestmentList(@PathVariable("page") int pageNo){
        List<AttractInvestment> attractInvestmentList = attractInvestmentService.findAttractInvestmentList(pageNo);
        return attractInvestmentList;
    }

    @ResponseBody
    @RequestMapping(value = "/getAttractInvestmentList/{id}", method = RequestMethod.GET)
    public AttractInvestment getAttractInvestmentById(@PathVariable("id") long id){
        return attractInvestmentService.findAttractInvestmentById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/addAttractInvestment", method = RequestMethod.POST)
    public AttractInvestment addAttractInvestment(AttractInvestment attractInvestment){
        return attractInvestmentService.addAI(attractInvestment);
    }

    @ResponseBody
    @RequestMapping(value = "/updateAttractInvestment", method = RequestMethod.POST)
    public AttractInvestment updateAttractInvestment(AttractInvestment attractInvestment){
        return attractInvestmentService.updateAI(attractInvestment);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteAttractInvestment/{id}", method = RequestMethod.GET)
    public AttractInvestment deleteAttractInvestment(long id){
        return attractInvestmentService.deleteAI(id);
    }
}
