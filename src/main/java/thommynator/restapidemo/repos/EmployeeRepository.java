package thommynator.restapidemo.repos;

import org.springframework.data.repository.CrudRepository;
import thommynator.restapidemo.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
