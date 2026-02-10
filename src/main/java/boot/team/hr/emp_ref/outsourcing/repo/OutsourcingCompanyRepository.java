package boot.team.hr.emp_ref.outsourcing.repo;

import boot.team.hr.emp_ref.outsourcing.entity.OutsourcingCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OutsourcingCompanyRepository extends JpaRepository<OutsourcingCompany,Long> {
    void deleteByCompanyName(String companyName);
}
