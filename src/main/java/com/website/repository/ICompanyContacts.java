package com.website.repository;

import com.website.domain.Category;
import com.website.domain.CompanyContacts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chenyubao on 16/1/6.
 */
@Repository
public interface ICompanyContacts extends JpaRepository<CompanyContacts, Long>, JpaSpecificationExecutor<CompanyContacts> {
}
