package com.website.controller;

import com.website.domain.Category;
import com.website.domain.JoinRequest;
import com.website.domain.Product;
import com.website.service.CategoryService;
import com.website.service.JoinRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyubao on 15/12/20.
 */
@Controller
@RequestMapping("/joinrequest")
public class JoinRequestController {
    @Autowired
    private JoinRequestService joinRequestService;

    @ResponseBody
    @RequestMapping(value = "/getJoinRequestList/{page}", method = RequestMethod.GET)
    public List<JoinRequest> getJoinRequestList(@PathVariable("page") int pageNo){
        List<JoinRequest> joinRequestList = joinRequestService.findJoinRequestList(pageNo);
        return joinRequestList;
    }

    @ResponseBody
    @RequestMapping(value = "/getJoinRequestById/{id}", method = RequestMethod.GET)
    public JoinRequest getJoinRequestById(@PathVariable("id") long id){
        return joinRequestService.findJoinRequestById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/getJoinRequestByName/{name}", method = RequestMethod.GET)
    public List<JoinRequest> getJoinRequestById(@PathVariable("name") String name){
        return joinRequestService.findJoinRequestByName(name);
    }

    @ResponseBody
    @RequestMapping(value = "/addJoinRequest", method = RequestMethod.POST)
    public JoinRequest addJoinRequest(@ModelAttribute JoinRequest joinRequest){
        return joinRequestService.addJoinRequest(joinRequest);
    }

    @ResponseBody
    @RequestMapping(value = "/updateJoinRequest", method = RequestMethod.POST)
    public JoinRequest updateJoinRequest(@ModelAttribute JoinRequest joinRequest){
        return joinRequestService.updateJoinRequest(joinRequest);
    }

    @ResponseBody
    @RequestMapping(value = "/deleteJoinRequest", method = RequestMethod.GET)
    public JoinRequest deleteJoinRequest(@PathVariable("id") long id){
        return joinRequestService.deleteJoinRequest(id);
    }
}
