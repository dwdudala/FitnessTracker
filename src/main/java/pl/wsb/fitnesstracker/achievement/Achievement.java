package pl.wsb.fitnesstracker.achievement;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.wsb.fitnesstracker.user.internal.User;
import java.time.LocalDateTime;

@Entity
@Table(name = "achievements")
@Getter // <--- Dopisujesz to
@Setter // <--- Dopisujesz to
@NoArgsConstructor // <--- Dopisujesz to (zastępuje pusty konstruktor)
public class Achievement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDateTime earnedAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Achievement(String name, LocalDateTime earnedAt, User user) {
        this.name = name;
        this.earnedAt = earnedAt;
        this.user = user;
    }
}