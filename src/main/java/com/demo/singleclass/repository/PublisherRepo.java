package com.demo.singleclass.repository;

import com.demo.singleclass.model.SingleTable.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface PublisherRepo extends JpaRepository<Publisher, Integer> {
}