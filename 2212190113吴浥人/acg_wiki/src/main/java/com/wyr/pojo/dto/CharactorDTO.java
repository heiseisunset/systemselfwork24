package com.wyr.pojo.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public class CharactorDTO {

    private Integer chaId;

    public Integer getChaId() {
        return chaId;
    }

    public void setChaId(Integer chaId) {
        this.chaId = chaId;
    }


    private String chaHeader;

    private String chaTypes;

    private String chaRows;

    public String getChaHeader() {
        return chaHeader;
    }

    public void setChaHeader(String chaHeader) {
        this.chaHeader = chaHeader;
    }

    public String getChaTypes() {
        return chaTypes;
    }

    public void setChaTypes(String chaTypes) {
        this.chaTypes = chaTypes;
    }

    public String getChaRows() {
        return chaRows;
    }

    public void setChaRows(String chaRows) {
        this.chaRows = chaRows;
    }

    @Override
    public String toString() {
        return "CharactorDTO{" +
                "chaId=" + chaId +
                ", chaHeader='" + chaHeader + '\'' +
                ", chaTypes='" + chaTypes + '\'' +
                ", chaRows='" + chaRows + '\'' +
                '}';
    }
}
