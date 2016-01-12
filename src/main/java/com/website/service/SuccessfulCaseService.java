package com.website.service;

import com.website.domain.AttractInvestment;
import com.website.domain.Successfulcase;
import com.website.repository.ISuccessfulcase;
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
public class SuccessfulCaseService {

    @Autowired
    private ISuccessfulcase isRepository;

    public List<Successfulcase> findSuccessfulcaseList(int pageNo) {
        return isRepository.findAll(new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public Successfulcase findSuccessfulcaseById(long id) {
        return isRepository.findOne(id);
    }

    public Successfulcase addSuccessfulcase(Successfulcase successfulcase) {
        return isRepository.save(successfulcase);
    }

    public Successfulcase updateSuccessfulcase(Successfulcase successfulcase) {
        return isRepository.save(successfulcase);
    }

    public Successfulcase deleteSuccessfulcase(long id) {
        Successfulcase ai = isRepository.findOne(id);
        if (ai != null){
            isRepository.delete(id);
        }
        return ai;
    }
}
