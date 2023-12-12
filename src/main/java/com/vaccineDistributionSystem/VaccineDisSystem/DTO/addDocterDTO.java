package com.vaccineDistributionSystem.VaccineDisSystem.DTO;
import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class addDocterDTO {

    String docName;

    String docDegree;

    int vcId;

    int patCount;

}
