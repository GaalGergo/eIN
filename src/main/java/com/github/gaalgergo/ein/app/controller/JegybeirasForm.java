package com.github.gaalgergo.ein.app.controller;

import com.github.gaalgergo.ein.app.entity.JegybeirasEntity;
import lombok.Data;

@Data
public class JegybeirasForm {
    private JegybeirasEntity jegybeirasEntity;
    private Long tanuloId;
    private Long tantargyId;
}
