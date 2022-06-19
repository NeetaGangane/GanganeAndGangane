package com.gangane.construction.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.gangane.construction.bean.LabourPayment;

public interface PaymentRepository extends CrudRepository<LabourPayment, Integer> {
	
/*	@Query("from LabourPayment l where l.id =:labourId and l.paymentDate between :startDate and :endDate order by paymentDate")
	public List<LabourPayment> findPaymentHistoryWithDateRange(@Param("labourId") Integer labourId,@Param("startDate") Date sDate,@Param("startDate") Date eDate);
*/
	
	//@Query("from LabourPayment l where l.id =:labourId order by paymentDate limit :lmt")
		
	//public List<LabourPayment> findPaymentHistorylastNRecords(@Param("labourId") Integer labourId,@Param("lmt") int limit);
	//@Query("from LabourPayment l where l.id =:labourId ")
	public List<LabourPayment> findLabourPaymentByLabourId(Integer labourId);
	
	/*@Query("from LabourPayment p where p.labourId =:labourId and p.paymentDate >:criteriaDate order by p.paymentDate")
	public List<LabourPayment> findPaymentHistoryFromCriteriaDate(@Param("labourId") Integer labourId,@Param("labourId") Date criteriaDate);
*/
}
