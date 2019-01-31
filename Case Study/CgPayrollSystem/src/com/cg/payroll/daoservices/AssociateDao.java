package com.cg.payroll.daoservices;
import com.cg.payroll.beans.Associate;
import java.util.List;
public interface AssociateDao {
Associate save(Associate associate);
boolean update(Associate associate);
Associate findOne(int associateId);
List<Associate> findAll();
}
