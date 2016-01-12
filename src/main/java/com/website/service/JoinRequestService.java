package com.website.service;

import com.website.domain.Category;
import com.website.domain.JoinRequest;
import com.website.repository.ICategory;
import com.website.repository.IJoinRequest;
import com.website.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by chenyubao on 16/1/6.
 */
@Service
@Transactional
public class JoinRequestService {

    @Autowired
    private IJoinRequest joinRequestRepository;

    public List<JoinRequest> findJoinRequestList(int pageNo) {
        return joinRequestRepository.findAll(new PageRequest(pageNo, Constant.PAGE_SIZE)).getContent();
    }

    public JoinRequest findJoinRequestById(long id) {
        return joinRequestRepository.findOne(id);
    }

    public List<JoinRequest> findJoinRequestByName(final String name) {
        return joinRequestRepository.findAll(new Specification<JoinRequest>() {
            @Override
            public Predicate toPredicate(Root<JoinRequest> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.like(root.get("name").as(String.class), name);
            }
        });
    }

    public JoinRequest updateJoinRequest(JoinRequest joinRequest) {
        if (joinRequest != null){
            return joinRequestRepository.save(joinRequest);
        }
        return null;
    }

    public JoinRequest deleteJoinRequest(long id) {
        JoinRequest joinRequest = joinRequestRepository.findOne(id);
        if (joinRequest != null){
            joinRequestRepository.delete(id);
        }
        return joinRequest;
    }

    public JoinRequest addJoinRequest(JoinRequest joinRequest) {
        if (joinRequest != null){
            return joinRequestRepository.save(joinRequest);
        }
        return null;
    }
}
