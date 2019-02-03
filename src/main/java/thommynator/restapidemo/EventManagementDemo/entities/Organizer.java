package thommynator.restapidemo.EventManagementDemo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
public class Organizer extends AbstractEntity {
    private String name;
    @OneToMany(mappedBy = "organizer")
    private Set<Event> events;

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(id, ((Organizer) obj).id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}