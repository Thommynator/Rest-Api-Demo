package thommynator.restapidemo.EventManagementDemo.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import thommynator.restapidemo.EventManagementDemo.entities.Event;

public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
}
