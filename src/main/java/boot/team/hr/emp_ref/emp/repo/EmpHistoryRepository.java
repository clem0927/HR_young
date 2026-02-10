package boot.team.hr.emp_ref.emp.repo;

import boot.team.hr.emp_ref.emp.entity.EmpHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmpHistoryRepository extends JpaRepository<EmpHistory,Long> {
    List<EmpHistory> findByEmpIdOrderByCreatedAtDesc(String empId);
}
