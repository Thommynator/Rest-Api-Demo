package thommynator.restapidemo.repos;

import org.springframework.data.repository.CrudRepository;
import thommynator.restapidemo.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
