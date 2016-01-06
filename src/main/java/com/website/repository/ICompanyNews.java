package com.website.repository;

import com.website.domain.CompanyIntroduce;
import com.website.domain.CompanyNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by chenyubao on 16/1/6.
 */
@Repository
public interface ICompanyNews extends JpaRepository<CompanyNews, Long>, JpaSpecificationExecutor<CompanyNews> {
}
