package com.cheap.ehealth.model.measure;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by grarky on 16.05.2016.
 */
@Entity
@Table(name = "blood_pressure_measure")

@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode
public class BloodPressureMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    private Long id;

    @Column @Getter @Setter
    private LocalDateTime measureTime;

    @Column @Getter @Setter
    private Integer pressureSystolic;

    @Column @Getter @Setter
    private Integer pressureDiastolic;

    @Column @Getter @Setter
    private Integer pressurePulse;

}
