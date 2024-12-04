package hiber.model;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Embeddable
@Table(name="user_cars")
public class Car {


    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column
    private int series;

    @Column
    private String model;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }
}
