package boot.team.hr.emp_ref.dept.repo;

import boot.team.hr.emp_ref.dept.entity.DeptHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeptHistoryRepository extends JpaRepository<DeptHistory,Long>{
    List<DeptHistory> findByDeptNoOrderByCreatedAtDesc(Integer deptNo);
}
