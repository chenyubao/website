package com.website.service;

import com.website.domain.AttractInvestment;
import com.website.repository.IAttractInvestment;
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
public class AttractInvestmentService {

    @Autowired
    private IAttractInvestment aiRepository;

    public List<AttractInvestment> findAttractInvestmentList(int pageNo) {
        return aiRepository.findAll(new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public AttractInvestment findAttractInvestmentById(long id) {
        return aiRepository.findOne(id);
    }

    public AttractInvestment addAI(AttractInvestment attractInvestment) {
        return aiRepository.save(attractInvestment);
    }

    public AttractInvestment updateAI(AttractInvestment attractInvestment) {
        return aiRepository.save(attractInvestment);
    }

    public AttractInvestment deleteAI(long id) {
        AttractInvestment ai = aiRepository.findOne(id);
        if (ai != null){
            aiRepository.delete(id);
        }
        return ai;
    }
}
