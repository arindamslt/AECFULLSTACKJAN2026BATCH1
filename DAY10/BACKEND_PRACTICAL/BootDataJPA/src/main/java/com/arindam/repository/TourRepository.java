package com.arindam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arindam.model.Tour;
@Repository // CREATE THE OBJECT+DATABASE OPERATION
public interface TourRepository extends JpaRepository<Tour,String> {
     @Query(
    		 nativeQuery = true,
    		 value="select * from tour where tourcost>:ecost"
    		 )
	public List<Tour> getCostDetails(@Param("ecost") Double ecost);	
}
