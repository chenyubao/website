package com.website.service;

import com.website.domain.CompanyContacts;
import com.website.repository.ICompanyContacts;
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
public class CompanyContactsService {

    @Autowired
    private ICompanyContacts ccRepository;

    public List<CompanyContacts> findCompanyContactsList(int pageNo) {
        return ccRepository.findAll(new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public CompanyContacts findCompanyContactsById(long id) {
        return ccRepository.findOne(id);
    }

    public CompanyContacts addCC(CompanyContacts attractInvestment) {
        return ccRepository.save(attractInvestment);
    }

    public CompanyContacts updateCC(CompanyContacts attractInvestment) {
        return ccRepository.save(attractInvestment);
    }

    public CompanyContacts deleteCC(long id) {
        CompanyContacts cn = ccRepository.findOne(id);
        if (cn != null){
            ccRepository.delete(id);
        }
        return cn;
    }
}
