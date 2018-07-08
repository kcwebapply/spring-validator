package com.example.validation.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.lang.annotation.Target;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "vin_list")
public class VinTable implements Serializable {

    @Id
    private String vin;
}
