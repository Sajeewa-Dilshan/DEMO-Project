package com.example.demo1.model.mockController;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtvRegPostprovisionCallback {

    public Long groupId;

    public int orderId;
    public List<DtvRegPostprovisionCallbackAttribute> dtvRegPostprovisionCallbackAttributes;

}
