package boot.team.hr.emp_ref.dept.repo;

import boot.team.hr.emp_ref.dept.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeptRepository extends JpaRepository<Dept,Integer> {

}