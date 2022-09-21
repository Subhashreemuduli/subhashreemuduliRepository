package com.ivycomptech.euro;

import java.util.Objects;

public class Euro {
    int value;

    public Euro(int value) {
        this.value = value;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Euro euro = (Euro) o;
        return value == euro.value;
    }

    public int hashCode() {
        return Objects.hash(value);
    }
    public Euro sum(Euro euro){
        return new Euro( this.value+euro.value);
    }
}
