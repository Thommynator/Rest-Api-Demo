package thommynator.restapidemo.EventManagementDemo.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import thommynator.restapidemo.EventManagementDemo.entities.Organizer;

public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {
}
