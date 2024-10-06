package com.wyr.pojo;

import jakarta.persistence.*;

@Table(name="tb_charater")
@Entity
public class Charactor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cha_Id")
    private Integer chaId;
    @Column(name = "cha_Header")
    private String chaHeader;
    @Column(name = "cha_Types")
    private String chaTypes;
    @Column(name = "cha_Rows")
    private String chaRows;

    @Override
    public String toString() {
        return "Character{" +
                "chaId=" + chaId +
                ", chaHeader='" + chaHeader + '\'' +
                ", chaTypes='" + chaTypes + '\'' +
                ", chaRows='" + chaRows + '\'' +
                '}';
    }

    public Integer getChaId() {
        return chaId;
    }

    public void setChaId(Integer chaId) {
        this.chaId = chaId;
    }

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
}
