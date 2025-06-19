package lucas.mayrink.springsecurity.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long roleId;

    private String name;
}
