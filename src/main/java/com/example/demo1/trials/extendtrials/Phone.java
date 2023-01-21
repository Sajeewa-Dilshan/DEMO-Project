package com.example.demo1.trials.extendtrials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public  class Phone {
    private String screen;
    private String camera;
}
