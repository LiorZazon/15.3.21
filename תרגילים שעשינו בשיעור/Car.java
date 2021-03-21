package com.company;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Car {

    protected Integer m_Id;
    protected String m_model;

    public Car(Integer m_Id, String m_model) {
        this.m_Id = m_Id;
        this.m_model = m_model;
    }
}
