package pl.wsb.fitnesstracker.event;

// TODO: Define the Event entity with appropriate fields and annotations

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "event")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private LocalDateTime startDate;
    private String location;

    // Konstruktor dla testu (bez ID)
    public Event(String name, LocalDateTime startDate, String location) {
        this.name = name;
        this.startDate = startDate;
        this.location = location;
    }
}
