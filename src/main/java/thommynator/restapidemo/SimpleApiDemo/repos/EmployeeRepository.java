package thommynator.restapidemo.SimpleApiDemo.repos;

import org.springframework.data.repository.CrudRepository;
import thommynator.restapidemo.SimpleApiDemo.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
