package pl.wsb.fitnesstracker.event;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.wsb.fitnesstracker.user.internal.User;

@Entity
@Table(name = "user_events")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Event event;

    // Konstruktor dla testu
    public UserEvent(User user, Event event) {
        this.user = user;
        this.event = event;
    }
}