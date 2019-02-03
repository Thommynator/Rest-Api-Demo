package thommynator.restapidemo.EventManagementDemo.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import thommynator.restapidemo.EventManagementDemo.entities.Venue;

public interface VenueRepository extends PagingAndSortingRepository<Venue, Long> {
}

