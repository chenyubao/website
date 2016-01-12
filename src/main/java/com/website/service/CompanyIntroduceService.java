package com.website.service;

import com.website.domain.CompanyIntroduce;
import com.website.repository.ICompanyIntroduce;
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
public class CompanyIntroduceService {

    @Autowired
    private ICompanyIntroduce cnRepository;

    public List<CompanyIntroduce> findCompanyIntroduceList(int pageNo) {
        return cnRepository.findAll(new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public CompanyIntroduce findCompanyIntroduceById(long id) {
        return cnRepository.findOne(id);
    }

    public CompanyIntroduce addCI(CompanyIntroduce attractInvestment) {
        return cnRepository.save(attractInvestment);
    }

    public CompanyIntroduce updateCI(CompanyIntroduce attractInvestment) {
        return cnRepository.save(attractInvestment);
    }

    public CompanyIntroduce deleteCI(long id) {
        CompanyIntroduce cn = cnRepository.findOne(id);
        if (cn != null){
            cnRepository.delete(id);
        }
        return cn;
    }
}
