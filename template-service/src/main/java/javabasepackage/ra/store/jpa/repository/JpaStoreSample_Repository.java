package javabasepackage.ra.store.jpa.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import javabasepackage.ra.store.jpa.jpo.JpaStoreSample_Jpo;

public interface JpaStoreSample_Repository extends PagingAndSortingRepository<JpaStoreSample_Jpo, String> {
	List<JpaStoreSample_Jpo> findByCondition(String condition);
}
