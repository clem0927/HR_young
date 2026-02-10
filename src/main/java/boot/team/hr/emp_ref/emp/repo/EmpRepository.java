package boot.team.hr.emp_ref.emp.repo;

import boot.team.hr.emp_ref.emp.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmpRepository extends JpaRepository<Emp,String> {
    Optional<Emp> findByEmail(String email);
    List<Emp> findByDept_DeptNo(Integer deptNo);
    Optional<Emp> findByEmpId(String empId);
    List<Emp> findByEmpIdIn(List<String> empIds);
}