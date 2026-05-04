package pl.wsb.fitnesstracker.event;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEventRepository extends JpaRepository<UserEvent, Long> {

    @Query("SELECT count(ue) FROM UserEvent ue WHERE ue.event.id = :eventId")
    long countParticipants(@Param("eventId") Long eventId);

}