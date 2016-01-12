package com.website.service;

import com.website.domain.CompanyNews;
import com.website.repository.ICompanyNews;
import com.website.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chenyubao on 16/1/6.
 */
@Service
@Transactional
public class CompanyNewsService {

    @Autowired
    private ICompanyNews cnRepository;

    public List<CompanyNews> findCompanyNewsList(int pageNo) {
        return cnRepository.findAll(new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public CompanyNews findCompanyNewsById(long id) {
        return cnRepository.findOne(id);
    }

    public CompanyNews addCN(CompanyNews attractInvestment) {
        return cnRepository.save(attractInvestment);
    }

    public CompanyNews updateCN(CompanyNews attractInvestment) {
        return cnRepository.save(attractInvestment);
    }

    public CompanyNews deleteCN(long id) {
        CompanyNews cn = cnRepository.findOne(id);
        if (cn != null){
            cnRepository.delete(id);
        }
        return cn;
    }
}
