package io.github.leandrocvt.localization.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_city")
public class City {

    @Id
    @Column(name = "id_city")
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "population")
    private Long population;
}
