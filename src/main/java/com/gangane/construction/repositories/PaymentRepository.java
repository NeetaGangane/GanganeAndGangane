package com.gangane.construction.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gangane.construction.bean.LabourPayment;

public interface PaymentRepository extends CrudRepository<LabourPayment, Integer> {
	
	@Query("select * from labour_payment where labour_id =:labourId and payment_date between :startDate and :endDate order by payment_date")
	public List<LabourPayment> findPaymentHistoryWithDateRange(@Param("labourId") Integer labourId,@Param("startDate") Date sDate,@Param("startDate") Date eDate);

	
	@Query("select * from labour_payment where labour_id =:labourId order by payment_date limit :lmt")
	public List<LabourPayment> findPaymentHistorylastNRecords(@Param("labourId") Integer labourId,@Param("lmt") int limit);
	
	@Query("from LabourPayment p where p.labourId =:labourId and p.paymentDate >:criteriaDate order by p.paymentDate")
	public List<LabourPayment> findPaymentHistoryFromCriteriaDate(@Param("labourId") Integer labourId,@Param("labourId") Date criteriaDate);

}
