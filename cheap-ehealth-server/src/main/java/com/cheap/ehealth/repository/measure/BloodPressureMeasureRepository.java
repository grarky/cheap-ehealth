package com.cheap.ehealth.repository.measure;

import com.cheap.ehealth.model.measure.BloodPressureMeasure;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by grarky on 16.05.2016.
 */
@Repository
public interface BloodPressureMeasureRepository extends JpaRepository<BloodPressureMeasure, Long> {
}
