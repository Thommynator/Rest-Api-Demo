package thommynator.restapidemo.SimpleApiDemo.repos;

import org.springframework.data.repository.CrudRepository;
import thommynator.restapidemo.SimpleApiDemo.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Long> {
}
