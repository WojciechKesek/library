package com.sda.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adress {

    private String string;
    private String buildingNo;
    private String apartmentNo;
    private String postalCode;

}
