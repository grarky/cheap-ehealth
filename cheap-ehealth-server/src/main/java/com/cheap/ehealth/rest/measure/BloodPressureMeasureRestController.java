package com.cheap.ehealth.rest.measure;

import com.cheap.ehealth.model.measure.BloodPressureMeasure;
import com.cheap.ehealth.service.measure.BloodPressureMeasureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import java.util.List;

/**
 * Created by grarky on 16.05.2016.
 */
@RestController("/measures/blood")
public class BloodPressureMeasureRestController {

    private BloodPressureMeasureService bloodPressureMeasureService;

    @Autowired
    public BloodPressureMeasureRestController(BloodPressureMeasureService bloodPressureMeasureService) {
        this.bloodPressureMeasureService = bloodPressureMeasureService;
    }

    @PUT
    @RequestMapping("/add")
    public ResponseEntity<BloodPressureMeasure> addBloodPressureMeasure(BloodPressureMeasure bloodPressureMeasure) {
        return ResponseEntity.ok(bloodPressureMeasureService.addBloodPressureMeasure(bloodPressureMeasure));
    }

    @GET
    @RequestMapping("/all")
    public ResponseEntity<List<BloodPressureMeasure>> getBloodPressureMeasures() {
        return ResponseEntity.ok(bloodPressureMeasureService.getBloodPressureMeasures());
    }

    @DELETE
    @RequestMapping("/delete")
    public ResponseEntity<Void> deleteBloodPressureMeasure(@RequestParam Long id) {
        bloodPressureMeasureService.deleteBloodPressureMeasure(id);
        return ResponseEntity.ok().build();
    }

}
