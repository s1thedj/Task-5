package hiber.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;

   @Column(name = "email")
   private String email;

   public User(String firstName, String lastName, String email, Car car) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.car = car;
   }

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "car_id", referencedColumnName = "id")
   private Car car;

}
