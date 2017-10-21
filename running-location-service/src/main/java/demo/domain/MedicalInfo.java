package demo.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MedicalInfo {

    private Long brf;

    private Long fmi;

    public MedicalInfo(){

    }

    public MedicalInfo(Long brf, Long fmi) {
        this.brf = brf;
        this.fmi = fmi;
    }
}
