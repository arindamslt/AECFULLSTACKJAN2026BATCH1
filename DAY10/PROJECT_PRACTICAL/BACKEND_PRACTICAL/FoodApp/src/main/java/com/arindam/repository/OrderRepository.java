package com.arindam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arindam.model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order,Integer> {
	@Query(nativeQuery = true,
value="SELECT F.FID,F.FNAME,O.OID,O.OQTY,O.ODT,F.PRICE,F.PRICE*O.OQTY TOTALPRICE,O.UNAME FROM FOOD F,ORDER_DTLS O WHERE F.FID=O.FID AND O.UNAME=:uname"
					)
public List getBiilling(String uname);
}
