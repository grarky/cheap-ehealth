package com.cheap.ehealth.service.measure;

import com.cheap.ehealth.model.measure.BloodPressureMeasure;
import com.cheap.ehealth.repository.measure.BloodPressureMeasureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by grarky on 16.05.2016.
 */
@Service
@Transactional
public class BloodPressureMeasureService {

    private BloodPressureMeasureRepository bloodPressureMeasureRepository;

    @Autowired
    public BloodPressureMeasureService(BloodPressureMeasureRepository bloodPressureMeasureRepository) {
        this.bloodPressureMeasureRepository = bloodPressureMeasureRepository;
    }

    public BloodPressureMeasure addBloodPressureMeasure(BloodPressureMeasure bloodPressureMeasure) {
        return bloodPressureMeasureRepository.save(bloodPressureMeasure);
    }

    public void deleteBloodPressureMeasure(Long id) {
        if (bloodPressureMeasureRepository.exists(id)) {
            bloodPressureMeasureRepository.delete(id);
        }
    }

    public List<BloodPressureMeasure> getBloodPressureMeasures() {
        return bloodPressureMeasureRepository.findAll();
    }
}
