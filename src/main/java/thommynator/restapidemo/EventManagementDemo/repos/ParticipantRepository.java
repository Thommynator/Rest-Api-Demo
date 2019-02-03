package thommynator.restapidemo.EventManagementDemo.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import thommynator.restapidemo.EventManagementDemo.entities.Participant;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
}
