package com.example.demo1.trials.objectmapper.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PostProvisionCallbackCharacteristic implements Serializable {
    private String name;
    private String value;

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof PostProvisionCallbackCharacteristic)) {
            return false;
        } else {
            PostProvisionCallbackCharacteristic other = (PostProvisionCallbackCharacteristic)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$name = this.getName();
                Object other$name = other.getName();
                if (this$name == null) {
                    if (other$name != null) {
                        return false;
                    }
                } else if (!this$name.equals(other$name)) {
                    return false;
                }

                Object this$value = this.getValue();
                Object other$value = other.getValue();
                if (this$value == null) {
                    if (other$value != null) {
                        return false;
                    }
                } else if (!this$value.equals(other$value)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof PostProvisionCallbackCharacteristic;
    }


    public String toString() {
        return "PostProvisionCallbackCharacteristic(name=" + this.getName() + ", value=" + this.getValue() + ")";
    }

    public PostProvisionCallbackCharacteristic(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public PostProvisionCallbackCharacteristic() {
    }
}